package cnnhome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import reporting.TestLogger;
import base.CommonApi;

public class HomePage extends CommonApi {
    public void clickOnSearchButton() {
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[4]/button");
        TestLogger.log("search button clicked");
    }
    public void typeOnSearchBar(String value) {
        typeOnElement("//*[@id=\"header-search-bar\"]", value);
        TestLogger.log(value + "Typed on search bar");
    }

    public void clickOnSearch() {
        clickOnElement(
                "//*[@id=\"nav\"]/header/div/div[2]/div/div[1]/form/button");
        TestLogger.log("clicked on search bar");
    }
    public void isSearchPageDisplayed() {
        WebElement elementOfNewsTodayDisplay = getElement("//div[@class='cnn-search__results-count']");
        Assert.assertEquals(elementOfNewsTodayDisplay.isDisplayed(), true, "Element not displayed");
        TestLogger.log("Element of technology has been displayed");
    }

    public void validateTrending() {
        WebElement elementOfTrending = getElement("//span[@class='cd__pre-headline']");
        Assert.assertEquals(elementOfTrending.isDisplayed(), true);
        Assert.assertEquals(elementOfTrending.isEnabled(), true);
        elementOfTrending.click();
    }

    public void menuIcon() {
        clickOnElement("//*[@class='menu-icon']");
    }

    public void validateLiveTv() {
        WebElement element = getElement("//span[@class='Text-sc-1amvtpj-0-span bcvWKK']");
        Assert.assertEquals(element.isDisplayed(), true);
        element.click();
    }
    public void viewChannels() {
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/a/span");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/nav/div[2]/a[1]"));
    }

    public void viewShows() {
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/a/span");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/nav/div[2]/a[2]"));
    }

    public void viewSettings() {
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/a/span");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/nav/div[2]/a[3]"));
    }

    public void checkLiveUpdates() {
        clickOnElement("//*[@id=\"homepage-injection-zone-1\"]/div[2]/div/div[2]/div/ul/li[1]/article/div/div/h3/a/span[1]");
    }
    public void get2019Elections() {
        clickOnElement("//*[@id=\"nav\"]/header/div/div[2]/div/div[4]/nav/ul/li[3]/ul/li[6]/a");
        clickOnElement("//*[@id=\"mount\"]/div/main/section[2]/section/div[1]/div[2]/div[1]/div[1]/main/div/a/div");
    }
    public void testFactsSection(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[3]/ul/li[4]/a");
    }
    public void testParentingSection(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[6]/ul/li[4]/a");
    }
}
