package Ex1;

public class Appartement extends ProprietePrivee {
	private int numEtage;
	public Appartement(int id, Personne p, String adr, double surf, int nbPiece,int numEtage) {
		super(id, p, adr, surf, nbPiece);
		// TODO Auto-generated constructor stub
		this.numEtage=numEtage;
	}
	

	public int getNumEtage() {
		return numEtage;
	}
	public void setNumEtage(int numEtage) {
		this.numEtage = numEtage;
	}
	@Override
	public String toString()
	{
		return super.toString()+" NumEtage :"+numEtage;
	}
	
}
