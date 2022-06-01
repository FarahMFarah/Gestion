package testing;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import P1.AjoutBD;
import P1.Etudiant;
import P1.Matiere;
import P1.Note;
import junit.framework.TestCase;

public class testajoutbd extends TestCase {

	//Test de l ajout etudiant a la Base de donnes:
	public void testAjoutEtudiant() throws ClassNotFoundException, SQLException {
		AjoutBD Et=new AjoutBD();
		Etudiant E1=new Etudiant("b","Halimo ","hawa","heron","fsfsdfdsfsd",16);
		
		boolean result =Et.ajouterBdetudiant(E1);
		assertTrue(result);
	}
	
	
	public void testAjoutMatiere() throws ClassNotFoundException, SQLException {
		AjoutBD Et=new AjoutBD();
		Matiere M1=new Matiere(001,"JAVA",4);
		
		boolean result =Et.ajouterBdMatiere(M1);
		assertTrue(result);			
	}
	
	public void testAjoutNote() throws ClassNotFoundException, SQLException {
		AjoutBD Et=new AjoutBD();
		Note N1=new Note(010,12,18);
		
		boolean result =Et.ajouterBdnotes(N1);
		assertTrue(result);	
		
	}
	
	public void testBDConnection() {		
		AjoutBD b=new AjoutBD();
		boolean result=b.getConnection();
		assertTrue(result);
		
	}
	
	public void testmoyenne() {
		Note n=new Note();
		int output=n.moyenne(14, 16);
		assertEquals(15, output);
	}

}
