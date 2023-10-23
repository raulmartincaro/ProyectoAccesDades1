package Factory;

import Items.TipusObjecte;

public interface JocFactory <T>{
	T create (String n,TipusObjecte t);

	T create(String n, TipusObjecte t, int n2);
	
	T create(String n, TipusObjecte t, float n2);
}


