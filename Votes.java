package pollingmanagement;

public class Votes{
	private String username;
	private String party;

	Votes(){}

	public Votes(String username, String party){
		super();
		this.username = username;
		this.party = party;
	}

	public String getUsername(){
		return username;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getParty(){
		return party;
	}

	public void setParty(String party){
		this.party = party;
	}

}