package Project1;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest extends Setup {

    HomePage home;
    @BeforeMethod
    void setupTest(){
        setupDriver("https://menswearhouse.com");

        home = PageFactory.initElements(driver, HomePage.class);

    }
    @Test
    void ShopSportCoat(){
      home.ClickShpoSportCoat();
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,"https://www.menswearhouse.com/c/sport-coats-mens-clothing-arrivals");

    }


}
