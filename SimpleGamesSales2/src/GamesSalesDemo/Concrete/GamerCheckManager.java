package GamesSalesDemo.Concrete;

import GamesSalesDemo.Abstract.IGamerCheckService;
import GamesSalesDemo.Entities.Gamer;

public class GamerCheckManager implements IGamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		return true;
	}

}
