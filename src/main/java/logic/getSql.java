package logic;

import java.util.ArrayList;
import java.util.List;

import beans.Master;

public class getSql  {
	String sql;
	List<Master> result=new ArrayList<Master>();

	public String selectProducts(String keyword) {
		 sql="select id,product,price from Master where product like '%"+ keyword + "%';";
		return sql;

	}
	public String selectProducts_kat(String keyword) {
		 sql="select id,product,price from Master where product_kat like '%"+ keyword + "%';";
		return sql;

	}
	public String selectProducts_hir(String keyword) {
		 sql="select id,product,price from Master where product_hir like '%"+ keyword + "%';";
		return sql;

	}

//	public String selectProducts_cat1(String keyword) {
//		 sql="select id,product,price from Master where category1 like '%"+ keyword + "%';";
//		return sql;
//
//	}


}
