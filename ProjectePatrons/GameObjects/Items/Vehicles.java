package Items;

public class Vehicles implements Objectes{

	String nom;
	TipusObjecte tipus;
	
	public Vehicles(String nom) {
		this.nom = nom;
		this.tipus= TipusObjecte.Vehicles;
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
		return "Vechicle [nom=" + nom + ", tipus=" + tipus + "]";
	}

}
