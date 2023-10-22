package Items;

public class Enemics implements Objectes{

	String nom;
	int penalitzacio;
	TipusObjecte tipus;
	
	public Enemics(String nom) {
		super();
		this.nom = nom;
		this.tipus= TipusObjecte.Enemic;
	}
	
	

	public int getPenalitzacio() {
		return penalitzacio;
	}



	public void setPenalitzacio(int penalitzacio) {
		this.penalitzacio = penalitzacio;
	}



	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return nom;
	}

	@Override
	public TipusObjecte getTipus() {
		// TODO Auto-generated method stub
		return tipus;
	}
	
	@Override
	public String toString() {
		return "Enemic [nom=" + nom + ", penalitzacio=" + penalitzacio + ", tipus=" + tipus + "]";
	}

}
