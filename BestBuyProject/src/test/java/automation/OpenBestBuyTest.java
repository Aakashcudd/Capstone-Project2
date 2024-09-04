package automation;

import org.testng.annotations.Test;

public class OpenBestBuyTest extends BaseTest{


    @Test
    public void openBestBuyHomePage() {
        driver.navigate().to("https://www.bestbuy.com");
        System.out.println("Opened BestBuy Home Page");
    }
}
