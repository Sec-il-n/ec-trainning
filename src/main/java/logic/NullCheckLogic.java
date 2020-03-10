package logic;


public class NullCheckLogic  {
	//nullならtrue
	public boolean checkNull(Object i){
		if(i==null){
			return true;
		}
		return false;
	}
	public boolean checkZero(int i){
		if(i==0){
			return true;
		}
		return false;
	}
	public boolean checkNumber(String str){
	    try {
			Integer.parseInt(str);

		} catch (NumberFormatException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}