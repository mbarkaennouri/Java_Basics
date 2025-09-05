package Principale;

import java.sql.ResultSet;
import java.sql.SQLException;

import CRUD.Gestion;
import Personne.Personne;

public class Principale {
	public static void main(String[] args) {
		// Ajout de 3 personnes
		Personne p = new Personne(1,"Mohamed","Fatma");
		Personne p1 = new Personne(2,"Ahmed","Ali");
		Personne p2 = new Personne(3,"Salah","Sami");
		Gestion g = new Gestion();
		g.Ajouter(p.getId(), p.getNom(), p.getPrenom());
		g.Ajouter(p1.getId(), p1.getNom(), p1.getPrenom());
		g.Ajouter(p2.getId(), p2.getNom(), p2.getPrenom());
		//////
		//Modification du nom de la personne p1
		g.modifier(p1.getId(), "Tounsi", p1.getPrenom());
		//////
		//Affichage de toutes les personnes
		ResultSet rs=g.afficher();
		try {
		while(rs.next())
		{
		System.out.println("l'id est "+rs.getInt("Id"));
		System.out.println("le nom  est "+rs.getString("nom"));
		System.out.println("le prenom est "+rs.getString("prenom"));
		}
	}
	catch(SQLException e)
	{
		
	}
		//////
		//Supression de la personne p
		g.supprimer(3);
	
	}
}