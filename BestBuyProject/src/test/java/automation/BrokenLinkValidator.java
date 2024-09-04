package automation;

import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.List;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinkValidator extends BaseTest {

	 private WebDriver driver;


	    @Test
	    public void validateBrokenLinks() {
	        driver.get("https://www.bestbuy.com");
	        List<WebElement> links = driver.findElements(By.tagName("a"));
	        CloseableHttpClient httpClient = HttpClients.createDefault();

	        for (WebElement link : links) {
	            String url = link.getAttribute("href");
	            if (url != null && !url.isEmpty()) {
	                try {
	                    CloseableHttpResponse response = httpClient.execute(new HttpGet(url));
	                    int statusCode = response.getStatusLine().getStatusCode();
	                    if (statusCode != 200) {
	                        System.out.println("Broken Link: " + url + " - " + response.getStatusLine().getReasonPhrase());
	                    }
	                } catch (IOException e) {
	                    System.out.println("Error checking link: " + url + " - " + e.getMessage());
	                }
	            }
	        }

	        try {
	            httpClient.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
