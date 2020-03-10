package logic;

import java.util.List;

import beans.IntoCart;
public class getConfirmedInfo {

	public int[] getTotalInfo(List<IntoCart> cartlist){
		int[] arrayInfo=new int[2];
		int totalPrice=0;
		int totalTax=0;
		for (IntoCart cart:cartlist) {
			totalTax=totalTax + cart.getTax();
			totalPrice=totalPrice + cart.getTotalPrice();
		}
//		 cartrt(String product,int price,int amount,int totalPrice)
		arrayInfo[0]=totalTax;
		arrayInfo[1]=totalPrice;
		return arrayInfo;

	}
}
