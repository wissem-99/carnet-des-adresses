package exeman;

public class client extends personne {

	private int cin ;

	public client(int cin, String nom, String prenom) {
		super(nom, prenom);
		this.cin = cin;
	}

	public int getCin() {
		return cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}
	
	
}
