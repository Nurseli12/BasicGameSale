package GamesSalesDemo.Entities;

import GamesSalesDemo.Abstract.IEntity;

public class Campaign implements IEntity{
	private int id;
	private String campaignDescription;
	
	public Campaign(int id, String campaignDescription) {
		super();
		this.id = id;
		this.campaignDescription = campaignDescription;
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignDescription() {
		return campaignDescription;
	}

	public void setCampaignDescription(String campaignDescription) {
		this.campaignDescription = campaignDescription;
	}




}
