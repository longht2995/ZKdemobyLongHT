package greenglobal.model;

import java.util.ArrayList;
import java.util.List;
import greenglobal.model.Product;;

public class ProductData {
	private List<Product> listProducts = new ArrayList<Product>();
	public ProductData() {
		listProducts.add(new Product(1,"�o Zara", 4444,"�o freesize", "images/1.jpg"));
		listProducts.add(new Product(2,"�o Zara1", 5555,"�o freesize", "images/2.jpg"));
		listProducts.add(new Product(3,"�o Zara2", 6666,"�o freesize", "images/3.jpg"));
		listProducts.add(new Product(4,"�o Zara3", 7777,"�o freesize", "images/1.jpg"));
		listProducts.add(new Product(5,"�o Zara4", 8888,"�o freesize", "images/1.jpg"));
		listProducts.add(new Product(6,"�o Zara5", 9999,"�o freesize", "images/1.jpg"));
		listProducts.add(new Product(7,"�o Zara6", 1111,"�o freesize", "images/1.jpg"));

	}
	
	public List<Product> getListProducts() {
		return listProducts;
	}

	public void setListProducts(List<Product> listProducts) {
		this.listProducts = listProducts;
	}
	
}
