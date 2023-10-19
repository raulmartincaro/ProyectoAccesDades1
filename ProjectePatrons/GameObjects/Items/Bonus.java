package Items;

public class Bonus implements Objectes{

	String nom;
	int punts;
	TipusObjecte tipus;
	
	public Bonus(String nom, int penalitzacio) {
		super();
		this.nom = nom;
		this.punts = penalitzacio;
		this.tipus= TipusObjecte.Bonus;
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
		return "Bonus [nom=" + nom + ", puntuacio=" + punts + ", tipus=" + tipus + "]";
	}

}
