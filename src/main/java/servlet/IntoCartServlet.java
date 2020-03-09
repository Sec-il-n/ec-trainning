package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.IntoCart;
import beans.Master;
import logic.getResultSerchDAO;

@WebServlet("/IntoCartServlet")
public class IntoCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public IntoCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<IntoCart> intoCart=new ArrayList<IntoCart>();
		List<Master> master=new  ArrayList<Master>();
		String product =request.getParameter("product");
		int price=Integer.parseInt(request.getParameter("price"));
		int amount=Integer.parseInt(request.getParameter("amount"));
		int id=Integer.parseInt(request.getParameter("id"));

		getResultSerchDAO dao=new  getResultSerchDAO();
		master=dao.findEach(id);
		String category1= ((Master) master).getCategory1();
//		calcCosts logic=new calcCosts();
//		intoCart=logic.getEachTotalPrice(product,category1,price,amount) ;

		HttpSession session=request.getSession();
//		session.setAttribute(name, value);
		doGet(request, response);
	}

}
