package pollingmanagement;

import java.util.Scanner;

public class Pollingsystem {

	public static void login() {
		
		Voteraction voteraction = new Voteraction();
		Candidateaction candidate = new Candidateaction();
		@SuppressWarnings( "resource" )
		Scanner scanner = new Scanner( System.in );
		
		System.out.println( "Voter-press 1\nCandidate-press 2" );
		
		
		switch (scanner.nextInt()) {
		case 1:
			voteraction.voterLogin();
			break;
			
		case 2:
			candidate.candidateLogin();
			break;
			
		default:
			System.out.println( "Entered wrong option/select 1or2 only" );
		}
	}

	public static void main(String[] args) {
//		MysqlConnection join = new MysqlConnection();
//		join.createTable();
//		join.truncateTable();
		
//		join.createTableCandidate();
//		join.truncateTableCandidate();
		
//		join.createTableVotes();
//		join.truncateTableVotes();
		
//		for ( int j=0; j<=5; j++) {
//			Voter x = new Voter( "dhina" + j, "dhina" + j );
//			System.out.println( "Inserting My value to DB  - - - -> " + j );
//			join.insertTable(x);
//		}
		
//		Candidate candidate = new Candidate();
//		candidate.setUsername( "Acandidate" );
//		candidate.setPassword( "a123" );
//		join.insertTableCandidate(candidate);
		
//		Candidate candidate1 = new Candidate();
//		candidate1.setUsername( "Bcandidate" );
//		candidate1.setPassword( "b123" );
//		join.insertTableCandidate(candidate1);
		
//		Candidate candidate2 = new Candidate();
//		candidate2.setUsername( "Ccandidate" );
//		candidate2.setPassword( "c123" );
//		join.insertTableCandidate(candidate2);

		login();
	}
}