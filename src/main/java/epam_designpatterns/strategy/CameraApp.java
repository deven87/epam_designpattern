package epam_designpatterns.strategy;

public abstract class CameraApp {
	private ShareStreategyInterf shareStrategy;

	public void setStrategy(ShareStreategyInterf shareStrategy) {
		this.shareStrategy = shareStrategy;
	}

	void takePhoto() {
		System.out.println("take photo");
	}

	abstract void editPhoto();

	void sharePhoto() {
		shareStrategy.share();
	}

	void savePhoto() {
		System.out.println("save photo");
	}
}
