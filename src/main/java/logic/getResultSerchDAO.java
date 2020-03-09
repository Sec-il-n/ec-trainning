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

	public List<Master> findEach(int id) {

		List<Master> list=new ArrayList<Master>();
		SerchDAO dao=new SerchDAO();

		try {
			list=dao.findEach(id);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
