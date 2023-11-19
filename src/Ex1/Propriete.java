package Ex1;

public abstract class Propriete {
	protected int Id;
	protected Personne responsable;
	protected String adr;
	protected double surf;
	public Propriete(int id,Personne p,String adr,double surf)
	{
		this.Id=id;
		this.responsable=p;
		this.adr=adr;
		this.surf=surf;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getAdr() {
		return adr;
	}
	public void setAdr(String adr) {
		this.adr = adr;
	}
	public double getSurf() {
		return surf;
	}
	public void setSurf(double surf) {
		this.surf = surf;
	}
	@Override 
	public String toString()
	{
		return "Id: "+Id+" Responsable: "+responsable+" Adresse: "+adr+" Surface: "+surf+" Calcul Impot:"+this.calculImpot();
		
	}
	public abstract double calculImpot();
	public String toStirng() {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean equals(Propriete p)
	{
		if(p!= null)
		{
			return (p.getId()== this.Id);
		}
		else
		{
			return false;
		}
	}
	
	
}
