package pageObject;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.jvm.hotspot.utilities.Assert;
import java.util.List;

import static sun.jvm.hotspot.utilities.Assert.*;

public class HomePage extends CommonAPI {

   @FindBy(css=".hero-cta-btn-txt")
   WebElement tryDayFree;
   @FindBy(css = ".faq-list-item")
   WebElement whatIsNetflix;
   @FindBy(css = ".faq-question")
   WebElement howMuchNetflixCosts;
   @FindBy(xpath = "//*[@id=\"appMountPoint\"]/div/div/div/div/div/div[2]/div[5]/div[1]/ul/li[3]/button")
   WebElement whereCanIwatch;
   @FindBy(xpath = "//*[@id=\"appMountPoint\"]/div/div/div/div/div/div[2]/div[5]/div[1]/ul/li[3]/button")
   WebElement howDoIcancel;
   @FindBy(xpath = "//*[@id=\"appMountPoint\"]/div/div/div/div/div/div[2]/div[5]/div[1]/ul/li[5]/button")
   WebElement howCanIwatchOnNetflix;
   @FindBy(xpath = "//*[@id=\"appMountPoint\"]/div/div/div/div/div/div[2]/div[5]/div[1]/ul/li[5]/button")
   WebElement howFreetrialWorks;
   @FindBy(xpath = "//*[@id=\"appMountPoint\"]/div/div/div/div/div/div[2]/div[6]/div[1]/div[2]/ul/li[1]/a/span")
   WebElement faq;
   @FindBy(xpath = " //*[@id=\"appMountPoint\"]/div/div/div/div/div/div[2]/div[6]/div[1]/div[2]/ul/li[4]/a/span")
   WebElement mediaCenter;
   @FindBy(xpath = "//*[@id=\"appMountPoint\"]/div/div/div/div/div/div[2]/div[6]/div[1]/div[2]/ul/li[7]/a/span")
   WebElement redeemGiftCards;
   @FindBy(xpath = "//*[@id=\"appMountPoint\"]/div/div/div/div/div/div[2]/div[6]/div[1]/div[2]/ul/li[10]/a/span")
   WebElement termsOfUse;
   @FindBy(xpath = "//*[@id=\"appMountPoint\"]/div/div/div/div/div/div[2]/div[6]/div[1]/div[2]/ul/li[13]/a/span")
   WebElement corporateInformation;
   @FindBy(xpath = "//*[@id=\"appMountPoint\"]/div/div/div/div/div/div[2]/div[6]/div[1]/div[2]/ul/li[16]/a/span")
   WebElement legalNotices;
   @FindBy(xpath = "//*[@id=\"appMountPoint\"]/div/div/div/div/div/div[2]/div[6]/div[1]/div[2]/ul/li[2]/a/span")
   WebElement helpCenter;
   @FindBy(xpath = "//*[@id=\"appMountPoint\"]/div/div/div/div/div/div[2]/div[6]/div[1]/div[2]/ul/li[5]/a/span")
   WebElement investorRelations;
   @FindBy(xpath = "//*[@id=\"appMountPoint\"]/div/div/div/div/div/div[2]/div[6]/div[1]/div[2]/ul/li[8]/a/span")
   WebElement buyGiftCards;
   @FindBy(xpath = "//*[@id=\"appMountPoint\"]/div/div/div/div/div/div[2]/div[6]/div[1]/div[2]/ul/li[11]/a/span")
   WebElement privacy;
   @FindBy(xpath = "//*[@id=\"appMountPoint\"]/div/div/div/div/div/div[2]/div[6]/div[1]/div[2]/ul/li[14]/a/span")
   WebElement contactUs;
   @FindBy(xpath = "//*[@id=\"appMountPoint\"]/div/div/div/div/div/div[2]/div[6]/div[1]/div[2]/ul/li[17]/a/span")
   WebElement netflixOriginals;
   @FindBy(xpath = "//*[@id=\"appMountPoint\"]/div/div/div/div/div/div[2]/div[6]/div[1]/div[2]/ul/li[3]/a/span")
   WebElement account;
   @FindBy(xpath = "//*[@id=\"appMountPoint\"]/div/div/div/div/div/div[2]/div[6]/div[1]/div[2]/ul/li[6]/a/span")
   WebElement jobs;
   @FindBy(xpath = "//*[@id=\"appMountPoint\"]/div/div/div/div/div/div[2]/div[6]/div[1]/div[2]/ul/li[9]/a/span")
   WebElement waysToWatch;
   @FindBy(xpath = "//*[@id=\"appMountPoint\"]/div/div/div/div/div/div[2]/div[6]/div[1]/div[2]/ul/li[12]/a/span")
   WebElement cookiePreferences;
   @FindBy(xpath = "//*[@id=\"appMountPoint\"]/div/div/div/div/div/div[2]/div[6]/div[1]/div[2]/ul/li[15]/a/span")
   WebElement speedTest;
   @FindBy(css = "#undefined-select")
    WebElement languageDropDown;


   public void getDayFree(){
       tryDayFree.click();
   }
   public void getWhatIsNetflix(){
       whatIsNetflix.click();
   }
   public void getHowMuchNetflixCosts() {
       howMuchNetflixCosts.click();
   }
   public void getWhereCanIwatch() {
       whereCanIwatch.click();
   }
   public void gethowDoIcancel(){
       howDoIcancel.click();
   }
   public void getHowCanIwatchOnNetflix(){
       howCanIwatchOnNetflix.click();
   }
   public void getHowFreetrialWorks(){
       howFreetrialWorks.click();
   }
   public void getFaq(){
       faq.click();
   }
   public void getMediaCenter() {
       mediaCenter.click();
   }
   public void RedeemGiftCards(){
       redeemGiftCards.click();
   }
   public void getTermsOfUse(){
       termsOfUse.click();
   }
   public void getCorporateInformation(){
       corporateInformation.click();
   }
   public void getlegalNotices(){
       legalNotices.click();
   }
   public void getHelpCenter() {
       helpCenter.click();
   }
   public void getInvestorRelations() {
       investorRelations.click();
   }
   public  void getBuyGiftCards(){
       buyGiftCards.click();
   }
   public void getPrivacy(){
       privacy.click();
   }
   public void getContactUs(){
       contactUs.click();
   }
   public void getNetflixOriginals(){
       netflixOriginals.click();
   }
   public void getaccount(){
       account.click();
   }
   public void getJobs(){
       jobs.click();
   }
   public void getWaysToWatch() {
       waysToWatch.click();
   }
   public void getCockieFreferences(){
       cookiePreferences.click();
   }
   public void getSpeedTest(){
       speedTest.click();
   }
   public void setLanguageDropDownown(){
       List<WebElement>element=getListOfWebElementsByCss("#undefined-select");
       List<String>listOfText=getListOfString(element);
      for(String text : listOfText){
          System.out.println(text);

      }
       List<String>expectedMenu=listOfText;
      //assertEquals(listOfText, expectedMenu);


   }
    }


