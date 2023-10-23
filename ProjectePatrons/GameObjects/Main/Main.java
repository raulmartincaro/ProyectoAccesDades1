package Main;

import Items.Bonus;
import Items.Enemics;
import Items.Equipaments;
import Items.JocFactory;
import Items.ObjecteFactory;
import Items.Objectes;
import Items.TipusObjecte;
import Items.Tresors;
import Items.Vehicles;
import Jugadors.Guerrer;
import Punts.ObjecteGuanyat;
import Punts.TipusJugadorDelFactoryMethod;

public class Main {

	public static void main(String[] args) {
		
//		ObjecteFactory of= new ObjecteFactory();
//		Tresors moneda=(Tresors) of.create("moneda", TipusObjecte.Tresors);
//		moneda.setPunts(10);
//		System.out.println(moneda);
//		
//		Vehicles cotxe=(Vehicles) of.create("cotxe", TipusObjecte.Vehicles);
//		System.out.println(cotxe);
//		
//		Enemics pirata =(Enemics) of.create("pirata", TipusObjecte.Enemic);
//		pirata.setPenalitzacio(50);
//		System.out.println(pirata);
//		
//		Equipaments espasa=(Equipaments) of.create("espasa", TipusObjecte.Equipaments);
//		espasa.setDuplicador(2.2f);
//		System.out.println(espasa);
//		
//		Bonus hamburguesa=(Bonus) of.create("hamburguesa", TipusObjecte.Bonus);
//		hamburguesa.setPunts(500);
//		System.out.println(hamburguesa);
		
		Guerrer guerrero1 = new Guerrer("Pepe", 0, 0);
		TipusJugadorDelFactoryMethod guerrero = new TipusJugadorDelFactoryMethod(guerrero1);
		
		Tresors a = (Tresors) new ObjecteFactory().create("Moneda", TipusObjecte.Tresors);
		a.setPunts(12);
		
		ObjecteGuanyat og = new ObjecteGuanyat();
		
		System.out.println(guerrero1);
		og.darObjetoAJugador(a, guerrero);
		System.out.println(guerrero1);
		
	}
}
