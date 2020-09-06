package Biblio;


public class Pret {
	 Date date_jour;
	 Date Date_retour;
	 boolean pret;
	 Document D;
	 
	 
	 
	public Pret(Document d) {
		super();
		D = d;
	}



	public Date getDate_jour() {
		return date_jour;
	}



	public Pret() {
		
	}



	public void setDate_jour(Date date_jour) {
		this.date_jour = date_jour;
	}



	public Date getDate_retour() {
		return Date_retour;
	}



	public void setDate_retour(Date date_retour) {
		Date_retour = date_retour;
		
	}	
	
	public boolean isPret() {
		return pret;
	}



	public void setPret(boolean pret) {
		this.pret = pret;
	}




	@Override
	public String toString() {
		return "Pret [date_jour=" + date_jour + ", Date_retour=" + Date_retour + ", pret=" + pret
				+ ", code_doc_emp=" + this.D.code + "]";
	}
	 
	
	public void Emprunter(Adherent ad, Date d) {
		
		if(D.nbr_exp>=1 )
		{
			if(this.peut_emp(ad,d)==true)
			{
				this.setDate_jour(this.Date_retoure(ad).date_jour);
				this.setDate_retour(this.Date_retoure(ad).Date_retour);
				this.setPret(true);
				ad.nb_encour++;
				this.D.nbr_exp--;
				System.out.println(this.toString());
				ad.addPret(this);
			}else
			{
				System.out.println("il/elle ne peut pas emprunter consulter administration");
			}	
		}else
		{
			System.out.println("il n ya pas plus de document: "+D.titre);
			
		}
		
		
	}
	
	
	
	public Pret Date_retoure(Adherent d) {
		
		Date date=new Date();
		
			if(d.type==2) 
			{
				this.setDate_jour(date.Date_aujourdhui());
				this.setDate_retour(Date.addDays(this.getDate_jour(), 21));
				   
			}
			
			if(d.type==1 || d.type==3) 
			{
				this.setDate_jour(date.Date_aujourdhui());
				this.setDate_retour(Date.addDays(this.getDate_jour(), 7));
				   
			}
			
			return this;
	}

	public boolean peut_emp(Adherent ad, Date d){
		
		if(ad.type==2)
		{
			if (ad.nb_encour<ad.nb_eff && ad.retardataire==false)
					return true;
		}
		
		if(ad.type==1)
		{
			if (ad.nb_encour<ad.nb_eff && ad.retardataire==false)
					return true;
		}
		
		if(ad.type==3)
		{
			if (ad.nb_encour<ad.nb_eff && ad.retardataire==false)
					return true;
		}
		
		return false;
		
		
	
	}

	
}
