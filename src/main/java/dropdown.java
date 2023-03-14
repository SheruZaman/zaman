import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        Select select = new Select(driver.findElement(By.id("searchDropdownBox")));
        select.selectByVisibleText("Computers");
        for(int i =0; i<= 10; i++){
            select.selectByIndex(i);
            Thread.sleep(2000);

        }



    }


    }

