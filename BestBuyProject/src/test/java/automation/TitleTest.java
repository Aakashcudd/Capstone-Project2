package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class TitleTest extends BaseTest {
	private WebDriver driver;

    @Test
    public void validatePageTitle() {
        driver = new ChromeDriver();  // Initialize WebDriver (ensure you have the correct driver executable)
        driver.get("https://www.example.com");  // Navigate to the desired URL

        // Wait for the page title to be present
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs("Expected Title for Page"));

        // Assert the title
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Expected Title for Page");

        driver.quit();  // Ensure WebDriver is properly closed
    }
}