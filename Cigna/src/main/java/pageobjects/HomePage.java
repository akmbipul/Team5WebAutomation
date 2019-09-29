package pageobjects;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {

    @FindBy(css ="#includes-content > div.d-none.d-lg-block > nav.navbar.global-nav.navbar-expand-lg.site-navigation-level-1 > div > ul > li:nth-child(2) > a" )
    WebElement employerBrokerLogin;

    @FindBy(css = "#\\31 564310141632 > div > div.col-12.col-lg-5.mb-xl.mb-lg-0.content-block-section > div > div > div:nth-child(2) > div.icon-teaser-content > a ")
    WebElement dentalInsurancePlan;
    @FindBy(css = "#\\31 564310141632 > div > div.col-12.col-lg-5.mb-xl.mb-lg-0.content-block-section > div > div > div:nth-child(5) > div.icon-teaser-content > a")
    WebElement otherSupplimentalInsurance;
    @FindBy(css = "#\\31 564310141632 > div > div.col-12.col-lg-5.mb-xl.mb-lg-0.content-block-section > div > div > div:nth-child(6) > div.icon-teaser-content > a")
    WebElement internationalHealthInsurance;
    @FindBy(css = "#\\31 564310141633 > div > div.col-12.col-lg-3 > h2")
    WebElement importantBenifitUpdates;
    @FindBy(css="#\\31 503828750839 > div.global-header > div > nav.navbar.global-nav.universal-navigation.navbar-expand-lg.navbar-white.bg-white.pt-lg-0 > div > ul:nth-child(2) > li:nth-child(1) > a")
    WebElement cignaInternational;
    @FindBy(css="#\\31 503828750839 > div.global-header > div > nav.navbar.global-nav.universal-navigation.navbar-expand-lg.navbar-white.bg-white.pt-lg-0 > div > ul:nth-child(2) > li:nth-child(2) > a")
    WebElement aboutCigna;
    @FindBy(css="#\\31 564310141631 > div > div > div:nth-child(2) > div > div.teaser-content.col-12.col-md-7.col-lg-12.align-self-lg-center > header > a")
    WebElement healthierKidsforOurFuture;
    public void clickOnIndividulasAndFamilies() {
        clickOnElement("#includes-content > div.d-none.d-lg-block > nav.navbar.global-nav.navbar-expand-lg.site-navigation-level-1 > div > ul > li:nth-child(4) > afir");
    }

    public void employerBrokerLoginTest()
    {
        this.employerBrokerLogin.click();
    }

    public void internationalHealthInsuranceTest(){
        internationalHealthInsurance.click();
    }

    public void otherSupplimentalInsuranceTest() {
        this.otherSupplimentalInsurance.click();
    }

    public void importantBenifitUpdatesTest() {
        this.importantBenifitUpdates.click();
    }

    public void setCignaInternational(){
        cignaInternational.click();
    }
    public void setAboutCigna(){
        aboutCigna.click();
    }
    public void setDentalInsurance(){
        this.dentalInsurancePlan.click();
    }
    public void setHealthierKidsforOurFuture(){
        this.healthierKidsforOurFuture.click();
    }
    }
