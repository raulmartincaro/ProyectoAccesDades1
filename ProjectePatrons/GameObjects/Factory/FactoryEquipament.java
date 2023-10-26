package Factory;

import Definition.Equipaments;
import Definition.Objectes;
import Definition.TipusObjecte;
import bonus.Diamant;
import bonus.Hamburguesa;
import bonus.RedBull;
import equipament.Espasa;
import equipament.Laxant;
import equipament.Pistola;

public class FactoryEquipament implements JocFactory<Objectes>{

	
	@Override
	public Objectes create(String nombre, TipusObjecte t) {
		System.out.println("S'ha creat un equipament.");
		switch(nombre) {
		case "Espasa":
			System.out.println("S'ha creat una espasa.");
			return new Espasa(nombre);
		case "Laxant":
			System.out.println("S'ha creat un laxant.");
			return new Laxant(nombre);
		case "Pistola":
			System.out.println("S'ha creat una pistola.");
			return new Pistola(nombre);
		default:
			System.out.println("Objecte incorrecte");
			return null;
		}
	
	}

	

	

}
