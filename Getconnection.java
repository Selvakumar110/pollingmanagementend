package pollingmanagement;

import java.sql.DriverManager;
import java.sql.Connection;

public class Getconnection {

	public static Connection connect;

	public Connection getConnect() {
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/pollingsystem?useSSL=false&allowPublicKeyRetrieval=true",
			"root","10decoders");
			
	} catch(Exception e) {
	  System.out.println(e);
	}
	  return connect;
	}
//
//public static void main(String[] args) {
//	Getconnection get=new Getconnection(connect);
//	getConnect();
//}
}
