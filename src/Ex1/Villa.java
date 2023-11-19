package Ex1;

public class Villa extends ProprietePrivee {
	private boolean avecPiscine;
	public Villa(int id, Personne p, String adr, double surf, int nbPiece,boolean avecPiscine) {
		super(id, p, adr, surf, nbPiece);
		// TODO Auto-generated constructor stub
		this.avecPiscine=avecPiscine;
	}
	

	public boolean isAvecPiscine() {
		return avecPiscine;
	}
	public void setAvecPiscine(boolean avecPiscine) {
		this.avecPiscine = avecPiscine;
	}
	@Override
	public String toString()
	{
		return super.toString()+" AvecPiscine :"+avecPiscine;
	}
	@Override
	public double calculImpot()
	{
		double s=super.calculImpot()+200;
		return s;
	}
	
}
