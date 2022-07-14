package Builder;

public class CameraOne {

	String lence;
	String reels;
	String tripod;
	String battery;
	boolean etc;
	
	public CameraOne(String lence, String reels, String tripod, String battery, boolean etc) {
		super();
		this.lence = lence;
		this.reels = reels;
		this.tripod = tripod;
		this.battery = battery;
		this.etc = etc;
	}
	public CameraOne(String lence) {
		super();
		this.lence = lence;
		this.battery = battery;
	}
	public CameraOne(String lence, String tripod, boolean etc) {
		super();
		this.lence = lence;
		this.tripod = tripod;
		this.etc = etc;
	}
	public CameraOne(String lence, boolean etc) {
		super();
		this.lence = lence;
		this.etc = etc;
	}
	
	@Override
	public String toString() {
		return "Camera{" + "lence:" + lence +"reels"+ reels + "tripod"+ tripod + "battery" + battery + "etc" + etc ;
		
	}
	
	
}
