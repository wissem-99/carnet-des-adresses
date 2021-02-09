package exeman;

public class adresse extends personne {

	

	private String catégorie;
	private String adresse;
	private String digicode;
	private int code_postal;
	private int num_tel;
	private String email;
	private String dernier_modif;
	private String remarques ;
	
	public adresse( String nom, String prenom, String catégorie, String adresse, String digicode,
			int code_postal, int num_tel, String email, String dernier_modif, String remarques) {
		super( nom, prenom);
		this.catégorie = catégorie;
		this.adresse = adresse;
		this.digicode = digicode;
		this.code_postal = code_postal;
		this.num_tel = num_tel;
		this.email = email;
		this.dernier_modif = dernier_modif;
		this.remarques = remarques;
	}
	public String getCatégorie() {
		return catégorie;
	}
	public String getAdresse() {
		return adresse;
	}
	public String getDigicode() {
		return digicode;
	}
	public int getCode_postal() {
		return code_postal;
	}
	public int getNum_tel() {
		return num_tel;
	}
	public String getEmail() {
		return email;
	}
	public String getDernier_modif() {
		return dernier_modif;
	}
	public String getRemarques() {
		return remarques;
	}
	public void setCatégorie(String catégorie) {
		this.catégorie = catégorie;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public void setDigicode(String digicode) {
		this.digicode = digicode;
	}
	public void setCode_postal(int code_postal) {
		this.code_postal = code_postal;
	}
	public void setNum_tel(int num_tel) {
		this.num_tel = num_tel;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setDernier_modif(String dernier_modif) {
		this.dernier_modif = dernier_modif;
	}
	public void setRemarques(String remarques) {
		this.remarques = remarques;
	}
	
	
}