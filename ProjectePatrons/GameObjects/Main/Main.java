package Main;

import java.util.LinkedList;

import Items.Bonus;
import Items.Enemics;
import Items.Equipaments;
import Items.ObjecteFactory;
import Items.TipusObjecte;
import Items.Tresors;
import Items.Vehicles;
import Jugadors.*;

public class Main {

	public static void main(String[] args) {
		
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
		System.out.println(moneda);
		
		Vehicles cotxe=(Vehicles) of.create("cotxe", TipusObjecte.Vehicles);
		System.out.println(cotxe);
		
		Enemics pirata =(Enemics) of.create("pirata", TipusObjecte.Enemic);
		pirata.setPenalitzacio(50);
		System.out.println(pirata);
		
		Equipaments espasa=(Equipaments) of.create("espasa", TipusObjecte.Equipaments);
		espasa.setDuplicador(2);
		System.out.println(espasa);
		
		Bonus hamburguesa=(Bonus) of.create("hamburguesa", TipusObjecte.Bonus);
		hamburguesa.setPunts(500);
		System.out.println(hamburguesa);
		
		
		
	}
}
