package logic;

import java.util.ArrayList;
import java.util.List;

import beans.IntoCart;

/**
 * Servlet implementation class calcCosts
 */
public class calcCosts{
	double taxRate;
	String cat1="食べ物" ;
	String cat2="飲み物 ";
	String cat3="日用品";
	String cat4="嗜好品";


//Masterに情報が必要
	public double getEachTaxRate(String category) {
		if (category.equals(cat1)|category.equals(cat2)){
			taxRate=1.08;
		}
		else if(category.equals(cat3)|category.contentEquals(cat4)){
			taxRate=1.10;
		}
		return taxRate;

	}

	public int getTotalPrice(int price,int amount) {

		int totalPrice=price*amount;
		return totalPrice;

	}

	//カートに入れるそれぞれの商品の合計金額（税抜）
	public List<IntoCart> getEachTotalPrice(List<IntoCart> list) {

		String product;
		int price;
		int amount;
		int totalPrice;
		int subtotal;

		List<IntoCart> total=new ArrayList<IntoCart>();
		for(IntoCart cart:list){
			product=cart.getProduct();
			price=cart.getPrice();
			amount=cart.getAmount();
			totalPrice=price*amount;

//			totalPrice=subtotal+tax;
			IntoCart intoC=new IntoCart(product,price,amount,totalPrice);
			total.add(intoC);
		}


		return total;

	}


//	public IntoCart getEachTotalAndTax(String product,String category,int price,int amount) {
		public IntoCart getEachTotalAndTax(int id,String product,String category,int price,int amount) {

		int subTotal=price*amount;
		int tax=(int) (subTotal*getEachTaxRate(category));
		int totalPrice=subTotal + tax;
//		IntoCart intoC=new IntoCart(product,price,amount,subTotal,tax,totalPrice);
		IntoCart intoC=new IntoCart(id,product,price,amount,subTotal,tax,totalPrice);

		return intoC;

	}
}
