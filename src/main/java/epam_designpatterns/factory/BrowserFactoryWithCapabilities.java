package epam_designpatterns.factory;

public class BrowserFactoryWithCapabilities {

	public static BrowserDriver createDriver(String browserName) throws Exception {

		switch (browserName.toLowerCase()) {
		case "chrome":
			return new MyChromeDriverWithCapabilities();
		case "firefox":
			return new MyFirefoxDriverWithCapabilities();
		default:
			throw new Exception("Provide valid brower name");
		}
	}
}
