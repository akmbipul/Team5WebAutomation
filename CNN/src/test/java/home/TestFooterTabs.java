package home;

import base.CommonApi;
import cnnhome.FooterTabs;
import cnnhome.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.List;

public class TestFooterTabs extends FooterTabs {

    @Test
    public void getTermsOfUseButton() {
        driver.navigate().to("https://www.cnn.com/");
    }
    @Test
    public void testOnFooterMenu(){
        List<WebElement> footerMenuList=footerMenu();
        System.out.println(footerMenuList.size());
    }
    @Test
    public void getPrivacyPolicy(){
        driver.navigate().to("https://www.cnn.com/");
        sleepFor(10);
    }
    @Test
    public void getAboutUs(){
        driver.navigate().to("https://www.cnn.com/");
    }
    @Test
    public void goToCNNStore(){
    }
    @Test
    public void getSiteMap() {
        driver.navigate().to("https://www.cnn.com/");
    }
    @Test
    public void validateFooterTurner(){
        driver.navigate().to("https://www.cnn.com/");
        driver.navigate().back();
    }
    @Test
    public void validateLinkTextSports(){
    }
    @Test
    public void goToNewsletter(){
        driver.navigate().to("https://www.cnn.com/");
        driver.navigate().back();
    }
    @Test
    public void getCNNStudioTours(){
        TestLogger.log("Cnn Studio has been displayed");
        driver.navigate().to("https://www.cnn.com/");
    }
    @Test
    public void getAccessibilityAndCc(){
        TestLogger.log("Accessibility has been displayed");
        driver.navigate().to("https://www.cnn.com/");
    }
    @Test
    public void getTranscript(){
        TestLogger.log("Transcript has been displayed");
        driver.navigate().to("https://www.cnn.com/");
    }
    @Test
    public void licenseFootage(){
        TestLogger.log("License has been displayed");
        driver.navigate().to("https://www.cnn.com/");
    }
    @Test
    public void testArchitecturePage(){
        driver.navigate().to("https://www.cnn.com/");
    }
    @Test
    public void testPlayPage(){
    }
    @Test
    public void testParentingSection(){
    }
    @Test
    public void testFactsSection(){
    }
    @Test
    public void get2019Elections() {
    }
    @Test
    public void getCNNNewSource(){
    }
    @Test
    public void getAdChoices(){
    }
}
