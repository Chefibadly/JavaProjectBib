package Biblio;

import java.util.Scanner;
import java.util.ArrayList;

public class Adherent {
	public int id;
	public String nom;
	public String prenom;
	public String adresse;
	public int type;
	public int choixX;
	public Scanner sc;
	
	public java.util.ArrayList<Pret> t_Pret=new ArrayList<Pret>();
	
	 public int nb_eff;
	 public int nb_encour;
	 public int nb_depasse;
	 public boolean retardataire=false;
	 
	 public boolean  retardataire(Date d)
	 {
		
		 for(int i=0;i<this.t_Pret.size();i++)
		 {
			 System.out.println(this.t_Pret.get(i).Date_retour.getDifference(this.t_Pret.get(i).Date_retour,d));
			 if(this.t_Pret.get(i).Date_retour.getDifference(this.t_Pret.get(i).Date_retour,d)>0)
			 {
				 this.retardataire=true;
			 }
			 
			 
		 }
	 
		 return this.retardataire;
	 }
	 public void addPret(Pret p)
	 {
		 if(p==null)
			 System.out.println("NULL");
		 else
			 this.t_Pret.add(p);
	 }
	
	public Adherent(int id, String nom, String prenom, String adresse,int type) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.type = type;
	}
	

	public Adherent() {
		// TODO Auto-generated constructor stub
	}


	public void saisieAdherent() 
	{
		
	
		sc = new Scanner(System.in);
        System.out.println("veuillez saisir les information a propos ce Adherent:");
        System.out.println("donner l'ID: ");
        id=sc.nextInt();
        System.out.println("donner le nom: ");
        nom= sc.next();
        System.out.println("donner le prenom: ");
        prenom = sc.next();
        System.out.println("donner l'adresse: ");
        adresse = sc.next();
        System.out.println("chousir le type d'adherent \n 1:pour etudiant\n 2:pour enseignant\n 3:pour visiteur");
    	this.type=sc.nextInt();
    	switch(type)
    	{
    	case 1: this.nb_eff=2;
    			this.nb_depasse=0;
    			this.nb_encour=0;break;
    	case 2:this.nb_eff=4;
    		   this.nb_depasse=0;
    		   this.nb_encour=0;break;
    	case 3:this.nb_eff=1;
		   	   this.nb_depasse=0;
		       this.nb_encour=0;break;
    	}
    	
	
	}

	@Override
	public String toString() {
		 String ch="Adherent [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", t_Pret=" + t_Pret + ", nb_eff=" + nb_eff + ", nb_encour="
				+ nb_encour + ", nb_depasse=" + nb_depasse;
		 
		 if(this.retardataire==true)
			 ch+="Retardataire,";
		 else
			 ch+="non Retardataire,";
		 switch(this.type)
		 {
		 case 1:ch+="Etudiant]";break;
		 case 2:ch+="Enseignant]";break;
		 case 3:ch+="Visiteur]";break;
		 }
		 
		 return ch;
	}
	
	public void afficheAdherent()
	{
		System.out.println(this.toString());
	}
	


	


	
}

