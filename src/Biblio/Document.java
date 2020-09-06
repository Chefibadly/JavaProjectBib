package Biblio;

import java.util.Scanner;

import java.util.concurrent.atomic.AtomicInteger;
public class Document {
	public static AtomicInteger ID_GENEREtOR = new AtomicInteger(1);
		public String titre;
		public int code;
		public int  nbr_exp;
		public String localisation;
		public String salle;
		public int rayon;
		public Scanner sc ;
		public Document(String titre, int nbr_exp, String localisation) {
			super();
			this.titre = titre;
			
			this.nbr_exp = nbr_exp;
			this.localisation = localisation;
		}
 public Document() {
			
 }


public void saisie()
{ 

	   sc = new Scanner(System.in);
        System.out.println("veuillez saisir les information a propos ce document:");
        System.out.println("donner le Titre: ");
        titre=sc.next();
        this.code=ID_GENEREtOR.getAndIncrement();
        System.out.println("donner le nombre d'exemplaire :");
        nbr_exp=sc.nextInt();
    	System.out.println("donner le Rayon :");
    	rayon=sc.nextInt();
        System.out.println("Donner la salle :");
        salle=sc.next();
 
}
public void affiche() {
	System.out.println("code :"+code+"\ntitre : "+titre+" \nexemplaire : "+nbr_exp+" \nLocalisation(rayon/salle): "+rayon+"/"+salle);
}
 }
 

