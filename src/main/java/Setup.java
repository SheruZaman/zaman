import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {

    WebDriver driver;
    void setupDriver(String url){

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
       driver = new ChromeDriver();
        driver.get(url);
    }
   // void quitBrowser() throws InterruptedException {
       // Thread.sleep(3000);
      //  driver.quit();


    }
//}
