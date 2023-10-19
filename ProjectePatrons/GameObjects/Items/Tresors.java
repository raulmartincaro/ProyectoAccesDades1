package Items;

public class Tresors implements Objectes{

	String nom;
	int punts;
	TipusObjecte tipus;
	
	public Tresors(String nom, int penalitzacio) {
		super();
		this.nom = nom;
		this.punts = penalitzacio;
		this.tipus= TipusObjecte.Tresors;
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return nom;
	}

	@Override
	public TipusObjecte getTipus() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		return "Enemic [nom=" + nom + ", penalitzacio=" + punts + ", tipus=" + tipus + "]";
	}

}
