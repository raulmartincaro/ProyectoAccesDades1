package Factory;

import Definition.Enemics;
import Definition.Objectes;
import Definition.TipusObjecte;
import bonus.Diamant;
import bonus.Hamburguesa;
import bonus.RedBull;
import enemic.Bestia;
import enemic.Monstre;
import enemic.Pirata;

public class FactoryEnemic implements JocFactory<Objectes>{


	@Override
	public Objectes create(String nombre, TipusObjecte t) {
		System.out.println("S'ha creat un enemic.");
		switch(nombre) {
		case "Pirata":
			System.out.println("S'ha creat un pirata.");
			return new Pirata(nombre);
		case "Monstre":
			System.out.println("S'ha creat un monstre.");
			return new Monstre(nombre);
		case "Bestia":
			System.out.println("S'ha creat una bestia.");
			return new Bestia(nombre);
		default:
			System.out.println("Objecte incorrecte");
			return null;
		}
	
	}

}
