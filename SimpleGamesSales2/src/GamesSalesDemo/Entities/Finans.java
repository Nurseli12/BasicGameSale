package GamesSalesDemo.Entities;

public class Finans {
	private int id;
	private int productPrice;
	private int discount;
	private int afterDiscountPrice;
	public Finans(int id, int productPrice, int discount) {
		super();
		this.id = id;
		this.productPrice = productPrice;
		this.discount = discount;
		this.afterDiscountPrice = afterDiscountPrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getAfterDiscountPrice() {
		return afterDiscountPrice = getProductPrice() - (getProductPrice() * getDiscount() / 100);
	}

	
}
