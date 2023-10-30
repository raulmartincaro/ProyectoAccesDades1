package Definition;

public class ObjectesAdapter implements AugmentaPunts {

	private Tresors tr;
	
	public ObjectesAdapter(Tresors tr) {
		super();
		this.tr = tr;
	}

	/*
	 * Metode que segons el equipament que te el jugador augmenta el seu valor y despres el retorna per sumar els punts
	 * @return Els punts a sumar al jugador
	 */
	@Override
	public double SumaPunts() {
		double punts = tr.getPunts(); //AGAFA ELS PUNTS
		punts = punts + (punts / 0.25); //ES DONA PER FET QUE PORTA EQUIPAT UNA PISTOLA
		return punts; //RETORNA ELS PUNTS A SUMAR AL JUGADOR
	}

}
