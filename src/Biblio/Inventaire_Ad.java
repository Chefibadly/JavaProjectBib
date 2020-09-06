package Biblio;

import java.util.*;

public class Inventaire_Ad {
    public java.util.ArrayList<Adherent> t_adherent=new ArrayList<Adherent>()    ;
   
	public int getNb1dherent() {
		return t_adherent.size();
	}
	public void ajouter_Adherent(Adherent p) {
		t_adherent.add(p);
    }
  public void Afficher_adherent()
    {
	  	for(int i=0;i<t_adherent.size();i++) {
	  		t_adherent.get(i).afficheAdherent();
	  	}

    }
  public void recherche_adherent(int id) {
	  for(int i=0;i<=t_adherent.size();i++) {
			if(t_adherent.get(i).id==id) {
				t_adherent.get(i).afficheAdherent();
				break;
			}else
				System.out.println("nexiste pas !!! ");
			}
				

		}
  public void supprime_Adherent(int id) {
	  for(int i=0;i<=t_adherent.size();i++) {
			if(t_adherent.get(i).id==id) {
				t_adherent.remove(i);
				break;
			}else
				System.out.println("nexiste pas !!! ");
			}
  }
  public void modifier_adherent(int id) {
	  Adherent ad = new Adherent();
	  int i;
	  		
	  for( i=0;i<this.t_adherent.size();i++) {
		  t_adherent.get(i).afficheAdherent();
		  if(this.t_adherent.get(i).id==id) {
			  ad.saisieAdherent();  	
			  this.t_adherent.set(i, ad);
			  break;
		  
	  }else
		  System.out.println("erreeuur");
	 
	  }
  }
 
  }

