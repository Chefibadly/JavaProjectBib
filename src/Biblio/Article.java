package Biblio;

import java.util.*;

public class Article extends Document {
		public String nom;
		public String auteur;
		public Date date_pub;
		public Scanner sc;
	public Article(String titre, int code, int nbr_exp, String localisation) {
		super(titre, nbr_exp, localisation);
		// TODO Auto-generated constructor stub
	}

	public Article() {
		// TODO Auto-generated constructor stub
	}
	public void saisie()
	{ 
		super.saisie();
		Date d=new Date();
		  sc = new Scanner(System.in);
			System.out.println("donner nom: ");
	        	nom=sc.next();
	        System.out.println("donner auteur: ");
	        auteur=sc.next();
	        System.out.println("donner date_pub sous la forme ");
	        System.out.println("jour:");
	        d.jour=sc.nextInt();
	        System.out.println("mois:");
	        d.mois=sc.nextInt();
	        System.out.println("année");
	        d.annee=sc.nextInt();
	        this.setDate_pub(d);
		
	}

	public Date getDate_pub() {
		return date_pub;
	}

	public void setDate_pub(Date date_pub) {
		this.date_pub = date_pub;
	}

	public void affiche() {
		super.affiche();
		System.out.println("\nnom =" + nom + "\nauteur=" + auteur + "\ndate_pub=" + ", date pub"+ this.date_pub.toString()+".");
	}
	
}
