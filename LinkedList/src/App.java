
public class App {
	public static void main(String args[]) {
		
		List list = new List();
		list.insert(10);
		list.insert(7);
		list.insert(8);
		list.insert(7);
		list.insert(10);
		
		list.showLink();
		
		
		list.reverce();
		
		for (int i = 0; i < 6; i++)  
	        { 
			 	list.showLink();
	            if (list.isPalindrome(list.first) != false)  
	            { 
	                System.out.println("Is Palindrome"); 
	                System.out.println(""); 
	            }  
	            else 
	            { 
	                System.out.println("Not Palindrome"); 
	                System.out.println(""); 
	            } 
	        } 
		 }
		
		
	}
}
