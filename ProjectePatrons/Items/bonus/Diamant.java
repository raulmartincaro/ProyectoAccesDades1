package bonus;

import Definition.Bonus;
import Definition.TipusObjecte;

public class Diamant implements Bonus{

	String nom;
	int punts;
	TipusObjecte tipus;
	
	public Diamant(String nom) {
		this.nom = nom;
		this.tipus= TipusObjecte.Bonus;
		this.punts=5;
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
	public int getPunts() {
		// TODO Auto-generated method stub
		return punts;
	}


	@Override
	public String toString() {
		return "Diamant [nom=" + nom + ", puntuacio=" + punts + ", tipus=" + tipus + "]";
	}

}
