package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.SearchPage;
import reporting.TestLogger;

import java.security.PublicKey;
import java.util.List;

public class TestHome extends CommonAPI {

    HomePage homePage;
    SearchPage searchPage;

    @BeforeMethod
    public void initElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        searchPage=PageFactory.initElements(driver, SearchPage.class);
    }

    @Test
    public void TestTry30dayFree() {
        homePage.getDayFree();
    }  // @Test
    @Test
    public void TestWhatIsNetflix() {
        homePage.getWhatIsNetflix();
    }
    @Test
    public void TestHowmuchNetflixCosts() {
        homePage.getHowMuchNetflixCosts();
    }
    @Test
    public void TestWhereCanIwatch() {
        homePage.getWhereCanIwatch();
    }
    @Test
    public void TestHowDoIcancel() {
        homePage.gethowDoIcancel();
    }
    @Test
    public void TestHowCanIwatchOnNetflix() {
        homePage.getHowCanIwatchOnNetflix();
    }
    @Test
    public void TestHowFreetrialWorks() {
        homePage.getHowFreetrialWorks();
    }
    @Test
    public void TestFaq() {
        homePage.getFaq();
    }
    @Test
    public void TestMediaCenter() {
        homePage.getMediaCenter();
    }
    @Test
    public void TestRedeemGiftcards() {
        homePage.RedeemGiftCards();
    }
    @Test
    public void TestTermsOfUse() { homePage.getTermsOfUse(); }
    @Test
    public void TestDropDown() { homePage.setLanguageDropDownown(); }
    @Test
    public void TestCorporateInformation() { homePage.getCorporateInformation(); }
    @Test
    public void TestLegalNotice() { homePage.getlegalNotices(); }
    @Test
    public void TestHelpCenter() { homePage.getHelpCenter(); }
    @Test
    public void TestInvestorRelations() { homePage.getInvestorRelations(); }
    @Test
    public void TestBuyGiftCards() { homePage.getBuyGiftCards(); }
    @Test
    public void TestPrivacy() { homePage.getPrivacy(); }
    @Test
    public void TestContactUs() { homePage.getContactUs(); }
    @Test
    public void TestNetflixOriginals() { homePage.getNetflixOriginals(); }
    @Test
    public void TestGetAccount() { homePage.getaccount(); }
    @Test
    public void TestGetJobs() { homePage.getJobs(); }
    @Test
    public void TestWaysTowatch() { homePage.getWaysToWatch(); }
    @Test
    public void TestCookiePreferences() { homePage.getCookieFreferences(); }
    @Test
    public void TestSpeedTest() { homePage.getSpeedTest(); }
    @Test
    public void TestLogin(){searchPage.login();}


}





