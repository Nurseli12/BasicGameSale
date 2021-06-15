package GamesSalesDemo;
import java.time.LocalDate;
import GamesSalesDemo.Adapters.MernisServiceAdapter;
import GamesSalesDemo.Concrete.CampaignManager;
import GamesSalesDemo.Concrete.FinansManager;
import GamesSalesDemo.Concrete.GamerManager;
import GamesSalesDemo.Concrete.NewGamer;
import GamesSalesDemo.Concrete.ProductManager;
import GamesSalesDemo.Concrete.SaleManager;
import GamesSalesDemo.Entities.Campaign;
import GamesSalesDemo.Entities.Finans;
import GamesSalesDemo.Entities.Gamer;
import GamesSalesDemo.Entities.Product;
import GamesSalesDemo.Entities.Sale;

public class Main {



	public static void main(String[] args) {
		System.out.println("NEW USER INFORMATÝON");
		GamerManager gamerManager = new NewGamer(new MernisServiceAdapter());
		gamerManager.added(new Gamer(1,"Nurseli","Kaya",LocalDate.of(1997, 02, 12),"21734451760"));
		
			
		System.out.println("PRODUCTS INFORMATION");
		ProductManager productManager = new ProductManager();
		productManager.added(new Product(1 ,"SNAKE GAMES"));
		productManager.added(new Product(2 ,"MARÝO"));
		
		System.out.println("PRODUCTS INFORMATION ABOUT PRICE");
		FinansManager snakeGame = new FinansManager();
		snakeGame.added(new Finans(1, 70, 20));
		FinansManager mario = new FinansManager();
		mario.added(new Finans(2, 80, 15));
		
		System.out.println("CAMPAIGN INFORMATION");
		CampaignManager snakeGameCampaign = new CampaignManager();
		snakeGameCampaign.added(new Campaign(1,"Summer promotions"));
		CampaignManager marioGameCampaign = new CampaignManager();
		marioGameCampaign.added(new Campaign(2,"Bestselling"));
		
		System.out.println("PRODUCTS ON SALE");
		SaleManager snakeGameSale = new SaleManager();
		snakeGameSale.productOnSale(new Product(1 ,"SNAKE GAMES"), new Finans(1, 70, 20),
		new Sale(1,"Just Credit Card", LocalDate.now()), new Campaign(1,"Summer promotions"));
		
		SaleManager marioGameSale = new SaleManager();
		marioGameSale.productOnSale(new Product(2 ,"MARÝO"), new Finans(2, 80, 15),
		new Sale(2,"Just Credit Card", LocalDate.now()), new Campaign(2,"Bestselling"));

		
		
		
		
		

		
		
		


		
		
		
		
		
		
		
		

	}

}
