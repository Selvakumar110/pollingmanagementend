package pollingmanagement;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Votesaction{
		Getconnection get = new Getconnection();

	public void insertVoteTable(String username, Votes votes){
			try {
			Connection conn = get.getConnect();
			PreparedStatement statement = null;
			String query = ("insert into votes (username,party)" + " values ('" + username + "','" + votes.getParty()+ "')");
			statement = conn.prepareStatement(query);
			statement.execute();
			System.out.println("----->>>" + "'" + "   Voted");

		}catch(Exception e){
			System.err.println("Voter already polled his vote ");
		}
			Pollingsystem.login();
	}
	
	public static void selectParty(String username){
		System.out.println("Enter 1 for the partyA \n Enter 2 for the partyB \n Enter 3 for the partyC");
		
		Votes votes = new Votes();
		Votesaction votesaction = new Votesaction();
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		switch(scanner.nextInt()){
				case 1:	
				votes.setParty("A");
				votesaction.insertVoteTable(username, votes);
				break;
				
				case 2:
				votes.setParty("B");
				votesaction.insertVoteTable(username, votes);
				break;
				
				case 3:
				votes.setParty("C");
				votesaction.insertVoteTable(username, votes);
				break;
				
				default:
				System.out.println("Entered  a wrong value");
				break;

		}
	}
}