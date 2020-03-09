package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Master;
import logic.getSql;
public class SerchDAO  {
//	static final String URL = System.getenv("JDBC_URL");
//	static final String USERNAME = System.getenv("DB_USERNAME");
//    static final String PASSWORD = System.getenv("DB_PASSWORD");
	static final String URL = "jdbc:postgresql://localhost:5432/postgres";
	static final String USERNAME = "postgres";
    static final String PASSWORD = "yfc";
//    static final String PASSWORD = "s1e9r8i3";

	public SerchDAO(){

	}

	public List<Master> findProduct(String keyword) throws ClassNotFoundException{
		List<Master> serchResult=new ArrayList<Master>();
		String sql1;
//		String sql2;
//		String sql3;
//		int len;
		Connection conn=null;
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			getSql gs=new getSql();
			sql1=gs.selectProducts(keyword) ;

			PreparedStatement st1=conn.prepareStatement(sql1);
			ResultSet rs=st1.executeQuery();

			while(rs.next()){
				int id=rs.getInt("id");
				String product =rs.getString("product");
				int price=rs.getInt("price");
				Master msb=new Master(id,product,price);
				serchResult.add(msb);
			}
//			arrayLogics sl=new arrayLogics();
//			len=sl.getArrayLength(serchResult);
//			if(len==0){
//
//			}


		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}



		return serchResult;

	}


}
