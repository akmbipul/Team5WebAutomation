package home;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestCheckEdition extends CommonApi {
    @Test
    public void checkEditionButton() {
        TestLogger.log("Edition button has been displayed");
        driver.navigate().to("https://cnn.com");
    }

    @Test
    public void checkUSEdition(){
        TestLogger.log("Us edition page has been displayed");
        driver.navigate().to("https://cnn.com");
    }
    @Test
    public void checkInternationalEd(){
        TestLogger.log("International edition page has been displayed");
        driver.navigate().to("https://cnn.com");
    }
    @Test
    public void checkArabicEdition(){
        TestLogger.log("Arabic edition page has been displayed");
        driver.navigate().to("https://cnn.com");
    }
    @Test
    public void checkEspanolEdition(){
        TestLogger.log("Es edition page has been displayed");
        driver.navigate().to("https://cnn.com");
    }
}