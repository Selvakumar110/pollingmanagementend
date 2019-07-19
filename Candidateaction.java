package pollingmanagement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Candidateaction {
	Getconnection get = new Getconnection();
	Scanner scanner = new Scanner(System.in);
	
	public void candidateLogin() {

		System.out.println("Enter your registered username");
		String x = scanner.next();
		
		System.out.println("Enter your password");
		String y = scanner.next();
		
		System.out.println("Enter your party name");
		String z = scanner.next();
		
		Candidateaction candidateaction = new Candidateaction();
		candidateaction.checkCandidateLogin(x, y, z);
	}

	public void checkCandidateLogin(String x, String y, String z) {
		
		Candidateaction candidateaction = new Candidateaction();
			try {
				
			Connection connect = get.getConnect();
			String query = ("select * from candidate where username='" + x + "' and password ='" + y + "'and party='"+ z + "'");
			Statement statement = null;
			statement = connect.prepareStatement(query);
			ResultSet rs = statement.executeQuery(query);

			while (rs.next()) {

				String username = rs.getString(1);
				String password = rs.getString(2);
				String party = rs.getString(3);

				if (username != null && password != null) {
					System.err.println("Welcome --->" + rs.getString(1));
					candidateaction.voteCounts(party);
				} else {
					System.out.println("Voter not available in voters list");
				}

			}
			connect.close();
		} catch(Exception e) {
			System.err.println("LOGIN EXCEPTION DUDE---->> " + e);
			e.printStackTrace();
		}
	}

	public void voteCounts(String party) {

			try {

			Connection conn = get.getConnect();
			String query = ("select count(*) from votes where party='" + party + "'");
			Statement statement = null;
			statement = Getconnection.connect.prepareStatement(query);
			ResultSet rs = statement.executeQuery(query);

			while (rs.next()) {
				System.err.println("Congrats you got--->" + rs.getString(1) + "'votes'");
			}
			conn.close();
		} catch (Exception e) {
			System.err.println("Votecount EXCEPTION ---->> " + e);
			e.printStackTrace();
		}
		Pollingsystem.login();
	}
}
