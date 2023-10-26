package equipament;

import Definition.Equipaments;
import Definition.TipusObjecte;

public class Pistola implements Equipaments{

	String nom;
	float duplicador;
	TipusObjecte tipus;

	public Pistola(String nom) {
		super();
		this.nom = nom;
		this.tipus= TipusObjecte.Equipaments;
		this.duplicador= 0.5f;
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
		return "Pistola [nom=" + nom + ", duplicador=" + duplicador + ", tipus=" + tipus + "]";
	}
}