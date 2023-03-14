import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1{

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://capitalone.com");
        driver.findElement(By.xpath("//a[@id=\"auto\"]")).click();
        driver.findElement(By.xpath("//a[@data-initial-value=\"Search Cars\"]")).click();


    }




}
