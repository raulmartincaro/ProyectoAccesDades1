package Items;

public class FactoryTresors implements JocFactory<Objectes>{

	
	
	@Override
	public Objectes create(String n, TipusObjecte t, int n2) {
		System.out.println("S'ha creat un tresor.");

		return new Tresors(n,n2);
	}
	
	@Override
	public Objectes create(String n, TipusObjecte t) {
		return null;
	}

	@Override
	public Objectes create(String n, TipusObjecte t, float n2) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}