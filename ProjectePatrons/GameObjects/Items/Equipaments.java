package Items;

public class Equipaments implements Objectes{

	String nom;
	float duplicador;
	TipusObjecte tipus;
	
	public Equipaments(String nom, int penalitzacio) {
		super();
		this.nom = nom;
		this.duplicador = penalitzacio;
		this.tipus= TipusObjecte.Equipaments;
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
		return "Equipament [nom=" + nom + ", penalitzacio=" + duplicador + ", tipus=" + tipus + "]";
	}

}
