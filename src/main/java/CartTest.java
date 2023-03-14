import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTest extends Setup {

    CartTest cart;
    @BeforeMethod
    void openBrowser(){
        setupDriver("https://www.amazon.com/gp/cart/view.html?ref_=nav_cart");
        cart = PageFactory.initElements(driver, CartTest.class);

    }
   @Test
    void testcartButton(){
        cart.setupDriver("https://www.amazon.com/gp/cart/view.html?ref_=nav_cart");



   }}
