package pollingmanagement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Voteraction{
	Getconnection get = new Getconnection();
	Scanner scanner = new Scanner(System.in);

	public void voterLogin(){

		System.out.println("Enter your registered username");
		String x = scanner.next();

		System.out.println("Enter your password");
		String y = scanner.next();
		
		Voteraction voteraction = new Voteraction();
		voteraction.checkVoterLogin(x, y);
	}

	public void checkVoterLogin(String x, String y){
		
			try {
			Connection connect = get.getConnect();
			String query = ("select * from voter where username='" + x + "' and password ='" + y + "'");
			Statement statement = null;
			statement = connect.prepareStatement(query);
			ResultSet rs = statement.executeQuery(query);
			
			while (rs.next()) {
				String username = rs.getString(1);
				String password = rs.getString(2);
				
				if (username != null&&password != null) {
					System.err.println("Welcome --->" + rs.getString(1) + "\n");
					Votesaction.selectParty(username);
				}
		}
		}catch(Exception e){
			System.err.println("voter unavailable---->> ");
			e.printStackTrace();
		}
		System.out.println("Voter not available in voters list");
		Pollingsystem.login();
	}
}