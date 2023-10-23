package Items;

public class FactoryEquipament implements JocFactory<Objectes>{

	
	
	@Override
	public Objectes create(String n, TipusObjecte t, int n2) {
		return null;
	}
	
	@Override
	public Objectes create(String n, TipusObjecte t) {
		return null;
	}

	@Override
	public Objectes create(String n, TipusObjecte t, float n2) {
		System.out.println("S'ha creat un equipament.");
		return new Equipaments(n,n2);
	}

	

	

}
