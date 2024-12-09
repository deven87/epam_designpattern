package epam_designpatterns.strategy;

public class Task_03_Hometask_Strategy_pattern {

	public static void main(String[] args) {

		CameraApp app = new BasicCameraApp();

		// call Basic Camera app specific method

		app.editPhoto();
		// call common methods

		app.takePhoto();
		app.savePhoto();

		// set strategy of photo
		app.setStrategy(new ShareByText());
		app.sharePhoto();

		// set strategy of photo
		app.setStrategy(new ShareByEmail());
		app.sharePhoto();

		// new strategy can be added on the go

		app = new CameraPlusApp();
		app.editPhoto();

		app.takePhoto();
		app.savePhoto();

		app.setStrategy(new ShareByText());
		app.sharePhoto();
		app.setStrategy(new ShareByEmail());
		app.sharePhoto();
	}
}
