package Jugadors;

public class ColorDecorator extends JugadorDecorator {
	Color c;
	
	public ColorDecorator(Jugadors.Jugador j, Color c) {
		super(j);
		this.c = c;
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

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return super.Jugador.getColor() + c;
	}

	@Override
	public String getEquipments() {
		// TODO Auto-generated method stub
		return super.Jugador.getEquipments();
	}

	@Override
	public String getVheicle() {
		// TODO Auto-generated method stub
		return super.Jugador.getVheicle();
	}

}
