package vehicles;

import Definition.TipusObjecte;
import Definition.Vehicles;
import Jugadors.Jugador;
import Jugadors.JugadorDecorator;
import Jugadors.TipusJugador;

public class AlaDelta extends JugadorDecorator implements Vehicles {
	
	String nom;
	TipusObjecte tipus;
	
	public AlaDelta(Jugador object,String nom) {
		super(object);
		this.nom = nom;
		this.tipus= TipusObjecte.Vehicles;
	}
	
	public AlaDelta(String nom) {
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
		return "Ala delta [nom=" + nom + ", tipus=" + tipus + "]";
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
		return "conduciendo un ala delta con el nombre "+nom+" ";
	}
	

}