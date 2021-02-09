package exeman;

import java.util.Scanner;

public class tab_client {
private client[] tab_c;
private int nb_c;
public tab_client ()
{
	tab_c=new client[1000];
	nb_c=0;
}

public client retu()
{
	return tab_c[nb_c-1];
}

public boolean existe_c(int cin)
{boolean test = false;
	for(int i=0;i<nb_c;i++)
	{
		if(tab_c[i].getCin()==cin)
		{
			test=true;
			break;
		}
	}
		return test;
}
public void ajouter()
{ Scanner sc= new Scanner(System.in);
int c;
	do {
System.out.println("Donner votre CIN");
	 c=sc.nextInt();
	}while(existe_c(c));
	
	System.out.println("Donner votre Nom");
	String n=sc.next();
	System.out.println("Donner votre prenom");
	String pre=sc.next();
	
	client nv_c= new client(c,n,pre);
	 tab_c[nb_c]=nv_c;
	 nb_c++;
}


public void afficher()
{
	
	for(int i=0;i<nb_c;i++)
	{
	System.out.println("client numero ="+i+" :");
	System.out.println("Cin = "+tab_c[i].getCin());
	System.out.println("Nom = " + tab_c[i].getNom());
	System.out.println("Prenom = "+tab_c[i].getPrenom());
}
}
}
