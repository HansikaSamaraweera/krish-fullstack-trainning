package Prototype;

public class Bus extends Vehicle{

	private int noOfSeats;

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
	public String toString() {
		return "Bus{" + "seats" + noOfSeats + "}";
	}
}
