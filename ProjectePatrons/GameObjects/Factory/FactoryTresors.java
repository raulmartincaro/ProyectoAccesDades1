package Factory;

import Definition.Objectes;
import Definition.TipusObjecte;
import Definition.Tresors;
import bonus.Diamant;
import bonus.Hamburguesa;
import bonus.RedBull;
import tresors.CofreTresor;
import tresors.LingotOr;
import tresors.Moneda;

public class FactoryTresors implements JocFactory<Objectes> {

	@Override
	public Objectes create(String nombre, TipusObjecte t) {
		System.out.println("S'ha creat un tresor.");
		switch (nombre) {
		case "Moneda":
			System.out.println("S'ha creat una moneda.");
			return new Moneda(nombre);
		case "Lingot":
			System.out.println("S'ha creat un lingot d'or.");
			return new LingotOr(nombre);
		case "Cofre":
			System.out.println("S'ha creat un cofre del tresor.");
			return new CofreTresor(nombre);
		default:
			System.out.println("Objecte incorrecte");
			return null;
		}

	}

}
