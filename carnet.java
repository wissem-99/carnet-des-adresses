package exeman;

import java.util.Arrays;
import java.util.Scanner;



public class carnet {

	private adresse[] tab;
	private int nb_adr;
	
	Scanner sc= new Scanner(System.in);
	public carnet() {
		 tab=new adresse[100];
		nb_adr=0;
	}



	public void ajouter()
	{
	
		if ( nb_adr==tab.length)
		{
			
			System.out.println("votre carnet est plein ");
		}
		else
		{
			System.out.println("remplir les informations suivantes :");
			System.out.println("Donner le nom :");
			String nom=sc.next();
			System.out.println("Donner le prenom :");
			String prenom=sc.next();
			String cat="";
			boolean test=false;
			System.out.println("catégorie disponibles : (ami, commerçant, artisan, médecin, connaissance\r\n"
					+ "professionnelle, connaissance de loisirs),");
			while (test==false) 
			{
			System.out.println("Donner la catégorie");
			cat=sc.next();
			if (cat.equals("ami") || cat.equals("commerçant") || cat.equals("artisan") || cat.equals("médecin") 
					|| cat.equals("connaissance") || cat.equals("professionnelle") || cat.equals("connaissance de loisirs"))
			{test=true; }
			}
			System.out.println("Donner l adresse");
			String adresse=sc.next();
			System.out.println("Donner la digicode ");
			String digicode=sc.next();
			System.out.println("Donner la code_postal");
			int code_postal=sc.nextInt();
			System.out.println("Donner le numero du telephone");
			int num=sc.nextInt();
			System.out.println("Donner l adresse email");
			String adr =sc.next();
			System.out.println("Donner les remarques");
			String rmq=sc.next();
			String date_modif="date ";
			adresse nv_adr = new adresse(nom,prenom,cat,adresse,digicode,code_postal,num,adr,date_modif,rmq);
			tab[nb_adr]=nv_adr;
			nb_adr++;
		}
	}
	public void supprimer()
	{
		System.out.println("Donner le numero du personne a supprimer ");
		int num=sc.nextInt();
		if(num+1>nb_adr)
		{System.out.println("numero n est pas valide");}
		else
		{
			for(int j=num;j<nb_adr;j++){
                tab[j]=tab[j+1];
                nb_adr--;
            }
			  System.out.println("operation de supprission terminee");      
		}
		
	}
	public void afficher()
	{ if(nb_adr-1<0)
		System.out.println("votre carnet est vide");
		for(int i=0;i<nb_adr;i++)
		{ System.out.println("le personne numero = "+i);
		   System.out.println(tab[i].getNom());  
		   System.out.println(tab[i].getPrenom());    
		   System.out.println(tab[i].getAdresse());    
		   System.out.println(tab[i].getCatégorie());    
		   System.out.println(tab[i].getCode_postal());    
		   System.out.println(tab[i].getDernier_modif());    
		   System.out.println(tab[i].getEmail());    
		   System.out.println(tab[i].getDigicode());    
		   System.out.println(tab[i].getNum_tel());    
		   System.out.println(tab[i].getRemarques());     
		   }
	}
	public void update() 
	{
		System.out.println("Donner le numero du personne a modifier ");
		int num=sc.nextInt();
		if(num>nb_adr-1)
		{System.out.println("numero n est pas valide");}
		else
		{ 
			System.out.println("Donner le champ a modifier selon les suivants : ");
			System.out.println("1 pour le nom");
			System.out.println("2 pour le prenom");
			System.out.println("3 pour l adresse");
			System.out.println("4 pour la catagorie");
			System.out.println("5 pour l email");
			System.out.println("6 pour la code postal");
			System.out.println("7 pour la numero du telephone");
			System.out.println("8 pour les remarques");
			System.out.println("9 pour la digicode");
			System.out.println("10 pour la date");
			System.out.println("0 pour QUITTER L option du modification");
			
			int c=sc.nextInt();
			
			switch (c)
			{ 
			    case 1 :
			    { System.out.println("Donner le nouveau nom");  
			      String nom=sc.next();
			      tab[num].setNom(nom);
			     System.out.println("Modification avec sucess");
			    break;
			    }
			case 2 :
			{System.out.println("Donner le nouveau prenom");  
		      String prenom=sc.next();
		      tab[num].setPrenom(prenom);
		      System.out.println("Modification avec sucess");
		      break;
			}
			case 3 :
			{System.out.println("Donner le nouveau adresse");  
		      String adr=sc.next();
		      tab[num].setAdresse(adr);
		      System.out.println("Modification avec sucess");
		      break;
			}
			case 4 :
			{System.out.println("Donner le nouveau categorie");  
		      String cat=sc.next();
		      tab[num].setCatégorie(cat);
		      System.out.println("Modification avec sucess");
		      break;
			}
			
			case 5 :
			{System.out.println("Donner le nouveau email");  
		      String email=sc.next();
		      tab[num].setEmail(email);
		      System.out.println("Modification avec sucess");
		      break;
			}
			case 6 :
			{System.out.println("Donner le nouveau code postal");  
		    int cp=sc.nextInt();
		      tab[num].setCode_postal(cp);
		      System.out.println("Modification avec sucess");
		      break;
			}
			case 7 :
			{System.out.println("Donner le nouveau numero du telephone");  
		      int num_t=sc.nextInt();
		      tab[num].setNum_tel(num_t);
		      System.out.println("Modification avec sucess");
		      break;
			}
			case 8 :
			{System.out.println("Donner le nouveau remarques");  
		      String rmq=sc.next();
		      tab[num].setRemarques(rmq);
		      System.out.println("Modification avec sucess");
		      break;
			}
			case 9 :
			{System.out.println("Donner le nouveau digicode");  
		      String dig =sc.next();
		      tab[num].setPrenom(dig);
		      System.out.println("Modification avec sucess");
		      break;
			}
			case 10 :
			{System.out.println("Donner le nouveau date");  
		      String date =sc.next();
		      tab[num].setDernier_modif(date);
		      System.out.println("Modification avec sucess");
		      break;
			}
			case 0 :
			{break;
			}
			
		}
	
		}}



}
