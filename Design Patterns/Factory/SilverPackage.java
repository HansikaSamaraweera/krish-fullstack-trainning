package Factory;

public class SilverPackage extends Package {
	
	@Override
	protected void createPackage() { 
		book.add(new DoubleRoom());
		book.add(new Meals());
	}

}
