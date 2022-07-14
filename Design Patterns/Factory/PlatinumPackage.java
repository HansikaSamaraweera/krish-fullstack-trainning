package Factory;

public class PlatinumPackage extends Package{
	
	@Override
	protected void createPackage() { 
		book.add(new WaterVilla());
		book.add(new BeachVilla());
		book.add(new Meals());
	}

}
