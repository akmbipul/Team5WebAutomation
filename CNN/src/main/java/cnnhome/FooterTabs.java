package cnnhome;

import base.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class FooterTabs extends CommonApi {
    HomePage homePage=new HomePage();

    public void getTermsOfUseButton() {
        WebElement element = getElement("//*[@id=\"footer-wrap\"]/footer/div[5]/div/div[2]/nav/ul/li[1]/a");
        element.click();
        Assert.assertEquals(element.isDisplayed(),true);
        Assert.assertEquals(element.isEnabled(),true);
    }

    public List<WebElement> footerMenu(){
        return driver.findElements(By.xpath("//ul[@class='nav-linksstyles__NavLinkList-sc-1tike8v-2 ksljyS']"));
    }
    public void getPrivacyPolicy(){
        WebElement element=getElement("//*[@id=\"footer-wrap\"]/footer/div[5]/div/div[2]/nav/ul/li[2]/a");
        element.click();
        WebElement valueOfPrivacyPolicy=getElement("//body[@class='pg pg-cnn-info pg-leaf pg-article domestic t-light multi-ads--complete pg-show-read-all']/div[contains(@class,'pg-right-rail-tall pg-wrapper')]/article[contains(@class,'pg-rail-tall pg-rail--align-right')]/div[@class='l-container']/div[@class='pg-rail-tall__wrapper']/div[@class='pg-side-of-rail pg-rail-tall__side']/div[@class='pg-rail-tall__body']/section[@id='body-text']/div[@class='l-container']/div[@class='el__embedded el__embedded--standard']/div[@class='element-raw appearance-standard']/p[@class='zn-body__paragraph']/a[1]");
        Assert.assertEquals(valueOfPrivacyPolicy.isEnabled(),true);
    }
    public void getAboutUs(){
       WebElement element=getElement("//*[@id=\"footer-wrap\"]/footer/div[5]/div/div[2]/nav/ul/li[5]/a");
        element.click();
        Assert.assertEquals(element.isDisplayed(),true);
    }

    public void goToCNNStore(){
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[4]/button/svg");
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[13]/ul/li[6]/a");
        driver.navigate().to("https://www.cnn.com/");
    }
    public void getSiteMap(){
        WebElement element=getElement("//*[@id=\"footer-wrap\"]/footer/div[5]/div/div[2]/nav/ul/li[12]/a");
        element.getTagName();
        Assert.assertEquals(element.isDisplayed(),true);
        Assert.assertEquals(element.isEnabled(),true);
    }

    public void validateFooterTurner(){
        WebElement elementOfFooterTurner=getElement("//a[@class='Text-sc-1amvtpj-0-a Link-sc-1hkqz5e-0 copyright__TBSLink-f3mp1a-1 iqIHwd']");
        Assert.assertEquals(elementOfFooterTurner.isDisplayed(),true);
        Assert.assertEquals(elementOfFooterTurner.isEnabled(),true);
        elementOfFooterTurner.click();
        driver.navigate().to("https://cnn.com");
    }
    public void validateLinkTextSports(){
        driver.findElement(By.linkText("Sports")).click();
        driver.navigate().to("https://cnn.com");
    }
    public void goToNewsletter(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[5]/div/div[2]/nav/ul/li[8]/a");
        clickOnElement("//*[@id=\"textbreakingnews\"]");
        typeOnElement("//*[@id=\"subEmail\"]", "timani@gmail.com");
    }
    public void getCNNStudioTours(){
        WebElement element=getElement("//*[@id=\"footer-wrap\"]/footer/div[5]/div/div[2]/nav/ul/li[6]/a");
        Assert.assertEquals(element.isDisplayed(),true);
        Assert.assertEquals(element.isEnabled(),true);
    }

    public void getAccessibilityAndCc(){
        WebElement element=getElement("//*[@id=\"footer-wrap\"]/footer/div[5]/div/div[2]/nav/ul/li[3]/a");
        Assert.assertEquals(element.isDisplayed(),true);
        Assert.assertEquals(element.isEnabled(),true);
    }

    public void getTranscript(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[5]/div/div[2]/nav/ul/li[9]/a");
    }

    public void licenseFootage(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[5]/div/div[2]/nav/ul/li[10]/a");
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

    public void testArchitecturePage(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[9]/ul/li[4]/a");
    }
    public void testPlayPage(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[10]/ul/li[3]/a");
    }
    public void getCNNNewSource(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[5]/div/div[2]/nav/ul/li[11]/a");
    }
    public void getAdChoices(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[5]/div/div[2]/nav/ul/li[4]/a");
    }
}
