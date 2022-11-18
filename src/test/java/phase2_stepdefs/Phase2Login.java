package phase2_stepdefs;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Phase2Login {

	WebDriver driver = Hooks.driver;
	
	@Given("I have launched the application")
	public void i_have_launched_the_application() {
	/* 
	 * Open the saucedemo.com website, maximize the window 
	 * and wait for 3 seconds to load the page.
	 */
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);
	}

	@When("I enter correct username and password")
	public void i_enter_correct_username_and_password() {
    // Locate and enter correct username & password for submitting
		
		WebElement UserName = driver.findElement(By.id("user-name"));
		UserName.sendKeys("standard_user");
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("secret_sauce");
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
    // Submit username and password
		
		WebElement LoginBtn = driver.findElement(By.id("login-button"));
		LoginBtn.click();
	}

	@Then("I should see shopping cart container as {string}")
	public void i_should_see_shopping_cart_container_as(String ExpectedStr) {
    /*
     * Validate landing page shopping cart id with expected shopping
     * cart id.
     */
		WebElement CartId = driver.findElement(By.id("shopping_cart_container"));
		String CartIdText = CartId.getAttribute("id");
		Assert.assertEquals(ExpectedStr, CartIdText);
	}

	@When("I enter incorret username password")
	public void i_enter_incorret_username_password() {
	/* 
	 * Locate and enter incorrect username & password for submitting
	 */
		
		WebElement UserName = driver.findElement(By.id("user-name"));
		UserName.sendKeys("standard_user2");
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("secret_sauce");
	}

	@Then("Displayed error message {string}")
	public void displayed_error_message(String ExpectedStr) {
	/*
    	Validate error message for incorrect userid and password with 
		expected error message.
	*/
		
		WebElement Error = driver.findElement(By.xpath("//h3[@data-test='error']"));
		String AcctError = Error.getText();
		Assert.assertEquals(ExpectedStr, AcctError);

	}

}
