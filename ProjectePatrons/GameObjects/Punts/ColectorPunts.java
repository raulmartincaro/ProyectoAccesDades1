package Punts;

import java.util.ArrayList;

import Jugadors.Jugador;

public class ColectorPunts {
	ArrayList<NotifyPunts> gamerObservers = new ArrayList<>();
	
	public void setPunts(int punts, TipusJugadorDelFactoryMethod j) {
		if(!gamerExists(j.getGamer()))
			gamerObservers.add(j);
		
		for(NotifyPunts np : gamerObservers) {
			if(np.getGamer().getNom() == j.getGamer().getNom()) {
				j.updatePunts(punts);
			}
		}
	}
	
	private boolean gamerExists(Jugador gamer) {
		for(NotifyPunts np : gamerObservers) {
			if(np.getGamer() == gamer)
				return true;
		}
		return false;
	}
	
	public void clear() {
		gamerObservers.clear();
	}
}