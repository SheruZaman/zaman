import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        WebDriver d=new ChromeDriver();
        d.get("https://carfax.com");
        d.findElement(By.xpath("//a[@href=\"https://www.carfax.com/cars-for-sale\"]")).click();
        d.findElement(By.xpath("//div[@class=\"recaptcha-checkbox-border\"]")).click();


    }

}
