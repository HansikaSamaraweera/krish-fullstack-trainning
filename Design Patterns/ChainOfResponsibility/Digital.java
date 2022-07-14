package ChainOfResponsibility;

public class Digital extends Handler {

	@Override
	public double applyInterst(Invoice invoice) {
		System.out.println("Digital Interest Calculated");
		if(invoice.getAmount()>=100) {
			return invoice.getInterst();
		}else {
			return successor.applyInterst(invoice);
					
		}
	}
	
	

}
