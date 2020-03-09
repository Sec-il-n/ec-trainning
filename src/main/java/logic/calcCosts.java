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

		List<IntoCart> total=new ArrayList<IntoCart>();
		for(IntoCart cart:list){
			product=cart.getProduct();
			price=cart.getPrice();
			amount=cart.getAmount();
			totalPrice=price*amount;

			IntoCart intoC=new IntoCart(product,price,amount,totalPrice);
			total.add(intoC);
		}


		return total;

	}


	public IntoCart getEachTotalPrice(String product,String category,int price,int amount) {

		int totalPrice=price*amount;
		int tax;

		tax=(int) (totalPrice*getEachTaxRate(category));
		IntoCart intoC=new IntoCart(product,price,amount,tax,totalPrice);

		return intoC;

	}
}
