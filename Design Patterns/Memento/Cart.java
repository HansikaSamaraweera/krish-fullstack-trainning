package Memento;

import java.util.ArrayList;

public class Cart {
	
	ArrayList<Item> items = new ArrayList<Item>();

	public void addItem(Item item) {
		items.add(item);
	}
	
	public ArrayList<Item> getItems() {
		return (ArrayList<Item>) items.clone();
	}

	@Override
	public String toString() {
		return "Cart{" + "items " + items + "}";
	}
	
	public CartMemento save() {
		return new CartMemento(getItems());
	}
	
	public void revert(CartMemento carMemento) {
		items=carMemento.getItems();
	}
	
	
	public class CartMemento{
		
		
		ArrayList<Item> items;

		public CartMemento(ArrayList<Item> items) {
			super();
			this.items = items;
		}

		public ArrayList<Item> getItems() {
			return items;
		}
		
	
		
	}
}
