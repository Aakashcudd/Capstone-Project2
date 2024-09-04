package automation;

import org.testng.annotations.Test;

public class BottomLinkValidationTest extends BaseTest{

	  @Test
	    public void validateBottomLinks() {
	        driver.get("https://www.bestbuy.com");
	        // Find bottom links and validate them
	        // Example:
	        // driver.findElement(By.linkText("Terms & Conditions")).click();
	        // Assert title or other properties
	    }
}
