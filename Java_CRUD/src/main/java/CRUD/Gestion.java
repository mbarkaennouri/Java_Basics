package CRUD;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Personne.Personne;
import connexion.MySql_Con;



///contient 4 methode : ajouter, modifier, supp, afficher

public class Gestion {

	///Methode Ajouter

	public void Ajouter(int id,String nom,String prenom)

	{

		//1.creation instance du class personne

		Personne p=new Personne(id,nom,prenom);

		//2.connexion a la base de donne::

		//a:appel class Mysqlcon

		MySql_Con c=new MySql_Con();//appel constructeur par defaut

		//b:Appel method connecter

		Connection con=c.connecter();

		String sql="insert into personne(id,nom,prenom) values('"+p.getId()+"','"+p.getNom()+"','"+p.getPrenom()+"')"; 
		//Preparation pour l'execution de la requete sql
		Statement st;
		try {
		//Entrée dans la base de données à travers st
			st=con.createStatement();
			
		//Executer la requete sql
		st.executeUpdate(sql);
		System.out.println("personne bien ajoutée");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
}
	////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////
	///Methode Modifier
	public void modifier(int id,String nom,String prenom)

	{

		//1.creation instance du class personne

		Personne p=new Personne(id,nom,prenom);

		//2.connexion a la base de donne::

		//a:appel class Mysqlcon

		MySql_Con c=new MySql_Con();//appel constructeur par defaut

		//b:Appel method connecter

		Connection con=c.connecter();

		String sql="update personne set nom = '"+p.getNom()+"',prenom='"+p.getPrenom()+"'   where id= '"+p.getId()+"'"; 
		//Preparation pour l'execution de la requete sql
		Statement st;
		try {
		//Entrée dans la base de données à travers st
			st=con.createStatement();
			
		//Executer la requete sql
		st.executeUpdate(sql);
		System.out.println("personne bien modifiée");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
}
	///////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////
	///Methode supprimer
	
	public void supprimer(int id)

	{

		//1.creation instance du class personne

		Personne p=new Personne(id);

		//2.connexion a la base de donne::

		//a:appel class Mysqlcon

		MySql_Con c=new MySql_Con();//appel constructeur par defaut

		//b:Appel method connecter

		Connection con=c.connecter();

		String sql="delete from personne  where id= '"+p.getId()+"'"; 
		//Preparation pour l'execution de la requete sql
		Statement st;
		try {
		//Entrée dans la base de données à travers st
			st=con.createStatement();
			
		//Executer la requete sql
		st.executeUpdate(sql);
		System.out.println("personne bien supprimée");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
}
    ////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////
	///Methode supprimer
	public ResultSet afficher()

	{
		ResultSet rs=null;

		//a:appel class Mysqlcon

		MySql_Con c=new MySql_Con();//appel constructeur par defaut

		//b:Appel method connecter

		Connection con=c.connecter();

		String sql=" select * from personne"; 
		//Preparation pour l'execution de la requete sql
		Statement st;
		try {
		//Entrée dans la base de données à travers st
			st=con.createStatement();
			
		//Executer la requete sql
		rs=st.executeQuery(sql); ///// dans la methode afficher, oon utilise executeQuery au lieu de executeUpdate
		//System.out.println("personne bien supprimée");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
		return rs;
}
}