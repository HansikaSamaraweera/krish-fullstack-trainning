
public class Link {
	public int data;
	public Link next;
	
	public Link(int data) { 
		this.data = data;
		this.next = null;
	}
	
	public void displayData() {
		System.out.println(data);
	}

}
