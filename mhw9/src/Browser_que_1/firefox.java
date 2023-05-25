package Browser_que_1;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class firefox {
    static WebDriver driver;
    static String url = "https://demo.nopcommerce.com/";
    static String expectedTitle= "nopCommerce demo store"; // expected title
    public static void main(String[] args) {
        FirefoxOptions options = new FirefoxOptions();
        driver = new FirefoxDriver(options);
        driver.get(url);// launch url
        driver.manage().window().maximize(); // maximising screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000)); // giving wait
        String actualTitle = driver.getTitle(); // getting title of page
        System.out.println("Tile of page is : " + actualTitle); //printing title of page
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit(); // closing driver
    }
}
