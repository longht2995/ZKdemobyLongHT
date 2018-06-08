package greenglobal.model;

import java.util.ArrayList;
import java.util.List;
import greenglobal.model.Product;;

public class ProductData {
	private List<Product> listProducts = new ArrayList<Product>();
	public ProductData() {
		listProducts.add(new Product(1,"햛 Zara", 4444,"햛 freesize", "images/1.jpg"));
		listProducts.add(new Product(2,"햛 Zara1", 5555,"햛 freesize", "images/2.jpg"));
		listProducts.add(new Product(3,"햛 Zara2", 6666,"햛 freesize", "images/3.jpg"));
		listProducts.add(new Product(4,"햛 Zara3", 7777,"햛 freesize", "images/1.jpg"));
		listProducts.add(new Product(5,"햛 Zara4", 8888,"햛 freesize", "images/1.jpg"));
		listProducts.add(new Product(6,"햛 Zara5", 9999,"햛 freesize", "images/1.jpg"));
		listProducts.add(new Product(7,"햛 Zara6", 1111,"햛 freesize", "images/1.jpg"));

	}
	
	public List<Product> getListProducts() {
		return listProducts;
	}

	public void setListProducts(List<Product> listProducts) {
		this.listProducts = listProducts;
	}
	
}
