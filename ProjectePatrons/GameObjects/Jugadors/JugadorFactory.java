package Jugadors;

public class JugadorFactory {

	public static Jugador createJugador(TipusJugador t) {
		Jugador j = new Jugador("nn", 1, 1) {
		};
		return j;
	}

}
