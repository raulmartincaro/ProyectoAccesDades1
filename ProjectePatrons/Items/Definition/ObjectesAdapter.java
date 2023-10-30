package Definition;

public class ObjectesAdapter implements AugmentaPunts {

	private Tresors tr;
	private Bonus bn;
	
	public ObjectesAdapter(Tresors tr) {
		super();
		this.tr = tr;
		this.bn = null;
	}
	public ObjectesAdapter(Bonus bn) {
		super();
		this.bn = bn;
		this.tr = null;
	}

	/*
	 * Metode que segons el equipament que te el jugador augmenta el seu valor y despres el retorna per sumar els punts
	 * @return Els punts a sumar al jugador
	 */
	@Override
	public double SumaPunts() {
		double punts = 0;
		if (bn == null) {
			punts = tr.getPunts(); //AGAFA ELS PUNTS
			punts = punts + (punts / 0.25); //ES DONA PER FET QUE PORTA EQUIPAT UNA PISTOLA
			
		}else if (tr == null) {
			punts = bn.getPunts(); //AGAFA ELS PUNTS
			punts = punts + (punts / 0.25); //ES DONA PER FET QUE PORTA EQUIPAT UNA PISTOLA
			
		}
		return punts; //RETORNA ELS PUNTS A SUMAR AL JUGADOR
	}

}
