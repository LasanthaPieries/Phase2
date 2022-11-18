package phase2_stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	public static WebDriver driver;

	@Before
	public void Setup() {
		// System.setProperty() sets the system property indicated by the specified key and returns the value.
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		// Create an instance of Chrome driver
		driver = new ChromeDriver();

	}
	
	@After
	public void Teardown() {
		// Close driver
		driver.close();
		
		
	}
}
