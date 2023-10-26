package Factory;

import Definition.Bonus;
import Definition.Objectes;
import Definition.TipusObjecte;
import bonus.Diamant;
import bonus.Hamburguesa;
import bonus.RedBull;

public class FactoryBonus implements JocFactory<Objectes> {

	@Override
	public Objectes create(String nombre, TipusObjecte t) {
		System.out.println("S'ha creat un bonus.");
		switch(nombre) {
		case "Hamburguesa":
			System.out.println("S'ha creat una hamburguesa.");
			return new Hamburguesa(nombre);
		case "Diamant":
			System.out.println("S'ha creat un diamant.");
			return new Diamant(nombre);
		case "RedBull":
			System.out.println("S'ha creat un redbull.");
			return new RedBull(nombre);
		default:
			System.out.println("Objecte incorrecte");
			return null;
		}
	
	}

	

}
