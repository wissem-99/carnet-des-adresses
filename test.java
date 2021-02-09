package exeman;
import java.util.Scanner;


public class test {
	 public static void main(String[] args) 
	    {
		 tab_client t=new tab_client();
		 tab_c_c in= new tab_c_c();
		
		 Scanner sc= new Scanner(System.in);
		 int choix;
		 do
		 {
		 System.out.println("Voici le menu suivante");
		 System.out.println("1 pour creer un compte");
		 System.out.println("2 pour consulter votre carnet");
		 System.out.println("0 pour quiter le programme");
		choix=sc.nextInt();
		 switch(choix)
		 {
		 case 1 :
		 { t.ajouter();
		 
		 client cli=t.retu();
		 carnet nv_carnet= new carnet();
		 record_c_c nn= new record_c_c(cli,nv_carnet);
		 in.ajouter(nn);
		 break;
		  }
		 case 2:
		 {
			 System.out.println("Donner votre cin");
               int cin = sc.nextInt();
              if( t.existe_c(cin))
            	  
              {  int ch;
            	  do
            	  {
            	  System.out.println("Donner Votre choix");
                   System.out.println("1 pour ajouter persone a votre carnet");
                   System.out.println("2 pour modification des personnes");
                   System.out.println("3 pour supprimer personne");
                   System.out.println(" 4 pour afficher votre carnet");
                   System.out.println(" 0 pour quiter la consultation");
                   ch =sc.nextInt();
                   switch(ch)
                   {
                   case 1 :
                   { in.ajouter_adr(cin);
                   break;}
                   case 2:
                   {in.update_adr(cin);
                   break;}
                   case 3:
                   {in.supp_adr(cin);
                   break;}
                   
           
                   case 4 :
                   {
                	   
                	   in.afficher(cin);
                	   break;
                   }
                   }
            	  }while(ch!=0);
              }
              else
              {
            	  System.out.println(" Client n existe pas ");
              }
		 break;
		 }
		 }
		 }while (choix!=0);
	    }
}
