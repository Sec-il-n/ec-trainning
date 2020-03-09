package beans;

import java.io.Serializable;

public class Master implements Serializable{
	private int id;
	private String product;
	private int price;

	public Master() {}

	public Master(int id,String product,int price) {
		this.id=id;
		this.product=product;
		this.price=price;
	}


	public int getId() {
		return id;
	}
	public String getProduct() {
		return product;
	}
	public int getPrice() {
		return price;
	}

}