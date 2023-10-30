package equipament;

import Definition.Equipaments;
import Definition.TipusObjecte;
import Jugadors.Jugador;
import Jugadors.JugadorDecorator;
import Jugadors.TipusJugador;

public class Laxant extends JugadorDecorator implements Equipaments{

	public Laxant(String nom,Jugadors.Jugador j) {
		super(j);
		this.nom = nom;
		this.tipus= TipusObjecte.Equipaments;
		this.duplicador=2;
	}


	String nom;
	float duplicador;
	TipusObjecte tipus;

	
	public Laxant(String nom) {
		super(null);
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

	public void setNom(String n) {
		this.nom=n;
	}

	
	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return nom;
	}


	public TipusObjecte getTipus() {
		// TODO Auto-generated method stub
		return tipus;
	}

	@Override
	public String toString() {
		return "Laxant [nom=" + nom + ", duplicador=" + duplicador + ", tipus=" + tipus + "]";
	}


	
	private String aramadoCon() {
		return "armado con un laxante cuyo nombre es "+nom+" ";
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
		return super.Jugador.getEquipments()+"Laxant ";
	}


	@Override
	public String getVheicle() {
		// TODO Auto-generated method stub
		return super.Jugador.getVheicle();
	}


	@Override
	public void addOwner(Jugadors.Jugador j) {
		super.Jugador = j;
		
	}
}