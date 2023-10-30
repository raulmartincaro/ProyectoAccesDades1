package equipament;


import Definition.Equipaments;
import Definition.TipusObjecte;
import Jugadors.Jugador;
import Jugadors.JugadorDecorator;
import Jugadors.TipusJugador;



public class Espasa extends JugadorDecorator implements Equipaments{

	public Espasa(String nom,Jugadors.Jugador j) {
		super(j);
		this.nom = nom;
		this.tipus= TipusObjecte.Equipaments;
		this.duplicador=0.25f;
	}

	String nom;
	float duplicador;
	TipusObjecte tipus;
	
	public Espasa(String nom) {
		super(null);
		this.nom = nom;
		this.tipus= TipusObjecte.Equipaments;
		this.duplicador=0.25f;
	}
	
	public void addOwner(Jugadors.Jugador j) {
		super.Jugador = j;
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
	public String toString() {
		return "Espasa [nom=" + nom + ", duplicador=" + duplicador + ", tipus=" + tipus + "]";
	}

	@Override
	public TipusJugador GetTipus() {
		// TODO Auto-generated method stub
		return super.Jugador.GetTipus();
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
		return super.Jugador.getEquipments()+"Espasa ";
	}

	@Override
	public String getVheicle() {
		// TODO Auto-generated method stub
		return super.Jugador.getVheicle();
	}

	@Override
	public TipusObjecte getTipus() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
