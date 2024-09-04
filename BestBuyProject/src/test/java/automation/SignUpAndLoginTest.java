package automation;

import org.testng.annotations.Test;

public class SignUpAndLoginTest extends BaseTest{


    @Test
    public void signUp() {
        driver.get("https://www.bestbuy.com");
        // Code to perform sign-up
        // Example:
        // driver.findElement(By.id("signUpButton")).click();
        // Add the required fields and actions
    }

    @Test
    public void login() {
        driver.get("https://www.bestbuy.com");
        // Code to perform login
        // Example:
        // driver.findElement(By.id("loginButton")).click();
        // Add the required fields and actions
    }

}
