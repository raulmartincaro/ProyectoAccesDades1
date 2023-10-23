package Items;

public class FactoryVehicle implements JocFactory<Objectes>{

	@Override
	public Objectes create(String n, TipusObjecte t, int n2) {
		return null;
	}
	
	@Override
	public Objectes create(String n, TipusObjecte t) {
		System.out.println("S'ha creat un vehicle.");

		return new Vehicles(n);
	}

	@Override
	public Objectes create(String n, TipusObjecte t, float n2) {
		// TODO Auto-generated method stub
		return null;
	}

}
