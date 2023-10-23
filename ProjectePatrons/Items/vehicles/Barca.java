package vehicles;

import Definition.TipusObjecte;
import Definition.Vehicles;

public class Barca implements Vehicles{

	String nom;
	TipusObjecte tipus;
	
	public Barca(String nom) {
		this.nom = nom;
		this.tipus= TipusObjecte.Vehicles;
		
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
		return "Barca [nom=" + nom + ", tipus=" + tipus + "]";
	}
	

}

