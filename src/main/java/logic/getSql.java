package logic;

import java.util.ArrayList;
import java.util.List;

import beans.Master;

public class getSql  {
	String sql;
	List<Master> result=new ArrayList<Master>();

	public String selectProducts(String keyword) {
		 sql="SELECT id,product,price FROM master WHERE product LIKE '%"+ keyword + "%';";
		return sql;

	}
	public String selectProducts_kat(String keyword) {
		 sql="SELLCT id,product,price FROM master WHERE product_kat LIKE '%"+ keyword + "%';";
		return sql;

	}
	public String selectProducts_hir(String keyword) {
		 sql="SELECT id,product,price FROM master WHERE product_hir LIKE '%"+ keyword + "%';";
		return sql;

	}

//	public String selectProducts_cat1(String keyword) {
//		 sql="select id,product,price from Master where category1 like '%"+ keyword + "%';";
//		return sql;
//
//	}


}
