package Items;

public class ObjecteFactory implements JocFactory<Objectes> {

	@Override
	public Objectes create(String n, TipusObjecte t) {
		switch (t) {
		case Bonus:
			return new Bonus(n);
		case Tresors:
			return new Tresors(n);
		case Vehicles:
			return new Vehicles(n);
		case Equipaments:
			return new Equipaments(n);
		case Enemic:
			return new Enemics(n);
		default:
			return null;

		}
	}

}