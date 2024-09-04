package automation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddItemToCartTest extends BaseTest{

	@Test
    public void searchAndAddToCart() {
        driver.get("https://www.bestbuy.com");
        driver.findElement(By.id("search-box")).sendKeys("Laptop");
        driver.findElement(By.cssSelector("button.search-button")).click();
        driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
    }
}
