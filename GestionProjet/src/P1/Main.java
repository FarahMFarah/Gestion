package P1;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Main {
		static Connection connection=null;
		static String url="jdbc:mysql://localhost:3306/etudiant";
		static String username="root";
		static String password="";
		String driver="com.mysql.jdbc.Driver";
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	Etudiant a =new Etudiant("b","Halimo ","hawa","heron","fsfsdfdsfsd",20);
	Note n=new Note(001,15,11);
	n.setMoy(n.moyenne(n.getCc(),n.getCf()));
	Matiere m =new Matiere(001,"JAVA",2);
	
	
	AjoutBD S=new AjoutBD();	
	S.ajouterBdetudiant(a);
	S.ajouterBdMatiere(m);
	S.ajouterBdnotes(n);
	
		
		
		
		
		
		
		
		
		
	}

}
