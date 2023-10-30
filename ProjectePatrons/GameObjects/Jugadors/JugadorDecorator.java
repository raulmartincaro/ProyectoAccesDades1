package Jugadors;

public abstract class JugadorDecorator implements Jugador{
	public Jugador Jugador;
	
	public JugadorDecorator(Jugador j){
		Jugador=j;
	}
}
