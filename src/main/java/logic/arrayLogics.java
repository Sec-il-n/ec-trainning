package logic;

import java.util.List;

import beans.IntoCart;
import beans.Master;

public class arrayLogics  {
	int len;
	public int getArrayLength(List<Master> list) {

		try {
			len=list.size();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return len;

	}
	public int getArrayLengthCart(List<IntoCart> list) {

		try {
			len=list.size();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return len;

	}



}
