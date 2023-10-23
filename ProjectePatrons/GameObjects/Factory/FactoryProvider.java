package Factory;

import Items.TipusObjecte;

public class FactoryProvider   {

	
	public JocFactory getFactory(TipusObjecte t) {
		switch (t) {
		case Bonus:
			System.out.println("S'ha creat una factoria de tipus bonus.");
			return new FactoryBonus();
		case Tresors:
			System.out.println("S'ha creat una factoria de tipus tresor.");
			return new FactoryTresors();
		case Vehicles:
			System.out.println("S'ha creat una factoria de tipus vehicle.");
			return new FactoryVehicle();
		case Equipaments:
			System.out.println("S'ha creat una factoria de tipus equipament.");
			return new FactoryEquipament();
		case Enemic:
			System.out.println("S'ha creat una factoria de tipus enemic.");
			return new FactoryEnemic();
		default:
			return null;

		}
	}

}