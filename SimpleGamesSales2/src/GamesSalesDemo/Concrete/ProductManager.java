package GamesSalesDemo.Concrete;

import GamesSalesDemo.Abstract.IProductService;
import GamesSalesDemo.Entities.Gamer;
import GamesSalesDemo.Entities.Product;

public class ProductManager implements IProductService{

	@Override
	public void added(Product product) {
		System.out.println("The game has been added : "+product.getProductName());
		
	}

	@Override
	public void updated(Product product) {
		System.out.println("The game has been updated : "+product.getProductName());
		
	}

	@Override
	public void deleted(Product product) {
		System.out.println("The game has been deleted : "+product.getProductName());
		
	}



}
