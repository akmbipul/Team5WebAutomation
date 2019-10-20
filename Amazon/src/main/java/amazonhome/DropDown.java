package amazonhome;

import base.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown extends CommonApi {
    public List<WebElement> getAllElementFromList() {
        return driver.findElements(By.xpath("//*[contains(@value,'search-alias')]"));
    }

    public void getAmazonFreshFromDropDownLists(){
        WebElement element = getElement("//*[@id=\"searchDropdownBox\"]");
        Select select = new Select(element);
        select.selectByIndex(4);
        sleepFor(5000);
        clickOnElementByXpath("//*[@id=\"searchDropdownBox\"]/option[5]");
    }
}


