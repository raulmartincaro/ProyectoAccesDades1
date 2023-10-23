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

public class Main {

	public static void main(String[] args) {

		LinkedList<Jugador> pl = new LinkedList<Jugador>();
		//PILA AMB ELS JUGADORS

		//Creacio jugadors
		JugadorFactory jf = new JugadorFactory();
		Jugador j1 = jf.createJugador(TipusJugador.Comerciant, "Raul", 50);
		System.out.println("JUGADOR 1 CREAT: " + j1.toString());
		pl.add(j1);
		Jugador j2 = jf.createJugador(TipusJugador.Guerrer, "Brian", 55);
		System.out.println("JUGADOR 2 CREAT: " + j2.toString());
		pl.add(j2);
		Jugador j3 = jf.createJugador(TipusJugador.Explorador, "Pol", 30);
		System.out.println("JUGADOR 3 CREAT: " + j3.toString());
		pl.add(j3);

		System.out.println(pl.toString());
		//Creacio objectes
		FactoryProvider of= new FactoryProvider();

		FactoryTresors ft=(FactoryTresors) of.getFactory(TipusObjecte.Tresors);
		Tresors moneda=(Tresors) ft.create("Moneda", TipusObjecte.Tresors);
		System.out.println(moneda);

		FactoryVehicle fv =(FactoryVehicle) of.getFactory(TipusObjecte.Vehicles);
		Vehicles cotxe=(Vehicles) fv.create("Cotxe", TipusObjecte.Vehicles);
		System.out.println(cotxe);

		FactoryEnemic fe =(FactoryEnemic) of.getFactory(TipusObjecte.Enemic);
		Enemics pirata =(Enemics) fe.create("pirata", TipusObjecte.Enemic,50);
		System.out.println(pirata);

		FactoryEquipament fequip =(FactoryEquipament) of.getFactory(TipusObjecte.Equipaments);
		Equipaments espasa=(Equipaments) fequip.create("espasa", TipusObjecte.Equipaments,2.2f);
		System.out.println(espasa);

		FactoryBonus fb =(FactoryBonus) of.getFactory(TipusObjecte.Bonus);
		Bonus hamburguesa =(Bonus) fb.create("Hamburguesa", TipusObjecte.Bonus);
		System.out.println(hamburguesa);

		ObjecteGuanyat og = new ObjecteGuanyat();

	}
}
