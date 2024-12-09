package epam_designpatterns.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class MyFirefoxDriverWithCapabilities implements BrowserDriver {

	@Override
	public WebDriver getDriver() {
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--width=1920");
		options.addArguments("--height=1080");
		return new FirefoxDriver(options);
	}

}
