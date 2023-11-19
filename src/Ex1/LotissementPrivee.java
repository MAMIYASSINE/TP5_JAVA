package Ex1;

public class LotissementPrivee extends Lotissement {

	LotissementPrivee(int capacite) {
		super(capacite);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean ajouter(Propriete p) {
		if(p instanceof ProprietePrivee)
		{
			if(super.nombre<super.tabProp.length)
			{
				super.tabProp[super.nombre]=p;
				super.nombre++;
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
		
	}
	@Override
	public ProprietePrivee getProprietByindice(int i)
	{
		if((i>0)&&(i<super.nombre))
		{
			return (ProprietePrivee) super.tabProp[i];
		}
		else
		{
			return null;
		}
	}
	@Override
	public int getnbPiece()
	{
		int s=0;
		for(int i=0; i<super.nombre;i++)
		{
			s=s+((ProprietePrivee)super.tabProp[i]).nbPiece;
		}
		return s;
	}
	

}
