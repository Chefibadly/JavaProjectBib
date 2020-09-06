package Biblio;

import java.util.ArrayList;

public class Inventaire_Doc {
	  
	  public java.util.ArrayList<Document> t_Doc;
	  
	  public Inventaire_Doc() {
		super();
		this.t_Doc=new ArrayList<Document>();
	
	}


	public int getNBlivre() {
		  return this.t_Doc.size();
	  }
	  
	  public void ajouter_Doc(Document D) {
		  this.t_Doc.add(D);
	    }

	  public void AfficheDoc()

	  {
		  for(int i=0;i<this.t_Doc.size();i++) {
				this.t_Doc.get(i).affiche();
		  	}

	  }


	  public boolean recherche_Doc(int code) {
		  boolean b=false;
		  if(this.t_Doc.size()==0)
			  return b;
		  for(int i=0;i<this.t_Doc.size();i++) {
				if(this.t_Doc.get(i).code==code) {
					this.t_Doc.get(i).affiche();
					b=true;
					return b;
				
				}
		  }
					return b;
			}
	  public boolean supprime_Doc(int code) {
		  boolean b=false;
		  if(this.t_Doc.size()==0)
			  return b;
		  for(int i=0;i<this.t_Doc.size();i++) {
				if(this.t_Doc.get(i).code==code) {
					this.t_Doc.remove(i);
					b=true;
					return b;
				}
				}
					return b;
	  }
	  public void modifier_Doc(int code) {
		  int i;
		  	if(this.t_Doc.size()==0)
		  		System.out.println("tableaux est vide");
		  	
		  for(i=0;i<this.t_Doc.size();i++) {
			  
			  if(this.t_Doc.get(i).code==code) {
					  t_Doc.get(i).saisie();
					  break;
				  }
		  }
	  }
  }
	  


