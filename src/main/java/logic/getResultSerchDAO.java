package logic;


import java.util.List;

import beans.Master;
import dao.SerchDAO;


public class getResultSerchDAO {

	public List<Master> getResult(String inputword){
		SerchDAO dao=new SerchDAO();
		return dao.findProduct(inputword);
	}

}
