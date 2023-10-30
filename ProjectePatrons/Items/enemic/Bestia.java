package enemic;

import Definition.Enemics;
import Definition.TipusObjecte;
import Definition.TreuPunts;

public class Bestia implements Enemics, TreuPunts{

	String nom;
	int penalitzacio;
	TipusObjecte tipus;

	public Bestia(String nom) {
		super();
		this.nom = nom;
		this.tipus= TipusObjecte.Enemic;
		this.penalitzacio=7;
	}

	@Override
	public int getPunts() {
		// TODO Auto-generated method stub
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
		return "Bestia [nom=" + nom + ", penalitzacio=" + penalitzacio + ", tipus=" + tipus + "]";
	}

	@Override
	public int RestaPunts() {
		return penalitzacio;
	}

	
	
}
