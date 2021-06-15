package GamesSalesDemo.Adapters;

import GamesSalesDemo.Abstract.IGamerCheckService;
import GamesSalesDemo.Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IGamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
	KPSPublicSoapProxy client = new KPSPublicSoapProxy();
	try {
		return client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()), gamer.getFirstName().toUpperCase(),
				gamer.getLastName().toUpperCase(), gamer.getDateOfBirth().getYear());
		
	}catch (Exception e) {
		
	}
	return false;
	
	}

}
