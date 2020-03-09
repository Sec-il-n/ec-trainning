package beans;

import java.io.Serializable;

public class IntoCart implements Serializable {
	private String product;
	private int price;
	private int amount;
	private int tax;
	private int totalPrice;

	public IntoCart() {}

	public IntoCart(String product,int price,int amount) {
		this.product=product;
		this.price=price;
		this.amount=amount;
	}

	public IntoCart(String product,int price,int amount,int totalPrice) {
		this.product=product;
		this.price=price;
		this.amount=amount;
		this.totalPrice=totalPrice;
	}


	public IntoCart(String product,int price,int amount,int tax,int totalPrice) {
		this.product=product;
		this.price=price;
		this.amount=amount;
		this.tax=tax;
		this.totalPrice=totalPrice;
	}

	public String getProduct() {
		return product;
	}
	public int getPrice() {
		return price;
	}
	public int getAmount() {
		return amount;
	}
	public int getTax() {
		return tax;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
}
