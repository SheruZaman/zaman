import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ebay.com");
        WebElement jewelary = driver.findElement(By.xpath("//ul[@class=\"hl-cat-nav__container\"]/li[11]/a"));
        WebElement rolex = driver.findElement(By.cssSelector("[_sp=\"p2481888.m1387.l3259\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(jewelary).perform();
        rolex.click();





        }




    }


