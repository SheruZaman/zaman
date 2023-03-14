import com.sun.nio.sctp.SendFailedNotification;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest extends Setup {

    Homepage home;
    @BeforeMethod

    void setUpTest(){
        setupDriver("https://amazon.com");

       home = PageFactory.initElements(driver, Homepage.class);

    }
   // @AfterMethod
   // void closeBrowser() throws InterruptedException {
        //quitBrowser();
   // }
     @Test
      void bestseller(){
      String actualText = home.dealsText();
          System.out.println(actualText);
          Assert.assertEquals(actualText,"Best Sellers");

      }
      @Test
    void testBasics(){
        home.clickAmazonBasics();
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,"https://www.amazon.com/stores/node/20648519011?channel=discovbar?field-lbr_brands_browse-bin=AmazonBasics&ref_=nav_cs_amazonbasics");
      }
      @Test
    void validSignIn (){
          home.helloSignIn();
          Assert.assertTrue(home.loginCheck());
      }
      @Test
    void input(){


      }




}
