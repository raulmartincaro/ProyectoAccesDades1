package Punts;

import Definition.Obtenible;

public class ObjecteGuanyat {
	ColectorPunts CP = new ColectorPunts();
	
	public void darObjetoAJugador(Obtenible object, TipusJugadorDelFactoryMethod gamer) {
		CP.setPunts(object.getPunts(), gamer);
	}
	
}