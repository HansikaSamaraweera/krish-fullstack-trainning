package ChainOfResponsibility;

public class Invoice {
	private int invoiceNo;
	private double amount;
	private double interst;
	

	public Invoice(int invoiceNo, double amount) {
		super();
		this.invoiceNo = invoiceNo;
		this.amount = amount; 
	}

	public int getInvoiceNo() {
		return invoiceNo;
	}

	public double getAmount() {
		return amount;
	}

	public double getInterst() {
		return interst;
	}

	public void setInterst(double interst) {
		this.interst = interst;
	}

	
}
