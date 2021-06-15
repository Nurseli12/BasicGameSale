package GamesSalesDemo.Abstract;

import GamesSalesDemo.Entities.Gamer;

public interface IGamerService {
	void added(Gamer gamer);
	void updated(Gamer gamer);
	void deleted(Gamer gamer);
	
	
}
