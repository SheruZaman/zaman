package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {


    @FindBy(xpath = "//*[@id=\"hp-work-wear\"]/div/p/span[6]/span[2]/a[1]/span")
    WebElement SportCoat;


    void ClickShpoSportCoat() {
        SportCoat.click();
    }
}

