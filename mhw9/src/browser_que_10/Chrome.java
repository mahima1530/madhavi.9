package browser_que_10;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Chrome {
    static WebDriver driver;
    static String url = "https://www.disneylandparis.com/";
    static String expectedTitle = " disneyland booking store"; // expected title

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();// setting webdriver
        //options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get(url);// launch url
        driver.manage().window().maximize(); // maximising screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(400)); // giving wait
        String actualTitle = driver.getTitle(); // getting title of page
        System.out.println("Tile of page is : " + actualTitle); //printing title of page
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit(); // closing driver


    }
}