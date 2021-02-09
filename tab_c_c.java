package exeman;

public class tab_c_c {
record_c_c[] tab_r;
int nb_r;

public tab_c_c() {
	
	tab_r = new record_c_c[1000];
}

public void ajouter(record_c_c r)
{
tab_r[nb_r]=r;
nb_r++;
}

public void ajouter_adr( int cin)
{
	for( int i=0;i<nb_r;i++)
	{
		if(tab_r[i].getC().getCin()==cin)
		{ tab_r[i].getCc().ajouter();
		break;}
		
		}
}

public void update_adr(int cin)
{
	for( int i=0;i<nb_r;i++)
	{
		if(tab_r[i].getC().getCin()==cin)
		{ tab_r[i].getCc().update();
		break;}
		
		}
}

public void supp_adr( int cin)
{
	for( int i=0;i<nb_r;i++)
	{
		if(tab_r[i].getC().getCin()==cin)
		{ tab_r[i].getCc().supprimer();
		break;}
		
		}	
}



public void afficher(int cin ) {
	
	
	for(int i=0;i<nb_r;i++)
	{ int ch=tab_r[i].getC().getCin();
		if(ch==cin)
		{tab_r[i].getCc().afficher();
		break;}
		}
		
		
	}
}
