package phase2_stepdefs;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Phase2Home {

	WebDriver driver = Hooks.driver;
	
	int numberInCartExpected = 0;
	
	@When("I click on product {string}")
	public void i_click_on_product(String productName) {
	    /* 
	     * Search for given product name and click on same to reach
	     * the product page. Also, wait for 3 seconds for page loading
	     */
		
		List<WebElement> ProductNames = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));

		Iterator <WebElement> i = ProductNames.iterator();
		while(i.hasNext()) {
			
			WebElement Product = i.next();
			if(productName == Product.getText()) {
				Product.click();
				driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);
			}
		}

	}

	@When("I click on Add button")
	public void i_click_on_Add_button() {
	/*
	 * Add one of the selected product to cart. Further, set number
	 * of items that should be in the cart after the addition of
	 * latest item. 
	 */
		WebElement ItemsInCart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		if(ItemsInCart.getText().isEmpty() == false) {
			numberInCartExpected = numberInCartExpected + Integer.parseInt(ItemsInCart.getText());
		}
		
		WebElement AddButton = driver.findElement(By.xpath("//button[contains(@id, 'add-to-cart')]"));
		AddButton.click();
		
		numberInCartExpected++;
			
	}

	@Then("The product should be available in the cart")
	public void the_product_should_be_available_in_the_cart() {
	/* 
	 * Verify the number of items in the cart with expected number
	 * of items to validate adding of selected product to the cart. 
	 */
		WebElement ItemsInCartLater = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		int numberInCartActual = 0;
		if(ItemsInCartLater.getText().isEmpty() == false) {
			numberInCartActual = numberInCartActual + Integer.parseInt(ItemsInCartLater.getText());
		}
		Assert.assertEquals(numberInCartExpected, numberInCartActual);
	}
}
