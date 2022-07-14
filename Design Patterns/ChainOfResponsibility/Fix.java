package ChainOfResponsibility;

public class Fix extends Handler{

	@Override
	public double applyInterst(Invoice invoice) {
		
		invoice.setInterst(invoice.getInterst()*1.5);
		System.out.println("Fix Interest Calculated");
		if(invoice.getAmount()>=1000) {
			return invoice.getInterst();
		}else {
			return successor.applyInterst(invoice);
					
		}
	}
	
	

}
