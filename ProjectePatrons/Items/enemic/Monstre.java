package enemic;

import Definition.Enemics;
import Definition.TipusObjecte;

public class Monstre implements Enemics{

	String nom;
	int penalitzacio;
	TipusObjecte tipus;

	public Monstre(String nom) {
		super();
		this.nom = nom;
		this.tipus= TipusObjecte.Enemic;
		this.penalitzacio= 10;
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
		return "Monstre [nom=" + nom + ", penalitzacio=" + penalitzacio + ", tipus=" + tipus + "]";
	}

}
