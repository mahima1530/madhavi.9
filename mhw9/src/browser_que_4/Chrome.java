package browser_que_4;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

/*Project-4 - Project Name: com-saucedemo
BaseUrl = https://www.saucedemo.com/

 */
public class Chrome {
    static String url = "https://www.saucedemo.com/";
    static String expectedTitle = "sauce demo store"; // expectedTitle
    static WebDriver driver;

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();//setting webdriver
        driver = new ChromeDriver(options);
        driver.get(url);//launch url
        driver.manage().window().maximize();//maximising screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));//giving wait
        String actualTitle = driver.getTitle();//getting title of page
        System.out.println("Tile of page is :" + actualTitle);//printing title of page
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit(); // closing driver


    }

}
