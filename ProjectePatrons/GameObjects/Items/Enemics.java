package Items;

public class Enemics implements Objectes{

	String nom;
	int penalitzacio;
	TipusObjecte tipus;
	
	public Enemics(String nom, int penalitzacio) {
		super();
		this.nom = nom;
		this.penalitzacio = penalitzacio;
		this.tipus= TipusObjecte.Enemic;
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
