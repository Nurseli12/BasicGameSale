package GamesSalesDemo.Concrete;

import GamesSalesDemo.Abstract.IGamerService;
import GamesSalesDemo.Entities.Gamer;

public abstract class GamerManager implements IGamerService {

	@Override
	public void added(Gamer gamer) {
		System.out.println("The gamer added " + gamer.getFirstName());
		
	}

	@Override
	public void updated(Gamer gamer) {
		System.out.println("The gamer information updated " + gamer.getFirstName());
		
	}

	@Override
	public void deleted(Gamer gamer) {
		System.out.println("The gamer deleted " + gamer.getFirstName());
		
	}

}
