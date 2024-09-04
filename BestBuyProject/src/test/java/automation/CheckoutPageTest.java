package automation;

import org.testng.annotations.Test;

public class CheckoutPageTest extends BaseTest{

	   @Test
	    public void checkoutWithDummyPayment() {
	        driver.get("https://www.bestbuy.com");
	        // Code to fill out checkout form
	        // Example:
	        // driver.findElement(By.id("firstName")).sendKeys("John");
	        // Complete the checkout form
	    }
}
