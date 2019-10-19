package cnnhome;

import base.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;


public class SearchPage extends CommonApi {

    public void navigateToUsSection() {
        WebElement element=getElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[1]/a");
        Assert.assertEquals(element.isDisplayed(), true, "navigated to US section");
        TestLogger.log("US section Page has been displayed");
    }
    public void navigateToWorldSection() {
        WebElement element=getElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[2]/a");
        Assert.assertEquals(element.isDisplayed(), true, "navigated to World section");
        TestLogger.log("World section Page has been displayed");
    }
    public void navigateToPoliticsSection() {
        WebElement element=getElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[3]/a");
        Assert.assertEquals(element.isDisplayed(), true, "navigated to Politics section");
        TestLogger.log("Politics section Page has been displayed");
    }

    public void navigateToBusinessPage() {
       WebElement element=getElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[4]/a");
        Assert.assertEquals(element.isDisplayed(), true, "navigated to Business section");
        driver.navigate().to("https://cnn.com");
        driver.navigate().back();
    }

    public void navigateToOpinionPage() {
        WebElement element=getElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[5]/a");
        Assert.assertEquals(element.isDisplayed(), true, "navigated to Opinion section");
        driver.navigate().to("https://cnn.com");
        driver.navigate().back();
    }

    public void navigateToHealthPage() {
       WebElement element=getElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[6]/a");
        Assert.assertEquals(element.isDisplayed(), true, "navigated to Health section");
        driver.navigate().to("https://cnn.com");
        driver.navigate().back();
    }

    public void navigateToEntertainmentPage() {
        WebElement element = getElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[7]/a");
        Assert.assertEquals(element.isDisplayed(), true, "navigated to Entertainment section");
        driver.navigate().to("https://cnn.com");
        driver.navigate().back();
    }

    public void navigateToStylePage() {
       WebElement element=getElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[8]/a");
        Assert.assertEquals(element.isDisplayed(), true, "navigated to Style section");
        driver.navigate().to("https://cnn.com");
        driver.navigate().back();
    }

    public void navigateToTravelPage() {
        WebElement element=getElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[9]/a");
        Assert.assertEquals(element.isDisplayed(), true, "navigated to Style section");
        TestLogger.log("Travel page has been displayed");
    }

    public void navigateToSportsPage() {
        WebElement element=getElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[10]/a");
        Assert.assertEquals(element.isDisplayed(), true, "navigated to Sports section");
        TestLogger.log("Sports page has been displayed");
    }

    public void navigateToVideosPage() {
        WebElement element=getElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[11]/a");
        Assert.assertEquals(element.isDisplayed(), true, "navigated to Video section");
        TestLogger.log("Travel page has been displayed");
    }

    public void checkTechPage() {
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[4]/button/svg");
        clickOnElement("//*[@id=\"nav\"]/header/div/div[2]/div/div[3]/nav/ul/li[8]/a");
    }

    public void testSearchCoupons() {
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[4]/button/svg");
        typeOnElement("//*[@id=\"header-search-bar\"]", "coupons");
    }

    public void testAsiaPage(){
        WebElement element=getElement("//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[2]/ul/li[3]/a");
        Assert.assertEquals(element.isDisplayed(), true, "navigated to Asia section");
        TestLogger.log("Asia page has been displayed");

    }
    public void testInnovativeCitiesPage(){
        WebElement element=getElement("//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[8]/ul/li[6]/a");
        Assert.assertEquals(element.isDisplayed(), true, "navigated to Innovative section");
        TestLogger.log("Innovative page has been displayed");
    }

    public void testDigitalStudiosPage(){
        WebElement element=getElement("//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[12]/ul/li[2]/a");
        Assert.assertEquals(element.isDisplayed(), true, "navigated to Digital Studio section");
        TestLogger.log("Digital Studio page has been displayed");
    }
    public void testCNNFilmsPage(){
        WebElement element=getElement("//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[12]/ul/li[3]/a");
        Assert.assertEquals(element.isDisplayed(), true, "navigated to CNN Films section");
        TestLogger.log("CNN Films page has been displayed");
    }
    public void testEuropeSection(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[2]/ul/li[6]/a");
    }


}



