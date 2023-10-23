package Items;

public class FactoryBonus implements JocFactory<Objectes> {

	@Override
	public Objectes create(String nombre, TipusObjecte t, int valor) {
		System.out.println("S'ha creat un bonus.");
		return new Bonus(nombre,valor);
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
