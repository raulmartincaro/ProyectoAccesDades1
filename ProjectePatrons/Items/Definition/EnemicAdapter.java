package Definition;

public class EnemicAdapter implements TreuPunts{

	private Enemics enemic;
	
	public EnemicAdapter(Enemics enemic) {
		super();
		this.enemic = enemic;
	}

	/*
	 * Adaptador per calcular els punts a restar del jugador
	 *  @return La cantitat a restar al jugador
	 */
	@Override
	public double RestaPunts() {
		double punts = enemic.getPunts(); //AGAFA ELS PUNTS ENEMICS
		punts = punts - (punts * 0.5); //ES DONA PER FET QUE PORTA EQUIPAT UNA ESPASA
		return punts; //RETORNA LA CANTITAT A RESTAR AL JUGADOR
	}
	
}
