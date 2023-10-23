package Jugadors;

public abstract class Jugador {

	String nom;
	int puntuacio;
	int saldo;

	public Jugador(String nom, int puntuacio, int saldo) {
		this.nom = nom;
		this.puntuacio = puntuacio;
		this.saldo = saldo;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPuntuacio() {
		return puntuacio;
	}

	public void setPuntuacio(int puntuacio) {
		this.puntuacio += puntuacio;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo += saldo;
	}

	@Override
	public String toString() {
		return "Jugador [nom=" + nom + ", puntuacio=" + puntuacio + ", saldo=" + saldo + "]";
	}

}
