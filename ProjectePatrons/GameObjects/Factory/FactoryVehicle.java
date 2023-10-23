package Factory;

import Definition.Objectes;
import Definition.TipusObjecte;
import Definition.Vehicles;
import tresors.CofreTresor;
import tresors.LingotOr;
import tresors.Moneda;
import vehicles.AlaDelta;
import vehicles.Barca;
import vehicles.Cotxe;
import vehicles.Patinet;

public class FactoryVehicle implements JocFactory<Objectes>{

	
	@Override
	public Objectes create(String nombre, TipusObjecte t) {
		System.out.println("S'ha creat un vehicle.");

		switch (nombre) {
		case "Ala":
			System.out.println("S'ha creat un ala delta.");
			return new AlaDelta(nombre);
		case "Barca":
			System.out.println("S'ha creat una barca.");
			return new Barca(nombre);
		case "Cotxe":
			System.out.println("S'ha creat un cotxe.");
			return new Cotxe(nombre);
		case "Patinet":
			System.out.println("S'ha creat un patinet.");
			return new Patinet(nombre);
		default:
			System.out.println("Objecte incorrecte");
			return null;
		}
	}



}
