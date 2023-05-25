package browser_que_2;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

/*Project-2 - Project Name: com-orangehrmlive
BaseUrl = https://opensource-demo.orangehrmlive.com/

 */
public class Chrome {
    static String url = "https://opensource-demo.orangehrmlive.com/";
    static String expectedTitle = "opensource demo store"; // expectedTitle
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
