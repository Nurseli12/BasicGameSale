package GamesSalesDemo.Concrete;

import GamesSalesDemo.Abstract.IGamerCheckService;
import GamesSalesDemo.Entities.Gamer;

public class NewGamer extends GamerManager{
	
	private IGamerCheckService gamerCheckService;
		
	public NewGamer(IGamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void added(Gamer gamer) {
		try {
			if(gamerCheckService.checkIfRealPerson(gamer)) {
				super.added(gamer);
			}
			else {
				throw new Exception("Not a valid person");
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}



}
