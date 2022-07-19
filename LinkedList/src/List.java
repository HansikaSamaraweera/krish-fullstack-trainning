
public class List {
  public Link first;

	public List() {
		this.first = null;
	}
	  
	public boolean empty() {
		if(first == null) {
			return true;
		}else
			return false;
	}
	
	public void showLink() {
		Link slink = first;
		
		while(slink != null) {
			slink.displayData();
			slink = slink.next;
		}
		System.out.println(" ");
	}
	
	public void insert(int data) {
		Link a = new Link(data);
		a.next = first;
		first = a;
	}
	
	public void reverce() {
		Link previous = null;
		Link current = null;

		while(first.next!=null) {
			
			current = first.next;
			first.next = previous;	
			previous = first;
			first = current;
	 		current = current.next; 
	 		
			if (first == null || first.next == null)  {
				first.next = previous;
				first.displayData(); 
				
				while(first.next!=null) {
					first.next.displayData();
					first = first.next;
				}
				
			}	
	 		
		} 
	}
	
	public void palindrom() {
		
		Link previous = null;
		Link current = null;

		while(first.next!=null) {
			
			current = first.next;
			first.next = previous;	
			previous = first;
			first = current;
	 		current = current.next; 
	 		
			if (first == null || first.next == null){
				first.next = previous;
				first.displayData(); 
				
				while(first.next!=null) {
					first.next.displayData();
					first = first.next;
				}
				
			}	
	 		
		}
		
	}
	
	boolean isPalindromeList(Link right)  
    { 
        Link left = first; 
          
        if (right == null) 
            return true;  
        
        boolean pal = isPalindromeList(right.next); 
        if (pal == false) 
            return false; 
   
        boolean pal1 = (right.data == left.data); 
   
        left = left.next; 
  
        return pal1; 
    } 
   
    
    boolean isPalindrome(Link head)  
    { 
        boolean result = isPalindromeList(head); 
        return result; 
    } 
  
  
}














