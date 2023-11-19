package Ex1;

public class ProprietePrivee extends Propriete {

	protected int nbPiece;
	public ProprietePrivee(int id, Personne p, String adr, double surf,int nbPiece) {
		super(id, p, adr, surf);
		// TODO Auto-generated constructor stub
		this.nbPiece=nbPiece;
	}
	public int getNbPiece() {
		return nbPiece;
	}
	public void setNbPiece(int nbPiece) {
		this.nbPiece = nbPiece;
	}
	@Override 
	public String toString()
	{
		return super.toString()+" NbPiece: "+nbPiece;
	}
	@Override
	public double calculImpot() {
		// TODO Auto-generated method stub
		
		double s=0;
		s=(super.surf)*(0.5)+(10*(nbPiece));
		return s;
	}
	
}
