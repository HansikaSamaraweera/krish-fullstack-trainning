package Factory;

public class BasicPackage extends Package {
	
	@Override
	protected void createPackage() {
		book.add(new SingleRoom());
	}
}
