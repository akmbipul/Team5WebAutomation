package home;

import base.CommonApi;
import cnnhome.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestSearchPage extends SearchPage {
    @Test
    public void testNavigateToUsSection() {
        navigateToUsSection();
        driver.navigate().to("https://cnn.com");
        driver.navigate().back();
    }
    @Test
    public void navigateToWorldSection() {
        driver.navigate().to("https://cnn.com");
        driver.navigate().back();
    }
   @Test
    public void navigateToPoliticsSection() {
        driver.navigate().to("https://cnn.com");
        driver.navigate().back(); }

    @Test
    public void navigateToBusinessPage(){
        TestLogger.log("Business section Page has been displayed");
    }

    @Test
    public void navigateToOpinionPage(){
        TestLogger.log("Opinion section Page has been displayed");
    }

    @Test
    public void navigateToHealthPage(){
        TestLogger.log("Health section Page has been displayed");
    }

    @Test
    public void navigateToEntertainmentPage(){
        TestLogger.log("Entertainment section Page has been displayed");
    }

    @Test
    public void navigateToStylePage(){
        TestLogger.log("Style section Page has been displayed");
    }

    @Test
    public void navigateToTravelPage(){
        driver.navigate().to("https://cnn.com");
        driver.navigate().back();
    }

    @Test
    public void navigateToSportsPage(){
        driver.navigate().to("https://cnn.com");
        driver.navigate().back();
    }

    @Test
    public void navigateToVideosPage(){
        driver.navigate().to("https://cnn.com");
        driver.navigate().back();
    }
    @Test
    public void checkTechPage() {
        driver.navigate().to("https://cnn.com");
        driver.navigate().back();
    }

    @Test
    public void testSearchCoupons() {
        driver.navigate().to("https://cnn.com");
        driver.navigate().back();
    }
    @Test
    public void testAsiaPage() {
    }
    @Test
    public void testInnovativeCitiesPage(){
    }
    @Test
    public void testDigitalStudiosPage() {
    }
    @Test
    public void testCNNFilmsPage(){}
    @Test
    public void testEuropeSection() {
    }

}

