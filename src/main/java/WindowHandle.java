import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        WebElement tab = driver.findElement(By.id("tabButton"));
        tab.click();
        Set<String> windows = driver.getWindowHandles();
        String currentwindow = driver.getWindowHandle();

        for(String i: windows){
            if(i != currentwindow){
                driver.switchTo().window(i);

            }
        }
        WebElement newpage = driver.findElement(By.id("sampleHeading"));
        System.out.println(newpage.getText());
    }
}
