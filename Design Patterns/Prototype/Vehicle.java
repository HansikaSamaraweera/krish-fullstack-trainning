package Prototype;

public abstract class Vehicle implements Cloneable{
	private String fuelType;
	private int engineVapacity;
	
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getEngineVapacity() {
		return engineVapacity;
	}
	public void setEngineVapacity(int engineVapacity) {
		this.engineVapacity = engineVapacity;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
}
