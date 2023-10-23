package Main;

import Items.Bonus;
import Items.Enemics;
import Items.Equipaments;
import Items.FactoryBonus;
import Items.FactoryEnemic;
import Items.FactoryEquipament;
import Items.FactoryProvider;
import Items.FactoryTresors;
import Items.FactoryVehicle;
import Items.TipusObjecte;
import Items.Tresors;
import Items.Vehicles;

public class Main {

	public static void main(String[] args) {
		
		FactoryProvider of= new FactoryProvider();
		
		FactoryTresors ft=(FactoryTresors) of.getFactory(TipusObjecte.Tresors);	
		Tresors moneda=(Tresors) ft.create("moneda", TipusObjecte.Tresors,10);
		System.out.println(moneda);
		
		FactoryVehicle fv =(FactoryVehicle) of.getFactory(TipusObjecte.Vehicles);	
		Vehicles cotxe=(Vehicles) fv.create("cotxe", TipusObjecte.Vehicles);
		System.out.println(cotxe);
		
		FactoryEnemic fe =(FactoryEnemic) of.getFactory(TipusObjecte.Enemic);	
		Enemics pirata =(Enemics) fe.create("pirata", TipusObjecte.Enemic,50);
		System.out.println(pirata);
		
		FactoryEquipament fequip =(FactoryEquipament) of.getFactory(TipusObjecte.Equipaments);	
		Equipaments espasa=(Equipaments) fequip.create("espasa", TipusObjecte.Equipaments,2.2f);
		System.out.println(espasa);
		
		FactoryBonus fb =(FactoryBonus) of.getFactory(TipusObjecte.Bonus);	
		Bonus hamburguesa =(Bonus) fb.create("hamburguesa", TipusObjecte.Bonus,500);
		System.out.println(hamburguesa);
		
		
		
	}
}
