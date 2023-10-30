package Main;

import java.util.LinkedList;

import Definition.Bonus;
import Definition.Enemics;
import Definition.Equipaments;
import Definition.TipusObjecte;
import Definition.Tresors;
import Definition.Vehicles;
import Factory.FactoryBonus;
import Factory.FactoryEnemic;
import Factory.FactoryEquipament;
import Factory.FactoryProvider;
import Factory.FactoryTresors;
import Factory.FactoryVehicle;
import Jugadors.*;
import Punts.ObjecteGuanyat;
import equipament.Espasa;
import equipament.Laxant;
import equipament.Pistola;
import vehicles.Cotxe;

public class Main {

	public static void main(String[] args) {

		LinkedList<Jugador> pl = new LinkedList<Jugador>();
		// PILA AMB ELS JUGADORS

		// Creacio jugadors
		JugadorFactory jf = new JugadorFactory();
		Jugador j1 = jf.createJugador(TipusJugador.Comerciant, "Raul", 50);
		System.out.println("JUGADOR 1 CREAT: " + j1.toString());
		pl.add(j1);
		Jugador j2 = jf.createJugador(TipusJugador.Guerrer, "Brian", 55);
		System.out.println("JUGADOR 2 CREAT: " + j2.toString());
		pl.add(j2);

		Jugador j = new Pistola("MAtaadora",new Espasa("Excalibur", new ColorDecorator(j2, Color.AQUA)));
		
		

		System.out.println(j.getColor());
		System.out.println(j.getEquipments());

		Jugador j3 = jf.createJugador(TipusJugador.Explorador, "Pol", 30);
		System.out.println("JUGADOR 3 CREAT: " + j3.toString());
		pl.add(j3);

		System.out.println(pl.toString());
		// Creacio objectes
		FactoryProvider of = new FactoryProvider();

		FactoryTresors ft = (FactoryTresors) of.getFactory(TipusObjecte.Tresors);
		Tresors moneda = (Tresors) ft.create("Moneda", TipusObjecte.Tresors);
		System.out.println(moneda);

		/*FactoryVehicle fv = (FactoryVehicle) of.getFactory(TipusObjecte.Vehicles);
		Vehicles cotxe = (Vehicles) fv.create("Cotxe", TipusObjecte.Vehicles);
		System.out.println(cotxe);*/

		FactoryEnemic fe = (FactoryEnemic) of.getFactory(TipusObjecte.Enemic);
		Enemics pirata = (Enemics) fe.create("Pirata", TipusObjecte.Enemic);
		System.out.println(pirata);

		FactoryEquipament fequip = (FactoryEquipament) of.getFactory(TipusObjecte.Equipaments);
		Equipaments espasa = (Equipaments) fequip.create("Espasa", TipusObjecte.Equipaments);
		System.out.println(espasa);
		
		espasa.addOwner(j);
		
		System.out.println(espasa.getEquipments());

		FactoryBonus fb = (FactoryBonus) of.getFactory(TipusObjecte.Bonus);
		Bonus hamburguesa = (Bonus) fb.create("Hamburguesa", TipusObjecte.Bonus);
		System.out.println(hamburguesa);

		ObjecteGuanyat og = new ObjecteGuanyat();

		Espasa espasa2 = (Espasa) fequip.create("Espasa", TipusObjecte.Equipaments);
		espasa2.setNom("Hacedora de lloronas");
		System.out.println(espasa2);

		Laxant laxant2 = (Laxant) fequip.create("Laxant", TipusObjecte.Equipaments);
		laxant2.setNom("CagaMucho");
		System.out.println(laxant2);
//
//		Cotxe cotxe2 = (Cotxe) fv.create("Cotxe", TipusObjecte.Vehicles);
//		cotxe2.setNom("k7");
//		System.out.println(cotxe2);

		// System.out.println(j9.decorate());

		// +cotxe2.decorate()+espasa2.decorate()
		// Jugador j7 = new ColorDecorator(new Espasa (new Cotxe( new Laxant( new
		// Comerciant("j7", 0, 0),"CagaMucho"),"k7"),"Hacedora de
		// lloronas"),Color.AQUA);
		// System.out.println(j7.decorate());
	}
}
