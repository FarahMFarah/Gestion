package P1;

public class Moyenne {


	private Etudiant etudiant;
	private Note note;
	private Matiere matiere;
	private float moyenne;
	
	
	public Moyenne() {}
		
	
public Moyenne(Etudiant etudiant, Note note, Matiere matiere) {
super();
this.etudiant = etudiant;
this.note = note;
this.matiere = matiere;
this.moyenne = (note.getCc()+note.getCf()/2);
	}


public Etudiant getEtudiant() {
	return etudiant;
}


public void setEtudiant(Etudiant etudiant) {
	this.etudiant = etudiant;
}


public Note getNote() {
	return note;
}


public void setNote(Note note) {
	this.note = note;
}


public Matiere getMatiere() {
	return matiere;
}


public void setMatiere(Matiere matiere) {
	this.matiere = matiere;
}


public float getMoyenne() {
	return moyenne;
}


public void setMoyenne(Note note) {
	this.moyenne = (note.getCc()+note.getCf())/2;
}



	
}
