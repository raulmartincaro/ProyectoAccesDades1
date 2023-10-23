package Main;

import java.util.LinkedList;

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
import Jugadors.*;

public class Main {

	public static void main(String[] args) {
		
<<<<<<< HEAD
		FactoryProvider of= new FactoryProvider();
		
		FactoryTresors ft=(FactoryTresors) of.getFactory(TipusObjecte.Tresors);	
		Tresors moneda=(Tresors) ft.create("moneda", TipusObjecte.Tresors,10);
=======
		LinkedList<Jugador> pl = new LinkedList<Jugador>(); //PILA AMB ELS JUGADORS
		
		//Creacio jugadors
		JugadorFactory jf = new JugadorFactory();
		Jugador j1 = jf.createJugador(TipusJugador.Comerciant, "Raul", 50);
		System.out.println("JUGDAOR 1 CREAT: " + j1.toString());
		pl.add(j1);
		Jugador j2 = jf.createJugador(TipusJugador.Guerrer, "Brian", 55);
		System.out.println("JUGDAOR 2 CREAT: " + j2.toString());
		pl.add(j2);
		Jugador j3 = jf.createJugador(TipusJugador.Explorador, "Pol", 30);
		System.out.println("JUGDAOR 3 CREAT: " + j3.toString());
		pl.add(j3);
		
		//Creacio objectes
		ObjecteFactory of= new ObjecteFactory();
		Tresors moneda=(Tresors) of.create("moneda", TipusObjecte.Tresors);
		moneda.setPunts(10);
>>>>>>> FactoryMethod-players
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
