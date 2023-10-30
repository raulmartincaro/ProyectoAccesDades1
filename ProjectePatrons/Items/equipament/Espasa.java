package equipament;

import Definition.Equipaments;
import Definition.TipusObjecte;
import Jugadors.Jugador;
import Jugadors.JugadorDecorator;
import Jugadors.TipusJugador;


public class Espasa extends JugadorDecorator implements Equipaments {

	String nom;
	float duplicador;
	TipusObjecte tipus;

	public Espasa(Jugador object,String nom) {
		super(object);
		this.nom = nom;
		this.tipus= TipusObjecte.Equipaments;
		this.duplicador=0.25f;
	}

	public Espasa(String nom) {
		super();
		this.nom = nom;
		this.tipus= TipusObjecte.Equipaments;
		this.duplicador=0.25f;
	}

	public float getDuplicador() {
		return duplicador;
	}


	public void setDuplicador(float duplicador) {
		this.duplicador = duplicador;
	}

	
	public void setNom(String n) {
		this.nom=n;
	}

	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public TipusObjecte getTipus() {
		// TODO Auto-generated method stub
		return tipus;
	}

	@Override
	public String toString() {
		return "Espasa [nom=" + nom + ", duplicador=" + duplicador + ", tipus=" + tipus + "]";
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
		return "armado con un espada cuyo nombre es "+nom+" ";
	}

	
}
