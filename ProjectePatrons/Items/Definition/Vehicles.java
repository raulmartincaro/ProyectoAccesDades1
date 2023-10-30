package Definition;

import Jugadors.Jugador;

public interface Vehicles extends Objectes , Jugador{

	String getNom();
	TipusObjecte getTipus();
	public void addOwner(Jugadors.Jugador j);

}
