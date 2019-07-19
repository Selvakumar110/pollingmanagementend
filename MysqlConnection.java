package pollingmanagement;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;

public class MysqlConnection {

//	public void createTable() {
//			try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/pollingsystem?useSSL=false&allowPublicKeyRetrieval=true",
//					"root", "10decoders");
//			PreparedStatement statement = null;
	
//			// Use Database
//			String usePollingSystem = "use pollingsystem ;";
//			statement = connect.prepareStatement(usePollingSystem);
//			statement.execute(usePollingSystem);
//
//			String queryCreatreTable = "create table voter (username varchar(50) NOT NULL UNIQUE,password varchar(50));";
//			statement = connect.prepareStatement(queryCreatreTable);
//			statement.execute(queryCreatreTable);
//			System.out.println("Table Created ...!!!");
	
//		} catch(ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//			System.err.println("EXCEPTION OCCURE in createTable voter");
//		}
//
//	}
//
//	public void truncateTable() {
//
//			try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/pollingsystem?useSSL=false&allowPublicKeyRetrieval=true",
//					"root", "10decoders");
//			PreparedStatement statement = null;
	
//			String truncateVoter = "TRUNCATE `pollingsystem`.`voter`;";
//			statement = connect.prepareStatement(truncateVoter);
//			statement.execute(truncateVoter);
//			System.out.println("Table Created ...!!!");
	
//		} catch(ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//			System.err.println("EXCEPTION OCCURE ");
//		}
//	}
//
//	public void insertTable(Voter voter) {
//
//			try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/pollingsystem?useSSL=false&allowPublicKeyRetrieval=true",
//					"root", "10decoders");
//			PreparedStatement statement = null;
	
//			// Creating Voter Table
//			String query = ("insert into voter (username,password)" + " values ('" + voter.getUsername() + "','"
//					+ voter.getPassword() + "')");
//			statement = connect.prepareStatement(query);
//			statement.execute();
//			System.out.println("----->>>" + voter.getUsername() + "   inserted");
//
//		}catch(Exception e) {
//			System.err.println("Got an insert table exception" + e);
//			System.err.println(e.getMessage());
//		}
//	}
//	
//	public void createTableCandidate() {
//			try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/pollingsystem?useSSL=false&allowPublicKeyRetrieval=true",
//					"root", "10decoders");
//			PreparedStatement statement = null;
//
//			// Use Database
//			String usePollingSystem = "use pollingsystem ;";
//			statement = connect.prepareStatement(usePollingSystem);
//			statement.execute(usePollingSystem);
//
//			String queryCreatreTable = "create table candidate (username varchar(50) NOT NULL UNIQUE,password varchar(50));";
//			statement = connect.prepareStatement(queryCreatreTable);
//			statement.execute(queryCreatreTable);
//			System.out.println("Table Created ...!!!");
	
//		} catch(ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//			System.err.println("EXCEPTION OCCURE in createTable voter");
//		}
//	}
//
//	public void truncateTableCandidate() {
//
//			try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/pollingsystem?useSSL=false&allowPublicKeyRetrieval=true",
//					"root", "10decoders");
//			PreparedStatement statement = null;
	
//			String truncateVoter = "TRUNCATE `pollingsystem`.`candidate`;";
//			statement = connect.prepareStatement(truncateVoter);
//			statement.execute(truncateVoter);
//			System.out.println("Table Created ...!!!");
	
//		} catch(ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//			System.err.println("EXCEPTION OCCURE ");
//		}
//	}
//
//	public void insertTableCandidate(Candidate C) {
//			try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/pollingsystem?useSSL=false&allowPublicKeyRetrieval=true",
//					"root", "10decoders");
//			PreparedStatement statement = null;
	
////		Insert values into Candidate table
//			String query = ("insert into candidate (username,password)" + " values ('" + C.getUsername() + "','"
//					+ C.getPassword() + "')");
//			statement = connect.prepareStatement(query);
//			statement.execute();
//			System.out.println("----->>>" + C.getUsername() + "   inserted");
//
//		} catch(Exception e) {
//			System.err.println("Got an insert table exception" + e);
//			System.err.println(e.getMessage());
//		}
//	}
	
//	public void createTableVotes() {
//			try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/pollingsystem?useSSL=false&allowPublicKeyRetrieval=true",
//					"root", "10decoders");
//			PreparedStatement statement = null;
//
//			// Use Database
//			String usePollingSystem = "use pollingsystem ;";
//			statement = connect.prepareStatement(usePollingSystem);
//			statement.execute(usePollingSystem);
//
//			String queryCreatreTable = "create table votes (username varchar(50) NOT NULL UNIQUE,party varchar(50));";
//			statement = connect.prepareStatement(queryCreatreTable);
//			statement.execute(queryCreatreTable);
//			System.out.println("Votes Table Created ...!!!");
	
//		} catch(ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//			System.err.println("EXCEPTION OCCURE in createTable votes");
//		}
//	}
//
//	public void truncateTableVotes() {
//
//			try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/pollingsystem?useSSL=false&allowPublicKeyRetrieval=true",
//					"root", "10decoders");
//			PreparedStatement statement = null;
	
//			String truncateVotes = "TRUNCATE `pollingsystem`.`votes`;";
//			statement = connect.prepareStatement(truncateVotes);
//			statement.execute(truncateVotes);
//			System.out.println("Votes Table Truncated ...!!!");
	
//		} catch(ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//			System.err.println("EXCEPTION OCCURE ");
//		}
//	}

}