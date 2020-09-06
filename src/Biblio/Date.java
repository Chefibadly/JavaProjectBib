package Biblio;


import java.util.Calendar;


public class Date {
public int jour;
public int mois;
public int annee;
 static int d2;
static int m2;


public Date(int jour, int mois, int annee) {
	super();
	this.jour = jour;
	this.mois = mois;
	this.annee = annee;
}
public Date() {
	// TODO Auto-generated constructor stub
}

public int getJour() {
	return jour;
}
public void setJour(int jour) {
	this.jour = jour;
}
public int getMois() {
	return mois;
}
public void setMois(int mois) {
	this.mois = mois;
}
public int getAnnee() {
	return annee;
}
public void setAnnee(int annee) {
	this.annee = annee;
}

static boolean isLeap(int y)  

{  

    if (y % 100 != 0 && y % 4 == 0 || y % 400 == 0)  

        return true;  

  

    return false;  

}  

  

 
public static void revoffsetDays(int offset, int y)  

{  

    int []month={ 0, 31, 28, 31, 30, 31, 30,  

                    31, 31, 30, 31, 30, 31 };  

  

    if (isLeap(y))  

        month[2] = 29;  

  

    int i;  

    for (i = 1; i <= 12; i++)  

    {  

        if (offset <= month[i])  

            break;  

        offset = offset - month[i];  

    }  

  

     d2 = offset;  

     m2 = i;  

}
static int offsetDays(Date D)  

{  
	int d=D.jour;
	int m=D.mois;
	int y=D.annee;
    int offset = d;  


    if(m - 1 == 11)  

        offset += 335; 

    if(m - 1 == 10) 

        offset += 304; 

    if(m - 1 == 9) 

        offset += 273; 

    if(m - 1 == 8) 

        offset += 243; 

    if(m - 1 == 7) 

        offset += 212; 

    if(m - 1 == 6) 

        offset += 181; 

    if(m - 1 == 5) 

        offset += 151; 

    if(m - 1 == 4) 

        offset += 120; 

    if(m - 1 == 3) 

        offset += 90; 

    if(m - 1 == 2) 

        offset += 59; 

    if(m - 1 == 1) 

        offset += 31;  

  

    if (isLeap(y) && m > 2)  

        offset += 1;  

  

    return offset;  

}

static Date addDays(Date D, int x)  

{  
	int y1=D.annee;

    int offset1 = offsetDays(D);  

    int remDays = isLeap(y1) ? (366 - offset1) : (365 - offset1);  

  

    

    int y2, offset2 = 0;  

    if (x <= remDays)  

    {  

        y2 = y1;  

        offset2 =offset1 + x;  

    }  

  

    else

    {  

          

        x -= remDays;  

        y2 = y1 + 1;  

        int y2days = isLeap(y2) ? 366 : 365;  

        while (x >= y2days)  

        {  

            x -= y2days;  

            y2++;  

            y2days = isLeap(y2) ? 366 : 365;  

        }  

        offset2 = x;  

    }  

    revoffsetDays(offset2, y2);  

    //System.out.println(d2+"/"+m2+"/"+y2);  
    Date D2= new Date(d2,m2,y2);
 return D2;
}


public Date Date_aujourdhui()
{
	Date D1=new Date();
	D1.jour=Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
	D1.mois=Calendar.getInstance().get(Calendar.MONTH)+1;
	D1.annee=Calendar.getInstance().get(Calendar.YEAR);
	return D1 ;
}

public int countLeapYears(Date d)  
{ 
    int years = d.annee; 

    
    if (d.mois <= 2)  
    { 
        years--; 
    } 

    
    return years / 4 - years / 100 + years / 400; 
} 




public  int getDifference(Date dt1, Date dt2) 
{ 
    
	
	int monthDays[] = {31, 28, 31, 30, 31, 30, 
            31, 31, 30, 31, 30, 31}; 
    int n1 = dt1.annee * 365 + dt1.jour; 
    
    
    for (int i = 0; i < dt1.mois - 1; i++)  
    { 
        n1 += monthDays[i]; 
    } 

   
    n1 += countLeapYears(dt1); 

    
    int n2 = dt2.annee * 365 + dt2.jour; 
    for (int i = 0; i < dt2.mois - 1; i++) 
    { 
        n2 += monthDays[i]; 
    } 
    n2 += countLeapYears(dt2); 

   
    return (n2 - n1); 
} 


void afficheDate() {
	System.out.println("\n"+jour+"/"+mois+"/"+annee+".\n");
}
@Override
public String toString() {
	return "Date [jour=" + jour + ", mois=" + mois + ", annee=" + annee + "]";
}
}
