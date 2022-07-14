package ChainOfResponsibility;

public class Saving extends Handler{

	@Override
	public double applyInterst(Invoice invoice) {
		
		invoice.setInterst(invoice.getInterst()*0.02);
		System.out.println("Saving interst calculated");
		if(invoice.getAmount()<=100) {
			return invoice.getInterst();
		}else {
			return successor.applyInterst(invoice);
					
		}

	}
	
	 

}
