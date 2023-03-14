import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Findelements1 {
////div[@class="l-container-fixed h-padding-h-x6 h-padding-t-x6 h-display-flex h-flex-direction-row h-flex-justify-space-between"]/div/a/div/a/div/span
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://target.com");
        //List<WebElement> footer = driver.findElements(By.xpath("//span[@class=\"CellSkinny__TextWrapper-sc-1967501-0 gDYrTa\"]"));

       // WebElement element = driver.findElement(By.xpath("div[@class=\"l-container-fixed h-padding-h-x6 h-padding-t-x6 h-display-flex h-flex-direction-row h-flex-justify-space-between\"]/div/a/div/a/div/span"));

        //System.out.println(element.getText());
       // for(WebElement a : footer){
           // System.out.println(a.getText());

        }
    }

