package Builder;

public class Camera {
	
	String lence;
	String reels;
	String tripod;
	String battery;
	boolean etc;
	
	public Camera(String lence) {
		super();
		this.lence = lence;
	}

	public Camera(String lence, String battery) {
		super();
		this.lence = lence;
		this.battery = battery;
	}

	public Camera(String lence, String battery, boolean etc) {
		super();
		this.lence = lence;
		this.battery = battery;
		this.etc = etc;
	}

	public Camera(String lence, String reels, String tripod) {
		super();
		this.lence = lence;
		this.reels = reels;
		this.tripod = tripod;
	}
	
	
	@Override
	public String toString() {
		return "Camera{" + "lence:" + lence +"reels"+ reels + "tripod"+ tripod + "battery" + battery + "etc" + etc ;
		
	}
	
	
	
	
}
