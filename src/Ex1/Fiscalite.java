package Ex1;

public class Fiscalite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne p1=new Personne(14555,"aa","bb");
		Personne p2=new Personne(2233344,"zz","ee");
		Personne p3=new Personne(55666777,"rr","tt");
		/*Lotissement L=new Lotissement(10);
		/*Propriete P=new ProprietePrivee(1,p1,"Corniche",350,4);
		Propriete P1=new Villa(2,p2,"Dar Chaabane", 400,6,true);
*/
		/*L.ajouter(new ProprietePrivee(1,p1,"Corniche",350,4));
		L.ajouter(new Villa(2,p2,"Dar Chaabane", 400,6,true));
		L.ajouter(new Appartement(3,p2,"Hammamet",1200,8, 3));
		L.ajouter(new ProprieteProfessionnelle(4,p3,"Korba", 1000, 50,true));
		L.ajouter(new ProprieteProfessionnelle(5,p1,"Bir Bouragba",2500, 400, false));
		L.AfficherProprietes();
		System.out.println("Nb de piece global:"+L.getnbPiece());
		L.affichemoinsImpot();*/
		//System.out.println(L.supprimer(new Appartement(3,p2,"Hammamet",1200,8, 3)));
		//L.AfficherProprietes();
		Lotissement lt= new LotissementPrivee(10);
		lt.ajouter(new ProprietePrivee(1,p1,"Corniche",350,4));
		System.out.println(lt.ajouter(new Villa(2,p2,"Dar Chaabane", 400,6,true)));
		System.out.println(lt.ajouter(new Appartement(3,p2,"Hammamet",1200,8, 3)));
		System.out.println(lt.ajouter(new ProprieteProfessionnelle(4,p3,"Korba", 1000, 50,true)));
		System.out.println(lt.getProprietByindice(2));
		System.out.println(lt.getProprietByindice(1));
		System.out.println(lt.getnbPiece());
	}

}
