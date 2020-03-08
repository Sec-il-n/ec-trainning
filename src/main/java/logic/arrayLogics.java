package logic;

import java.util.List;

import beans.Master;

public class arrayLogics  {
	int len;
	public int getArrayLength(List<Master> list) {

		len=list.size();
		return len;

	}
}
