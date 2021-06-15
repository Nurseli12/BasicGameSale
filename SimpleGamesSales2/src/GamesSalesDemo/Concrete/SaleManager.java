package GamesSalesDemo.Concrete;

import GamesSalesDemo.Abstract.ISale;
import GamesSalesDemo.Entities.Campaign;
import GamesSalesDemo.Entities.Finans;
import GamesSalesDemo.Entities.Gamer;
import GamesSalesDemo.Entities.Product;
import GamesSalesDemo.Entities.Sale;

public class SaleManager implements ISale {

	@Override
	public void productOnSale(Product product, Finans finans, Sale sale, Campaign campaign) {
		System.out.println("Product on sale: "+product.getProductName());
		System.out.println("Date of sale: "+sale.getDate());
		System.out.println("Product price: "+finans.getProductPrice());
		System.out.println("Price after price: "+finans.getAfterDiscountPrice());
		System.out.println("");
		
	}






}
