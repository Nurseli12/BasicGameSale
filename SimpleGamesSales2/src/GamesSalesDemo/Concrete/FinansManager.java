package GamesSalesDemo.Concrete;

import GamesSalesDemo.Abstract.IFinansService;
import GamesSalesDemo.Entities.Finans;

public class FinansManager implements IFinansService{

	@Override
	public void added(Finans finans) {
		System.out.println("Product price added: "+finans.getProductPrice());
		
	}

	@Override
	public void upadated(Finans finans) {
		System.out.println("Product price updated: "+finans.getProductPrice());
		
	}

	@Override
	public void deleted(Finans finans) {
		System.out.println("Product price deleted: "+finans.getProductPrice());
		
	}


}
