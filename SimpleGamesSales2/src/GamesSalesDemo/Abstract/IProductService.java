package GamesSalesDemo.Abstract;

import GamesSalesDemo.Entities.Gamer;
import GamesSalesDemo.Entities.Product;

public interface IProductService {
	void added (Product product);
	void updated (Product product);
	void deleted (Product product);

}
