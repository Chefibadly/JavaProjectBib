package Biblio;

import java.util.Scanner;

public class Principale {

	public  Inventaire_Ad t = new Inventaire_Ad();
	public  Inventaire_Doc Objet = new Inventaire_Doc();
	public  Document D=new Document();
	public  Adherent ad=new Adherent();
	public  Scanner sc=new Scanner(System.in);
	
	public Date d=new Date();
	public void menu() {
		int choix=0;
		do {
	        System.out.println(" _________*Bienvenu Dans Le Menu Principale*_________\n\n");
	        
	        System.out.println("   (1).Gestion de Bibliotheque.\n");
	        System.out.println("   (2).Gestion d'Adherent.\n");
	        System.out.println("   (3).Emprunt Document.\n");
	        System.out.println("   (4).Lister les documents\n");
	        System.out.println("   (5).Lister les adherents\n ");
	        System.out.println("   (0).Quitter le programme.\n");
	        System.out.println(" 	  .Veuillez saisir votre choix SVP :    \n");
	        System.out.println("__________________________________________________________________________");
	        
	        choix = sc.nextInt();
	        switch(choix)
	        {
	        case 0:
	        	System.out.println("Fermeture de l'application.....");
            	System.exit(0);
            	break;
	        case 1:
	        	Document();
	        	break;
	        case 2:
	        	Adherent();
	        	break;
	        case 3:
	        	System.out.println("donner l'id de document a emprunter");
	        	int id1=sc.nextInt();
	        	System.out.println("donner l'id de l'adherent");
	        	int id2=sc.nextInt();
	        	
	        	for(int i=0;i<this.Objet.t_Doc.size();i++) {
					if(this.Objet.t_Doc.get(i).code==id1) {
						for(int j=0;j<this.t.t_adherent.size();j++) {
			    			if(this.t.t_adherent.get(j).id==id2) {
			    				Pret p=new Pret(this.Objet.t_Doc.get(i));
			    				//tester
			    				//Date d2=new Date(20,6,2020);
			    				//this.t.t_adherent.get(j).retardataire(d2);
			    	        	p.Emprunter(this.t.t_adherent.get(j),d.Date_aujourdhui());
			    			}}
						  }
					}break;
	        case 4:
	        	Objet.AfficheDoc();
	        	break;
	        case 5:
	        	t.Afficher_adherent();
	        	break;
	        }
	        
	        
	        
	        
	    	}while(choix!=0);
	        
					}

	public void Adherent()
    {
		int choixAd=0;
		do {
    	 System.out.println("  _________*Gestion d'Adherent*_________\n\n");
         System.out.println("        (21).Ajouter\n    ");
         System.out.println("        (22).Modifier\n  ");
         System.out.println("        (23).Supprimer\n ");
         System.out.println("        (24).Chercher \n ");
         System.out.println("        (25).Retour  Menu Principal\n");
         System.out.println("        (20).Quitter le programme.\n");
         System.out.println("	.Veuillez saisir votre choix SVP\n");
         System.out.println("________________________________________________________________________________");
         choixAd = sc.nextInt();
         switch(choixAd) {
         case 20:
        	 System.out.println("Fermeture de l'application.....");
        	 System.exit(0);
        	 break;
         case 21:
        	 Adherent ad=new Adherent();
 					ad.saisieAdherent();  		
 					t.ajouter_Adherent(ad);
 					System.out.println("Adherent ajout avec succés.....");
 					break;
         case 22:
        	 	System.out.println("donner un id pour modifier :\n");
				int c;
				c=sc.nextInt();
				t.modifier_adherent(c);
				break;
         case 23:
        	 System.out.println("donner un identifiant pour supprimer Le :\n");
        	 int n=sc.nextInt();
        	 t.supprime_Adherent(n);
        	 break;
        	 
         case 24:
         	System.out.println("donner un id pour chercher :\n");
				int d;
				d=sc.nextInt();
				t.recherche_adherent(d);
         	break;
         case 25:menu();
         break;
         default:System.out.println("Choix invalide ! veuillez le réessayer..");break;
         }
		}while(choixAd!=20);
    }
	public  void Document() {
		int choixDoc =0;
		do {
		System.out.println("  _________* Document*_________\n\n");
        System.out.println(" (11).Livres\n");
        System.out.println(" (12).Articles\n");
        System.out.println(" (13).Magazines\n");             
        System.out.println(" (14).Retour Menu Principale\n");
        System.out.println(" (10).Quitter le programme\n");
        System.out.println("    **veuillez saisir votre choix**");
        System.out.println("______________________________________");
        
       choixDoc = sc.nextInt();
       
       switch(choixDoc) {
       case 10:
    	   	System.out.println("Fermeture de l'application.....");
    	   	System.exit(0);
    	   	break;
       case 11:
    	   LivreMenu();
    	   break;
       case 12:
    	   MagazineMenu();
    	   break;
       case 13:
    	   ArticleMenu();
    	   break;
       case 14:menu();break;
    	  default:System.out.println("Choix invalide ! veuillez le réessayer..");break;

       }

       }while(choixDoc!=10);
       
	
	
	}
	
	 public void LivreMenu()
	    {
		 int choixLiv=0;
		 do {
	    	 System.out.println("_________*Gestion des Livres*_________\n\n");
	    	 System.out.println("   (31).Ajouter Livre\n");
	    	 System.out.println("   (32).Modifier Livre\n");
	         System.out.println("   (33).Supprimer Livre\n");
	         System.out.println("   (34).Chercher Livre\n");
	         System.out.println("   (35).Page Precedent\n"); 
	         System.out.println("   (36).Retour Menu Principal\n");
	         System.out.println("   (30).Quitter le programme\n");
	         System.out.println("       .Veuillez saisir votre choix\n");
	         System.out.println("_________________________________________\n");
	    choixLiv=sc.nextInt();
	    switch(choixLiv) {
	    case 30:
	    	System.out.println("Fermeture de l'application.....");
    	   	System.exit(0);
    	   	break;
	    case 31:Livre L=new Livre();
				L.saisie();
				Objet.ajouter_Doc(L);
				System.out.println("Document ajout avec succés.....");
				break;
	    case 32:System.out.println("donner un id pour modifier :\n");
				int c;
				c=sc.nextInt();
				Objet.modifier_Doc(c);
				
				break;
	    case 33:
	    	System.out.println("donner un identifient pour supprimer :\n");
    		int n=sc.nextInt();
    		if(Objet.supprime_Doc(n)==false) 
    			System.out.println("erreur supprimer ");
    		else
    			Objet.AfficheDoc();
    		
    		break;
	    case 34:System.out.println("donner un id pour chercher :\n");
				int d;
				d=sc.nextInt();
				if(Objet.recherche_Doc(d)==false)
					System.out.println("n'existe pas !!! ");
    		break;
	    case 35:Document();break;
	    case 36:menu();break;
	    default:System.out.println("Choix invalide ! veuillez le réessayer..");break;
	    
	    
	    }
		 }while(choixLiv!=30);
	    	
	    }
	 public void MagazineMenu()
	    {
		 int choisMag=0;
		 do {
	    	 System.out.println("_________*Gestion des Magazines*_________\n\n");
	    	 System.out.println("   (40).Quitter le programme\n");
	    	 System.out.println("   (41).Ajouter Magazine\n");
	    	 System.out.println("   (42).Modifier Magazine\n");
	         System.out.println("   (43).Supprimer Magazine\n");
	         System.out.println("   (44).Chercher Magazine\n");
	         System.out.println("   (45).Page Precedent\n"); 
	         System.out.println("   (46).Retour Menu Principal\n");
	         System.out.println("       .Veuillez saisir votre choix\n");
	         System.out.println("_________________________________________\n");
	         choisMag=sc.nextInt();
	         
	         switch(choisMag) {
	         case 40:
	 	    	System.out.println("Fermeture de l'application.....");
	     	   	System.exit(0);
	     	   	break;
		 case 41:
			
				Magazine M=new Magazine();
				M.saisie();
				Objet.ajouter_Doc(M);
				break;
				
			case 42:
				System.out.println("donner un id pour modifier :\n");
				int c;
				c=sc.nextInt();
				Objet.modifier_Doc(c);
				break;
				
			
				
			case 43:
			
				System.out.println("donner un identifient pour supprimer :\n");
				int n=sc.nextInt();
				if(Objet.supprime_Doc(n)==false)
					System.out.println("Article n'existe pas");
 		        break;
					
			
			case 44:
				System.out.println("donner un id pour chercher :\n");
				int d;
				d=sc.nextInt();
				if(Objet.recherche_Doc(d)==false)
					System.out.println("n'existe pas !!! ");
				
         		break;
			case 45:Document();break;
		    case 46:menu();break;
		    default:System.out.println("Choix invalide ! veuillez le réessayer..");break;
	         }
		 }while(choisMag!=40);
	    }
	 public void ArticleMenu()
	    {
		 int choixArt=0;
		 do {
	    	 System.out.println("_________*Gestion des Articles*_________\n\n");
	    	 System.out.println("   (51).Ajouter Article\n");
	    	 System.out.println("   (52).Modifier Article\n");
	         System.out.println("   (53).Supprimer Article\n");
	         System.out.println("   (54).Chercher Article\n");
	         System.out.println("   (55).Page Precedent\n"); 
	         System.out.println("   (56).Retour Menu Principal\n");
	         System.out.println("   (50).Quitter le programme\n");
	         System.out.println("       .Veuillez saisir votre choix\n");
	         System.out.println("_________________________________________\n");
	    choixArt=sc.nextInt();
	    switch(choixArt) {
        case 50:
	    	System.out.println("Fermeture de l'application.....");
    	   	System.exit(0);
    	   	break;
	 case 51:
			Magazine M=new Magazine();
			M.saisie();
			Objet.ajouter_Doc(M);
			break;
		case 52:
			System.out.println("donner un id pour modifier :\n");
			int c;
			c=sc.nextInt();
			Objet.modifier_Doc(c);
			break;
		case 53:
			System.out.println("donner un identifient pour supprimer :\n");
			int n=sc.nextInt();
			if(Objet.supprime_Doc(n)==false)
				System.out.println("Article n'existe pas");
	        break;
				
		case 54:
			System.out.println("donner un id pour chercher :\n");
			int d;
			d=sc.nextInt();
			if(Objet.recherche_Doc(d)==false)
				System.out.println("n'existe pas !!! ");
    		break;
		case 55:Document();break;
	    case 56:menu();break;
	    default:System.out.println("Choix invalide ! veuillez le réessayer..");break;
        }
		 }while(choixArt!=50);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principale P=new Principale();
		P.menu();

	}

}
