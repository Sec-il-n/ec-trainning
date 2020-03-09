package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Master;
import logic.arrayLogics;
import logic.getResultSerchDAO;


@WebServlet("/SerchServlet")
public class SerchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SerchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String inputword;
		List<Master> list=new ArrayList<Master>();
		inputword=request.getParameter("inputword");
		//daoで検索
		getResultSerchDAO logic=new getResultSerchDAO();
		list=logic.getResult(inputword);
		arrayLogics al=new arrayLogics();
		int i=al.getArrayLength(list);

		HttpSession session=request.getSession();
		session.setAttribute("result", list);

		String path="/WEB-INF/jsp/serchResult.jsp";
		RequestDispatcher dsp=request.getRequestDispatcher(path);
		dsp.forward(request, response);
		doGet(request, response);
	}

}
