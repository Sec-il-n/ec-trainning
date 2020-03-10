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
import beans.Master;
import logic.NullCheckLogic;
import logic.calcCosts;
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


	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		IntoCart intoCart=new IntoCart();
		Master m=new Master();
		String msg;
		String path;
//		String product =request.getParameter("product");
		int price=Integer.parseInt(request.getParameter("price"));
		//
		int amount = 0;
		try {
			amount = Integer.parseInt(request.getParameter("amount"));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int id=Integer.parseInt(request.getParameter("id"));

		HttpSession session=request.getSession();
		NullCheckLogic nlogic=new NullCheckLogic();

		//メッセージが残る
		if(nlogic.checkZero(amount)){
			msg="数量を入力してください。";
			path="/WEB-INF/jsp/eachProduct.jsp";
			request.setAttribute("empamountmsg", msg);
		}else {

			getResultSerchDAO dao=new  getResultSerchDAO();
	//		master=dao.findEach(id);
			m=dao.findEachReturnBean(id);
			String product=m.getProduct();
	//		String category1=master.get(0).getCategory1();
			String category1=m.getCategory1();
			calcCosts logic=new calcCosts();
			//intoCaretにはtax含む
	//		intoCart=logic.getEachTotalAndTax(product,category1,price,amount) ;
			intoCart=logic.getEachTotalAndTax(id,product,category1,price,amount) ;//7要素のbeant
			//(id,product,price,amount,subtotal,tax,totalPrice)

			//intoCart をすべて格納するListをスコープで保持
			List<IntoCart> cartlist=new ArrayList<IntoCart>();
			cartlist=(List<IntoCart>)session.getAttribute("cartlist");

			if(cartlist==null){
				//sessionset
				cartlist=new ArrayList<IntoCart>();
				cartlist.add(intoCart);
				session.setAttribute("cartlist", cartlist);

			}else {
				cartlist.add(intoCart);
				session.setAttribute("cartlist", cartlist);
			}
			path="/WEB-INF/jsp/showCart.jsp";
		}

		RequestDispatcher dsp=request.getRequestDispatcher(path);
		dsp.forward(request, response);
		doGet(request, response);
	}

}
