package Definition;

public class Enemics implements Objectes, Obtenible{

	String nom;
	int penalitzacio;
	TipusObjecte tipus;

	public Enemics(String nom, int pena) {
		super();
		this.nom = nom;
		this.tipus= TipusObjecte.Enemic;
		this.penalitzacio=pena;
	}

	public int getPunts() {
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
