package vehicles;

import Definition.TipusObjecte;
import Definition.Vehicles;
import Jugadors.Jugador;
import Jugadors.JugadorDecorator;
import Jugadors.TipusJugador;

public class Patinet extends JugadorDecorator implements Vehicles{


	String nom;
	TipusObjecte tipus;
	
	public Patinet(Jugador object,String nom) {
		super(object);
		this.nom = nom;
		this.tipus= TipusObjecte.Vehicles;
	}
	
	public Patinet(String nom) {
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
		return "Patinet [nom=" + nom + ", tipus=" + tipus + "]";
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
	
	public String decorate() {
		return super.decorate()+ conduciendo();
	}

	private String conduciendo() {
		return "conduciendo un patinete con el nombre "+nom+" ";
	}
	
}
