package Factory;

import Definition.Enemics;
import Definition.Objectes;
import Definition.TipusObjecte;

public class FactoryEnemic implements JocFactory<Objectes>{


	@Override
	public Objectes create(String n, TipusObjecte t, int n2) {
		
	System.out.println("S'ha creat un enemic.");

		return new Enemics(n, n2);
	}

	@Override
	public Objectes create(String n, TipusObjecte t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Objectes create(String n, TipusObjecte t, float n2) {
		// TODO Auto-generated method stub
		return null;
	}

}
