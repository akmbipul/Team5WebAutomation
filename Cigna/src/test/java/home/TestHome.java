package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.CompanyFrofilePage;
import pageobjects.HomePage;

    public class TestHome extends CommonAPI {
    HomePage homePage;
    CompanyFrofilePage companyFrofilePage;

    @BeforeMethod
    public void initElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        companyFrofilePage=PageFactory.initElements(driver, CompanyFrofilePage.class);
    }

        //@Test
    public void testOfEmployerBrokerLoginButton() {
        homePage.employerBrokerLoginTest();
    }
    // @Test
    public void test3() {
        homePage.internationalHealthInsuranceTest();
    }
    //@Test
    public void test4() { homePage.importantBenifitUpdatesTest(); }
    // @Test
    public void supplimentalTest(){ homePage.otherSupplimentalInsuranceTest(); }
    // @Test
    public void dentalInsuranceTest(){
        homePage.setDentalInsurance();
    }
    // @Test
    public void healthierKidsForFutureTest() {
        homePage.setHealthierKidsforOurFuture();
    }
    //@Test
    public void testCignaInternational() {homePage.setCignaInternational();}
    //@Test
    public void testAboutUsCigna(){homePage.getAboutUsCigna();}
     @Test
     public void testMouseHoverOnInvestorRelations(){
        homePage.mouseHoverOnInvestorRelations();
      }

      //@Test
        public void testClickOnCignaOverview(){
        homePage.clickOnCignaOverview();
      }

    }
