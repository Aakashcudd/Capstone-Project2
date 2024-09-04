package automation;

import org.testng.annotations.Test;

public class OrderConfirmationTest extends BaseTest {

	@Test
    public void verifyOrderConfirmation() {
        driver.get("https://www.bestbuy.com");
        // After completing order, verify the confirmation message
        // Example:
        // String confirmationMessage = driver.findElement(By.id("confirmationMessage")).getText();
        // Assert.assertEquals(confirmationMessage, "Expected confirmation message");
    }
}
