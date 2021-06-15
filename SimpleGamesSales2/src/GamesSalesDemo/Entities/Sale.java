package GamesSalesDemo.Entities;
import java.time.LocalDate;

import GamesSalesDemo.Abstract.IEntity;
import GamesSalesDemo.Concrete.CampaignManager;

public class Sale  implements IEntity{
	private int id;
	private String paymentType;
	private LocalDate date;

	
	
	public Sale(int id, String paymentType, LocalDate date) {
		super();
		this.id = id;
		this.paymentType = paymentType;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCreditCard() {
		return paymentType;
	}

	public void setCreditCard(String creditCard) {
		this.paymentType = creditCard;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
}
