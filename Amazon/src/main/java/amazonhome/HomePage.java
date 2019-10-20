package amazonhome;

import base.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import reporting.TestLogger;

import java.util.List;

public class HomePage extends CommonApi {
    public void clickOnSearchBar() {
        clickOnElement("//input[@id='twotabsearchtextbox']");
        TestLogger.log("search bar clicked");
    }

    public void typeOnSearchBar(String value) {
        typeOnElement("//input[@id='twotabsearchtextbox']", value);
        TestLogger.log(value + " typed on the search bar");
    }

    public void clickOnSearchButton() {
        clickOnElement("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']");
        TestLogger.log("search button clicked");
    }
}
