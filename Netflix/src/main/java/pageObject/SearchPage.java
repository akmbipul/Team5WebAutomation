package pageObject;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends CommonAPI {


@FindBy(xpath = "//*[@id=\"appMountPoint\"]/div/div/div/div/div/div[1]/div/a")
    WebElement login;

public void login(){
    this.login.click();
}




}
