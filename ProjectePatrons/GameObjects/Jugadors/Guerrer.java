package Jugadors;

public class Guerrer implements Jugador {

	//VARIABLES CLASE
	String nom;
	int puntuacio;
	int saldo;
	TipusJugador tipus = TipusJugador.Guerrer;
	
	/*
	 * El constructor tipo Comerciant que extiende de la clase abstracta jugador
	 */
	public Guerrer(String nom, int puntuacio, int saldo) {
		this.nom = nom;
		this.saldo = saldo;
		this.puntuacio = puntuacio;
	}
	
	/* 
	 * GETTERS AND SETTERS
	 */

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
		this.puntuacio = puntuacio;
	}



	public int getSaldo() {
		return saldo;
	}



	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	/*
	 * @return El tipus de jugador que es
	 */

	@Override
	public TipusJugador GetTipus() {
		return tipus;
	}
	
	/*
	 * Metodo to string que devuelve un string con toda la informacion
	 * @return Un string con toda la infomacion del objeto
	 */
	@Override
	public String toString() {
		return "Exploraror [nom=" + nom + ", puntuacio=" + puntuacio + ", saldo=" + saldo + ", tipus=" + tipus + "]";
	}

}
