import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Menswearhouse {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://menswearhouse.com");
        driver.findElement(By.cssSelector("#pg-footer > div.inner.clearfix > div.rw > div:nth-child(2) > ul > li:nth-child(2) > a")).click();
    }


}
