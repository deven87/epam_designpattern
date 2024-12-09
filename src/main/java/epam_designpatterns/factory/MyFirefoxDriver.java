package epam_designpatterns.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirefoxDriver implements BrowserDriver {

	@Override
	public WebDriver getDriver() {
		return new FirefoxDriver();
	}

}
