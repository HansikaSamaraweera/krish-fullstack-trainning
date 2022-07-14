package ChainOfResponsibility;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Saving saving= new Saving();
		Fix fix= new Fix();
		Digital dig= new Digital();
		
		saving.setSuccessor(dig);
		fix.setSuccessor(dig);
		
		Invoice invoice= new Invoice(1,50);
		System.out.println(saving.applyInterst(invoice));
		
//		Invoice invoice1= new Invoice(2,150);
//		System.out.println(saving.applyInterst(invoice1));
//		
//		Invoice invoice3= new Invoice(3,200);
//		System.out.println(saving.applyInterst(invoice3));
//		
//		Invoice invoice4= new Invoice(4,250);
//		System.out.println(saving.applyInterst(invoice4));	
		
	}

}
