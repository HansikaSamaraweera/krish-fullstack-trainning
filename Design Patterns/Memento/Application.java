package Memento;

public class Application {

	public static void main(String[] args) {


		CareTaker careTaker= new CareTaker();
		Cart cart= new Cart();
		
		cart.addItem(new Item("book"));
		cart.addItem(new Item("pen"));
		
		careTaker.save(cart);
		System.out.println(cart);
		
		cart.addItem(new Item("ereser"));
		careTaker.save(cart);
		System.out.println(cart);
		
		cart.addItem(new Item("pencil"));
		careTaker.save(cart);
		System.out.println(cart);
		
		cart.addItem(new Item("ruler"));
		careTaker.save(cart);
		System.out.println(cart);

		
	}

}
