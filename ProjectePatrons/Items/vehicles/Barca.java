package vehicles;

import Definition.TipusObjecte;
import Definition.Vehicles;
import Jugadors.Jugador;
import Jugadors.JugadorDecorator;
import Jugadors.TipusJugador;

public class Barca extends JugadorDecorator implements Vehicles{

	String nom;
	TipusObjecte tipus;
	
	public Barca(Jugador object,String nom) {
		super(object);
		this.nom = nom;
		this.tipus= TipusObjecte.Vehicles;
	}
	
	public Barca(String nom) {
		super(null);
		this.nom = nom;
		this.tipus= TipusObjecte.Vehicles;
		
	}

	public void setNom(String n) {
		this.nom=n;
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

	@Override
	public TipusJugador GetTipus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPuntuacio(int punts) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return super.Jugador.getColor();
	}


	@Override
	public String getEquipments() {
		// TODO Auto-generated method stub
		return super.Jugador.getEquipments();
	}


	@Override
	public String getVheicle() {
		// TODO Auto-generated method stub
		return super.Jugador.getVheicle() +"Barca ";
	}


	@Override
	public void addOwner(Jugadors.Jugador j) {
		super.Jugador = j;
		
	}
}

