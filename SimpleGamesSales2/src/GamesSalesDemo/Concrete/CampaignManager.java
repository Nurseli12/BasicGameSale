package GamesSalesDemo.Concrete;

import GamesSalesDemo.Abstract.ICampaignService;
import GamesSalesDemo.Entities.Campaign;
import GamesSalesDemo.Entities.Product;

public class CampaignManager implements ICampaignService{

	@Override
	public void added(Campaign campaign) {
		System.out.println("The Campaign Desription: "+campaign.getCampaignDescription());
			
	}

	@Override
	public void updated(Campaign campaign) {
		System.out.println("The Campaign Updated: "+campaign.getCampaignDescription());
		
	}

	@Override
	public void deleted(Campaign campaign) {
		System.out.println("The Campaign Deleted: "+campaign.getCampaignDescription());
		
	}


	}






