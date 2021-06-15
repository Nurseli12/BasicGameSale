package GamesSalesDemo.Abstract;

import GamesSalesDemo.Entities.Campaign;
import GamesSalesDemo.Entities.Product;

public interface ICampaignService {
	void added(Campaign campaign);
	void updated(Campaign campaign);
	void deleted(Campaign campaign);


}
