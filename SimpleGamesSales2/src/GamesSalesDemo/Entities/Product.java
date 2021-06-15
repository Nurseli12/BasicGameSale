package GamesSalesDemo.Entities;

import GamesSalesDemo.Abstract.IEntity;

public class Product implements IEntity{
	private int id;
	private String productName;
	public Product() {
		
	}
	public Product(int id, String productName) {
		super();
		this.id = id;
		this.productName = productName;

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}


}
