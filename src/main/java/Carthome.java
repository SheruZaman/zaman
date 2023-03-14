import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Carthome {

    @FindBy (xpath = "//span[@class=\"nav-cart-icon nav-sprite\"]")
    WebElement cartButton;

    String textCartButton(){
       String text = cartButton.getText();
       return text;
    }


}
