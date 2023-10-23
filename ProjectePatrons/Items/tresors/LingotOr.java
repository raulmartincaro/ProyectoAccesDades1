package tresors;

import Definition.TipusObjecte;
import Definition.Tresors;

public class LingotOr implements Tresors {

	String nom;
	int punts;
	TipusObjecte tipus;
	
	public LingotOr(String nom) {
		this.nom = nom;
		this.tipus= TipusObjecte.Tresors;
		this.punts=10;
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
		return "Lingot d'or [nom=" + nom + ", puntuacio=" + punts + ", tipus=" + tipus + "]";
	}
}
