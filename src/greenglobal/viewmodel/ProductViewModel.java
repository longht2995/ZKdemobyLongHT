package greenglobal.viewmodel;

import java.io.Serializable;


import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zul.ListModelList;



import greenglobal.model.Product;
import greenglobal.model.ProductData;


public class ProductViewModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ListModelList<Product> listModelList;
	Product selectedTodo;
	@Init
	public ListModelList<Product> getProducts(){
		if(listModelList == null) {
			listModelList = new ListModelList<Product>(new ProductData().getListProducts());
		}return listModelList;
	}
	@NotifyChange("selected")
	public void setSelected(Product p) {
		this.selectedTodo = p;
	}
	@Command
	@NotifyChange({"selected","orders"})
	public void newProduct() {
		Product product = new Product();
		getProducts().add(product);
		selectedTodo = product;
	}
	@Command
	@NotifyChange("selected")
	public void saveProduct() {
		getProducts().set(selectedTodo.getId()-1, selectedTodo);
		
	}
	@Command
	@NotifyChange
	public void deleteProduct() {
		getProducts().remove(selectedTodo);
		selectedTodo = null;
	}
	public ListModelList<Product> getListModelList() {
		return listModelList;
	}

	public Product getSelectedTodo() {
		return selectedTodo;
	}
	public void setSelectedTodo(Product selectedTodo) {
		this.selectedTodo = selectedTodo;
	}
	
	
	
}
