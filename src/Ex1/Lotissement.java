package Ex1;

import java.util.Scanner;

public class Lotissement implements GestionPropriete {

	protected Propriete[] tabProp;
	protected int nombre;
	Lotissement(int capacite)
	{
		if(capacite< MAX_PROPRIETES)
		{
			tabProp=new Propriete[capacite];
		}
		else
		{
			int n;
			do
			{
			System.out.println(" donner le nombre des proprietes");
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			}
			while((n<0)||(n>MAX_PROPRIETES));
			tabProp=new Propriete[n];
				
			
		}
		
	}
	
	
	@Override
	public boolean ajouter(Propriete p) {
		if(nombre<tabProp.length)
		{
			tabProp[nombre]=p;
			nombre++;
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	
	@Override
	public boolean supprimer(Propriete p) {

		int i=0;
		boolean estrouve=false;
		while((i<nombre)&&(estrouve ==false))
		{
			if(tabProp[i].equals(p))
			{
				estrouve=true;
			}
			else
			{
				i++;
			}
		}
		if(i<nombre)
		{
			for(int j=i;j<nombre-1;j++)
			{
				tabProp[j]=tabProp[j+1];
			}
			nombre--;
		}
		return estrouve;
	}
	@Override
	public void AfficherProprietes()
	{
		for(int i=0;i<nombre;i++)
		{
			System.out.println(tabProp[i]);
		}
	}
	public Propriete getProprietByindice(int i)
	{
		if((i>0)&&(i<nombre))
		{
			return tabProp[i];
		}
		else
		{
			return null;
		}
	}
	public int getnbPiece()
	{
		int s=0;
		for(int i=0;i<nombre;i++)
		{
			if(tabProp[i] instanceof ProprietePrivee)
			{
				s=s+((ProprietePrivee)tabProp[i]).nbPiece;
			}
		}
		return s;
	}
	void affichemoinsImpot()
	{
		int i=0;
		int p=0;
		boolean estrouve=false;
		while((i<nombre)&&(estrouve))
		{
			if(tabProp[i] instanceof ProprietePrivee)
			{
				estrouve=true;
			}
			else
			{
				i++;
			}
		}
		if(i<nombre)
		{
			p=i;
			for(int j=i;j<nombre;j++)
			{
				if(tabProp[j] instanceof ProprietePrivee)
				{
					if(tabProp[j].calculImpot() < tabProp[p].calculImpot())
					{
						p=j;
					}
					
				}
			}
			System.out.print(tabProp[p]);
		}
		else
		{
			System.out.println(" Il n'a pas de propriete privee");
		}
	}
	
}
