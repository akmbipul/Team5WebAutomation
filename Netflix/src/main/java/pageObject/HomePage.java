package pageObject;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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


   public void getDayFree(){
       tryDayFree.click();
   }
   public void getWhatIsNetflix(){
       whatIsNetflix.click();
   }
   public void getHowMuchNetflixCosts(){
       howMuchNetflixCosts.click();
   }
   public void getWhereCanIwatch(){
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
   public void getMediaCenter(){
       mediaCenter.click();
   }
   public void RedeemGiftCards(){
       redeemGiftCards.click();
   }



}
