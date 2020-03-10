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

import beans.IntoCart;
import logic.getConfirmedInfo;

@WebServlet("/ConfirmOrder")
public class ConfirmOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfirmOrder() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<IntoCart> cartList=new ArrayList<IntoCart>();
		HttpSession session=request.getSession();
		cartList=(List<IntoCart>) session.getAttribute("cartlist");
		getConfirmedInfo logic=new getConfirmedInfo();
		int[] totalInfo=logic.getTotalInfo(cartList);
		session.setAttribute("totalinfo", totalInfo);

		//個人情報入力(将来的にはDBの情報を表示。未登録の場合未登録のモーダル→画面へ
		String path="/WEB-INF/jsp/confirmOrder.jsp";
		RequestDispatcher dsp=request.getRequestDispatcher(path);
		dsp.forward(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
