package Builder;

import Builder.CameraClass.Builder;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Camera camera = new Camera("full");
		System.out.println(camera);
		
		CameraOne cam = new CameraOne("full");
		System.out.println(cam);
		
		CameraClass.Builder builder =new CameraClass.Builder("FULL");
		
		CameraClass cam1 = builder.tripod("tripod 02").battery("battry 01").build();
	}

}
