package P1;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AjoutBD {
	
	static Connection connection=null;
	static String url="jdbc:mysql://localhost:3306/etudiant";
	static String username="root";
	static String password="";
	String driver="com.mysql.jdbc.Driver";
	
	
	
	public boolean getConnection() {
		Connection con=null;
		try {	
			con=DriverManager.getConnection(url,username,password);			
		} catch (Exception e) {
		}
		return true;
	}
	
	
	//fonction ajout etudiant
	public boolean ajouterBdetudiant(Etudiant a) throws ClassNotFoundException, SQLException {	
		boolean result=false;
		try {
		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection(url,username,password);
		String insert="insert into etudiant values(?,?,?,?,?,?)";
		PreparedStatement ps= connection.prepareStatement(insert);
		ps.setString(1,a.getMatricule());
		ps.setString(2, a.getNom());
		ps.setString(3, a.getPrenom());
		ps.setString(4,a.getAdresse());
		ps.setString(5,a.getEmail());
		ps.setInt(6,a.getAge());
		int status=ps.executeUpdate();		
		result=true;
		if (status!=0){
			System.out.println("l etudiant a ete ajouter");			
		}
		}catch (Exception e) {
			System.out.println("Echec de l ajout ");
			result=false;
		}
		return result;		
	}
	
	
	//fonction ajout de la note
	public boolean ajouterBdnotes(Note n) throws ClassNotFoundException, SQLException {	
		boolean result=false;
		try {			
		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection(url,username,password);
		String insert="insert into notes values(?,?,?,?)";
		PreparedStatement ps= connection.prepareStatement(insert);
		ps.setInt(1,n.getCode());
		ps.setInt(2, n.getCc());
		ps.setInt(3, n.getCf());
		ps.setDouble(4, n.getMoy());	
		int status=ps.executeUpdate();	
		result=true;
		if (status!=0){
			System.out.println("la note a ete ajouter");			
		}
		} catch (Exception e) {
			System.out.println("Echec insertion de la Note");
			result=false;
		}
		return result;
	}
	
	
	//fonction ajout de la matiere
	public boolean ajouterBdMatiere(Matiere m) throws ClassNotFoundException, SQLException {
	boolean result=false;
	try {
		
		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection(url,username,password);
		String insert="insert into matiere values(?,?,?)";
		PreparedStatement ps= connection.prepareStatement(insert);
		ps.setInt(1,m.getCode());
		ps.setString(2, m.getNom());
		ps.setInt(3, m.getCoef());
		int status=ps.executeUpdate();
		result=true;
		if (status!=0){
			System.out.println("la Matiere  a ete ajouter");
			
		}
		
	
	} catch (Exception e) {
		System.out.println("Echec insertion de la Matiere");
		result=false;
	}
	return result;

}
}
