package home;

import amazonhome.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TestHomePage extends HomePage {
    //@Test
    public void addJavaBooksToCart() {
        clickOnSearchBar();
        typeOnSearchBar("Java Books");
        clickOnSearchButton();
        clickOnElement("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span");
        clickOnElement("//*[@id=\"add-to-cart-button\"]");
    }

    //@Test
    public void searchIphone() {
        clickOnSearchBar();
        typeOnSearchBar("Iphone");
        clickOnSearchButton();
        clickOnElement("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span");
        clickOnElement("//*[@id=\"add-to-cart-button\"]");
        clickOnElement("//*[@id=\"attachSiNoCoverage-announce\"]");
        sleepFor(2);
    }
}