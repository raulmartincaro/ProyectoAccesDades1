package Jugadors;

public abstract class JugadorDecorator implements Jugador{

	private Jugador jugador;
	
	public JugadorDecorator(Jugador object){
		this.jugador=object;
	}
	
	public JugadorDecorator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String decorate() {
		return jugador.decorate();
	}
	
}
