package pageObject;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {

@FindBy(css="#formstart > button > span.hero-cta-btn-txt")
    WebElement tryDayFree;


public void getDayFree(){

    tryDayFree.click();
}



}
