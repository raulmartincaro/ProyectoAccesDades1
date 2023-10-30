package bonus;

import Definition.AugmentaPunts;
import Definition.Bonus;
import Definition.TipusObjecte;

public class Hamburguesa implements Bonus, AugmentaPunts{

	String nom;
	int punts;
	TipusObjecte tipus;
	
	public Hamburguesa(String nom) {
		this.nom = nom;
		this.tipus= TipusObjecte.Bonus;
		this.punts=1;
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
		return "Hamburguesa [nom=" + nom + ", puntuacio=" + punts + ", tipus=" + tipus + "]";
	}

	@Override
	public int SumaPunts() {
		return punts;
	}

	
	

}
