package Biblio;

import java.util.Scanner;

public class Magazine extends Document {
 public int freq;
public Scanner sc;
	public Magazine(String titre, int code, int nbr_exp, String localisation) {
		super(titre, nbr_exp, localisation);

	}
	
	public Magazine() {
		// TODO Auto-generated constructor stub
	}

	public void saisie()
	{
		super.saisie();
		 sc = new Scanner(System.in);
	 
	        System.out.println("donner la frequence de partition: ");
	        freq=sc.nextInt();
		
	}


	public void affiche() {
		super.affiche();
		System.out.println(" \nfreq=" + freq +"." );
	}
	
}
