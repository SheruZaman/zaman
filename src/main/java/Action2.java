import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Action2 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ebay.com");

        WebElement jewelary = driver.findElement(By.xpath("//ul[@class=\"hl-cat-nav__container\"]/li[11]/a"));
        WebElement  Tiffany = driver.findElement(By.xpath("//a[@_sp=\"p2481888.m1387.l3266\"]"));
        Actions action = new Actions(driver);
        action.moveToElement(jewelary).perform();
        Tiffany.click();





    }
}
