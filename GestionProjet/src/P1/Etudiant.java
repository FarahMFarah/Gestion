package P1;

public class Etudiant {




	private String matricule;
	private String nom;
	private String prenom;
	private String adresse;
	private String email;
	private int age;
	private float moy;
	
	
	public Etudiant(String matricule, String nom, String prenom, String adresse, String email,int age) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.email = email;
		this.age=age;
	}


	public String getMatricule() {
		return matricule;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}




	public String getAdresse() {
		return adresse;
	}


	public String getEmail() {
		return email;
	}

	
	public int getAge() {
		return age;
	}


	
	
	
	

}
