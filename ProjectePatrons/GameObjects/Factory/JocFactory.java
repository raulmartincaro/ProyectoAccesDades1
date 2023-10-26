package Factory;

import Definition.TipusObjecte;

public interface JocFactory <T>{
	T create (String n,TipusObjecte t);

}


