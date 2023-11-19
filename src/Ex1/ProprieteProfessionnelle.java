package Ex1;

public class ProprieteProfessionnelle extends Propriete {

	private int nbE;
	private boolean estEtatique;
	public ProprieteProfessionnelle	(int id,Personne p,String adr,double surf,int nbE,boolean estEtatique){
		super(id,p,adr,surf);
		this.nbE=nbE;
		this.estEtatique=estEtatique;
	}
	public int getNbE() {
		return nbE;
	}
	public void setNbE(int nbE) {
		this.nbE = nbE;
	}
	public boolean isEstEtatique() {
		return estEtatique;
	}
	public void setEstEtatique(boolean estEtatique) {
		this.estEtatique = estEtatique;
	}
	@Override
	public String toString()
	{
		return super.toString()+" nbEmployes: "+nbE+" estEtatique: "+estEtatique;
	}
	@Override
	public double calculImpot() {
		// TODO Auto-generated method stub
		double s=0;
		if(estEtatique ==false) 
			{
				s=(super.surf)+30*(nbE);
			}
		else
		{
			s=0;
		}
		return s;
	}
}
