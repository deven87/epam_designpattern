package epam_designpatterns.factory;

import org.openqa.selenium.WebDriver;

public class SubTask_1 {

	public static void main(String[] args) throws Exception {

		// use factory class create driver method to instantiate different browser class
		// implementing BrowserDriver interface
		WebDriver driver = BrowserFactory.createDriver("chrome").getDriver();
		driver.get("https://www.google.com");
		driver.close();

		driver = BrowserFactory.createDriver("firefox").getDriver();
		driver.get("https://www.google.com");
		driver.quit();
	}
}
