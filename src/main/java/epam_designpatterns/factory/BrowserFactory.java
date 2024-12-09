package epam_designpatterns.factory;

public class BrowserFactory {

	public static BrowserDriver createDriver(String browserName) throws Exception {

		switch (browserName.toLowerCase()) {
		case "chrome":
			return new MyChromeDriver();
		case "firefox":
			return new MyFirefoxDriver();
		default:
			throw new Exception("Provide valid brower name");
		}

	}

}
