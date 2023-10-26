package Jugadors;

public interface Jugador {

	TipusJugador GetTipus();
	String getNom();
	void setPuntuacio(int punts);
	String decorate();

}
