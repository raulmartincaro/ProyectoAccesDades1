package Items;

public class Tresors implements Objectes, Obtenible{

	String nom;
	int punts;
	TipusObjecte tipus;
	
	public Tresors(String nom) {
		this.nom = nom;
		this.tipus= TipusObjecte.Tresors;
	}
	public int getPunts() {
		return punts;
	}

	public void setPunts(int punts) {
		this.punts = punts;
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
		return "Tresor [nom=" + nom + ", punts=" + punts + ", tipus=" + tipus + "]";
	}

}
