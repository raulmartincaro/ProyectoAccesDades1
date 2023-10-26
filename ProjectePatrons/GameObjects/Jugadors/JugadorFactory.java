package Jugadors;

public class JugadorFactory {

	/*
	 * Es el metodo que crea los jugadores segun el tipo
	 * @param t es el tipo de jugador con el se creara el mismo, nom es el nombre del jugador, saldo es el saldo inicial del jugador
	 * @return un objeto tipo Comerciant, Explorador o Guerrer segun el tipo proporcionado
	 */
	public Jugador createJugador(TipusJugador t, String nom, int saldo) {
		if (t == TipusJugador.Comerciant) {
			return new Comerciant(nom, 0, saldo); //Retorna un jugador tipus Comerciant
		}else if (t == TipusJugador.Explorador) {
			return new Exploraror(nom, 0, saldo); //Retorna un jugador tipus Explorador
		}else if (t == TipusJugador.Guerrer) {
			return new Guerrer(nom, 0, saldo); //Retorna un jugador tipus Guerrer
		}
		return null;
	}
}
