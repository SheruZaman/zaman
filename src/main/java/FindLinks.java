import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.List;

public class FindLinks {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");
       List<WebElement> number = driver.findElements(By.tagName("a"));
        System.out.println(number.size());








    }

    void text(){



    }
}
