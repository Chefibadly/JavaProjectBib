package Biblio;

import java.util.*;

public class Livre extends Document {
		public String nom_auteur;
		public String nom_editeur;
		public Date date_pub;
		public Scanner sc;
		
	public Livre(String titre, int code, int nbr_exp, String localisation) {
		super(titre, nbr_exp, localisation);
		// TODO Auto-generated constructor stub
	}

	public Livre() {
		
	}

	public void saisie()
	{ 
		Date d=new Date();
		 	sc = new Scanner(System.in);
			super.saisie();
			
	        System.out.println("donner nom_auteur: ");
	        nom_auteur=sc.next();
	        System.out.println("donner nom_editeur: ");
	        nom_editeur=sc.next();
	        System.out.println("donner date_pub sous la forme ");
	        System.out.println("jour:");
	        d.jour=sc.nextInt();
	        System.out.println("mois:");
	        d.mois=sc.nextInt();
	        System.out.println("année");
	        d.annee=sc.nextInt();
	        this.setDate_pub(d);
	}
	
	public String getNom_auteur() {
		return nom_auteur;
	}

	public void setNom_auteur(String nom_auteur) {
		this.nom_auteur = nom_auteur;
	}

	public String getNom_editeur() {
		return nom_editeur;
	}

	public void setNom_editeur(String nom_editeur) {
		this.nom_editeur = nom_editeur;
	}

	public Date getDate_pub() {
		return date_pub;
	}

	public void setDate_pub(Date date_pub) {
		this.date_pub = date_pub;
	}

	public void affiche() {
		super.affiche();
		System.out.println("Livre [nom_auteur=" + nom_auteur + ", nom_editeur=" + nom_editeur + ", date pub"+ this.date_pub.toString()+ "]");
	}

	
}
