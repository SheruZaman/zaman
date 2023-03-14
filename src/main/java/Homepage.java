import com.sun.nio.sctp.SendFailedNotification;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import javax.swing.*;
import java.sql.Driver;

public class Homepage {


    @FindBy(css = "[data-csa-c-content-id=\"nav_cs_bestsellers\"]")
    WebElement bestseller;

    @FindBy(xpath = "//div[@id=\"nav-xshop\"]/a[6]")
    WebElement amazonBasic;

    @FindBy(css = "[class=\"nav-line-2 \"]")
    WebElement helloSignIn;

    @FindBy(css="[type=\"email\"]")
    WebElement SignIn;
    @FindBy(xpath = "//input[@type=\"email\"]")
            WebElement input;


    String dealsText(){
        return bestseller.getText();
    }

    void clickAmazonBasics(){

        amazonBasic.click();
    }
    void helloSignIn(){
       helloSignIn.click();

    }
    boolean loginCheck(){
        return SignIn.isDisplayed();
    }
    String signIntext(){
        return helloSignIn.getText();
    }
    void signin(){
        input.submit();
    }














}
