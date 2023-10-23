package Items;

public class Bonus implements Objectes{

	String nom;
	int punts;
	TipusObjecte tipus;
	
	public Bonus(String nom, int puntillos) {
		super();
		this.nom = nom;
		this.tipus= TipusObjecte.Bonus;
		this.punts=puntillos;
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
		return tipus;
	}
	
	@Override
	public String toString() {
		return "Bonus [nom=" + nom + ", puntuacio=" + punts + ", tipus=" + tipus + "]";
	}

}
