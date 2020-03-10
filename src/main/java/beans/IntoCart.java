package beans;

import java.io.Serializable;

public class IntoCart implements Serializable {
	int id ;
	private String product;
	private int price;
	private int amount;
	private int subtotal;
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

	public IntoCart(String product,int price,int amount,int  subtotal,int tax,int totalPrice) {
		this.product=product;
		this.price=price;
		this.amount=amount;
		this.subtotal=subtotal;
		this.tax=tax;
		this.totalPrice=totalPrice;
	}
	//productの代わりにid保持(パラメタにつけられない)
	public IntoCart(int id,String product,int price,int amount,int subtotal,int tax,int totalPrice) {
		this.id=id;
		this.product=product;
		this.price=price;
		this.amount=amount;
		this.subtotal=subtotal;
		this.tax=tax;
		this.totalPrice=totalPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id=id;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product=product;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount=amount;
	}
	public int getSubTotal() {
		return subtotal;
	}
	public void setSubTotal(int subTotal) {
		this.subtotal=subTotal;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax=tax;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice=totalPrice;
	}
}
