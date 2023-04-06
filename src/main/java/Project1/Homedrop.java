package Project1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homedropdown extends Setup1{
    @FindBy(css = "[id=\"nav-link-accountList-nav-line-1\"]")
    WebElement accountlist;

    void Clickaccountlist(){
        accountlist.click();

    }




}
