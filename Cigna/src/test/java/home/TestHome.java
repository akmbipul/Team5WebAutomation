package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.HomePage;

    public class TestHome extends CommonAPI {
    HomePage homePage;
  //  CompanyFrofilePage companyFrofilePage;

    @BeforeMethod
    public void initElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
   // @Test
    public void testOfEmployerBrokerLoginButton() {
        homePage.employerBrokerLoginTest();
    }
    @Test
    public void test3() {
        homePage.internationalHealthInsuranceTest();
    }
    @Test
    public void test4() {
        homePage.importantBenifitUpdatesTest();
    }
   // @Test
    public void individualFamilyTest(){
        homePage.clickOnIndividulasAndFamilies();
    }
    @Test
    public void supplimentalTest(){

        homePage.otherSupplimentalInsuranceTest();
    }
   // @Test
    public void cignaInternationalTest(){
        homePage.setCignaInternational();
    }
    //@Test
    public void aboutCignaTest(){
        homePage.setAboutCigna();
    }
    @Test
    public void dentalInsuranceTest(){
        homePage.setDentalInsurance();
    }
    @Test
    public void healthierKidsForFutureTest() {
        homePage.setHealthierKidsforOurFuture();
    }

    //@Test
        public void milestonesTest(){
        //companyFrofilePage.setMilestones();
    }


    }
