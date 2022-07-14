package Prototype;

public class Car extends Vehicle{
	
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String toString() {
		return "car{" + "type" + type + "}";
	}

}
