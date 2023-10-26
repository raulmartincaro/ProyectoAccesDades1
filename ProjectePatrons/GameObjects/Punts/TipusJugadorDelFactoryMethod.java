package Punts;

import Jugadors.Jugador;

public class TipusJugadorDelFactoryMethod implements NotifyPunts {
	private Jugador gamer;

	public TipusJugadorDelFactoryMethod(Jugador gamer) {
		this.gamer = gamer;
	}

	public Jugador getGamer() {
		return gamer;
	}

	@Override
	public void updatePunts(int punts) {
		gamer.setPuntuacio(punts);
	}
	
}