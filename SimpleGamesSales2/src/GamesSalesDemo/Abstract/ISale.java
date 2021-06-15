package GamesSalesDemo.Abstract;
import GamesSalesDemo.Entities.Campaign;
import GamesSalesDemo.Entities.Finans;
import GamesSalesDemo.Entities.Product;
import GamesSalesDemo.Entities.Sale;

public interface ISale {
	void productOnSale(Product product,Finans finans,Sale sale,Campaign campaign);
	

}
