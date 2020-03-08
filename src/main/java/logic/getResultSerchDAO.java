package logic;


import java.util.ArrayList;
import java.util.List;

import beans.Master;
import dao.SerchDAO;


public class getResultSerchDAO {

	public List<Master> getResult(String inputword) {
		 List<Master> list=new ArrayList<Master>();
		SerchDAO dao=new SerchDAO();
		try {
			list=dao.findProduct(inputword);
		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return list;
	}

}
