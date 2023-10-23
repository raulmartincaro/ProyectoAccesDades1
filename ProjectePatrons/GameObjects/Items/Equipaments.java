package Items;

public class Equipaments implements Objectes{

	String nom;
	float duplicador;
	TipusObjecte tipus;
	
	public Equipaments(String nom) {
		super();
		this.nom = nom;
		this.tipus= TipusObjecte.Equipaments;
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
		return "Equipament [nom=" + nom + ", duplicador=" + duplicador + ", tipus=" + tipus + "]";
	}

}
