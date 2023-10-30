package equipament;

import Definition.Equipaments;
import Definition.TipusObjecte;
import Jugadors.Jugador;
import Jugadors.JugadorDecorator;
import Jugadors.TipusJugador;

public class Laxant extends JugadorDecorator implements Equipaments{

	String nom;
	float duplicador;
	TipusObjecte tipus;

	public Laxant(Jugador object,String nom) {
		super(object);
		this.nom = nom;
		this.tipus= TipusObjecte.Equipaments;
		this.duplicador=0.25f;
	}
	
	public Laxant(String nom) {
		super();
		this.nom = nom;
		this.tipus= TipusObjecte.Equipaments;
		this.duplicador=2;
	}


	public float getDuplicador() {
		return duplicador;
	}


	public void setDuplicador(float duplicador) {
		this.duplicador = duplicador;
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
		return "Laxant [nom=" + nom + ", duplicador=" + duplicador + ", tipus=" + tipus + "]";
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
		return super.decorate()+ aramadoCon();
	}

	private String aramadoCon() {
		return "armado con un laxante cuyo nombre es "+nom+" ";
	}
}