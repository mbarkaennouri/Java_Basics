package connexion;

import java.sql.*;
public class MySql_Con {
	public Connection connecter() {
		Connection conn=null;
		try {

		//driver pour connecter a la base de donne
		Class.forName("com.mysql.cj.jdbc.Driver");
		//chemin connexion a la base de donne
		//localhost adresse du base
		///nom du base
		//user par defaut root sans mot de passe
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_personne","root","");
		System.out.println("Success");

		} catch (Exception e) {
		e.printStackTrace();
		}
		return conn;
		}

}
