package Definition;

import Jugadors.Jugador;

public interface Equipaments extends Objectes, Jugador {

	float getDuplicador();
	String getNom();
	TipusObjecte getTipus();
	public void addOwner(Jugadors.Jugador j);
}
