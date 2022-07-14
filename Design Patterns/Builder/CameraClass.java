package Builder;

public class CameraClass {
	
	private final String lence;
	private final String reels;
	private final String tripod;
	private final String battery;
	private final boolean etc;
	
	public CameraClass(Builder builder) {
		this.lence= builder.lence;
		this.reels= builder.reels;
		 this.tripod= builder.tripod;
		 this.battery= builder.battery;
		 this.etc= builder.etc;
	}
	
	
	static class Builder{
		String lence;
		String reels;
		String tripod;
		String battery;
		boolean etc;
		
		public CameraClass build() {
			return new CameraClass(this);
		}
		
		public Builder(String lence) {
			this.lence=lence;
		}
		
		public Builder reels(String reels) {
			this.reels = reels;
			return this;
		}

		public Builder etc(Boolean etc) {
			this.etc=etc;
			return this;
		}
		
		public Builder tripod(String tripod) {
			this.tripod=tripod;
			return this;
		}
		
		public Builder battery(String battery) {
			this.battery=battery;
			return this;
		}
		
		
	}
	
	@Override
	public String toString() {
		return "Camera{" + "lence:" + lence +"reels"+ reels + "tripod"+ tripod + "battery" + battery + "etc" + etc ;
		
	}

}
