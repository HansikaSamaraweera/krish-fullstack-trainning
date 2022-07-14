package ChainOfResponsibility;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger logger = Logger.getLogger(Example.class.getName());
		logger.setLevel(Level.WARNING);
		
		logger.log(Level.INFO,"info");
		logger.log(Level.WARNING,"warn");
		logger.log(Level.FINE,"fine");
		logger.log(Level.SEVERE,"server");
		
		

	}

}
