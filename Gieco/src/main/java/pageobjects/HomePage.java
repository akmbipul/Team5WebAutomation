package pageobjects;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import sun.jvm.hotspot.utilities.Assert;
import java.util.List;

public class HomePage extends CommonAPI {

  @FindBy(css = "#header-left-links > ul.desktop-links > li:nth-child(1) > a")
  WebElement insurance;
  @FindBy(css = "#primary-navigation > div.panel-wrapper.open > ul > li:nth-child(2) > a > span.geico-nav-menu-item")
  WebElement vehicleInsurance;
  @FindBy(css="#accessibility-main-content > div.wrap.promotions > div > div:nth-child(1) > div > div > ul > li.payment > a")
   WebElement makeApayment;
  public void getInsurancetest(){
      insurance.click();
  }
  public void getvehicleTest(){
    vehicleInsurance.click();
  }

  public void getmakeApayment(){
    makeApayment.click();
  }

}
