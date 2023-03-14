import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver car = new ChromeDriver();
        car.get("https://cars.com");
        car.findElement(By.xpath("//a[@data-linkname=\"header-news\"]")).click();

        }


}