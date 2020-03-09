package beans;

import java.io.Serializable;

public class Master implements Serializable{
	private int id;
	private String product;
	private String category1;
	private int price;

	public Master() {}

	public Master(int id,String product,String category1,int price) {
		this.id=id;
		this.product=product;
		this.category1=category1;
		this.price=price;
	}


	public int getId() {
		return id;
	}
	public String getProduct() {
		return product;
	}
	public String getCategory1() {
		return category1;
	}
	public int getPrice() {
		return price;
	}

}