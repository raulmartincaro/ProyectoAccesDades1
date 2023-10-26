package Jugadors;

public class ColorDecorator extends JugadorDecorator {

	Color color;
	
	public ColorDecorator(Jugador object, Color c) {
		super(object);
		this.color=c;
	}

	@Override
	public TipusJugador GetTipus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPuntuacio(int punts) {
		// TODO Auto-generated method stub
		
	}
	
	public String decorate() {
		return super.decorate()+decorateColor();
	}
	
	
	private String decorateColor() {
		return "de color "+color+" ";
	}

}
