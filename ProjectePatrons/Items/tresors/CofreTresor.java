package tresors;

import Definition.TipusObjecte;
import Definition.Tresors;

public class CofreTresor implements Tresors{


	String nom;
	int punts;
	TipusObjecte tipus;
	
	public CofreTresor(String nom) {
		this.nom = nom;
		this.tipus= TipusObjecte.Tresors;
		this.punts=50;
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
		return "Cofre del tresor [nom=" + nom + ", puntuacio=" + punts + ", tipus=" + tipus + "]";
	}

	
	
}
