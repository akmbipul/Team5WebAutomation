package pageobjects;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"includes-content\"]/div[1]/nav[1]/div/ul/li[2]/a")
    WebElement contactUs;
    @FindBy(xpath = "//*[@id=\"includes-content\"]/div[1]/div/div/div[1]/div/div[2]/ul/li[2]/a")
    WebElement healthAndWellness;
    @FindBy(css = "#includes-content > div.bg-gray-01 > div > div > div:nth-child(1) > div > div.col-12.col-lg-6.mb-xl.mb-sm-0 > ul > li:nth-child(3) > a")
    WebElement glossary;
    @FindBy(css = "//*[@id=\"includes-content\"]/div[1]/div/div/div[1]/div/div[2]/ul/li[4]/a")
    WebElement memberResources;
    @FindBy(xpath = "//*[@id=\"includes-content\"]/div[1]/div/div/div[1]/div/div[2]/ul/li[5]/a")
    WebElement CignaMobileApps;
    @FindBy(xpath = "//*[@id=\"includes-content\"]/div[1]/div/div/div[1]/div/div[2]/ul/li[6]/a")
    WebElement employerAcaResponsibilities;
    @FindBy(xpath = "//*[@id=\"includes-content\"]/div[1]/div/div/div[2]/div/div[1]/ul/li[2]/a")
    WebElement myCignaMemberPortal;
    @FindBy(xpath = "//*[@id=\"includes-content\"]/div[1]/div/div/div[2]/div/div[1]/ul/li[4]/a")
    WebElement cignaAccess;
    @FindBy(css = "#includes-content > div.bg-gray-01 > div > div > div:nth-child(2) > div > div.col-12.col-lg-6.mb-0 > ul > li:nth-child(2) > a")
    WebElement companyProfile;
    @FindBy(css = "#includes-content > div.bg-gray-01 > div > div > div:nth-child(2) > div > div.col-12.col-lg-6.mb-0 > ul > li:nth-child(3) > a")
    WebElement career;
    @FindBy(xpath = "//*[@id=\"includes-content\"]/div[1]/div/div/div[2]/div/div[2]/ul/li[4]/a")
    WebElement newsRoom;
    @FindBy(xpath = "//*[@id=\"includes-content\"]/div[1]/div/div/div[2]/div/div[2]/ul/li[5]/a")
    WebElement investors;
    @FindBy(css = "#includes-content > div.bg-gray-01 > div > div > div:nth-child(2) > div > div.col-12.col-lg-6.mb-0 > ul > li:nth-child(6) > a")
    WebElement suppliers;
    @FindBy(xpath = "//*[@id=\"includes-content\"]/div[1]/div/div/div[2]/div/div[2]/ul/li[8]/a")
    WebElement international;


    public void setContactUs() {
        this.contactUs.click();
    }

    public void setHealthAndWellness() {
        this.healthAndWellness.click();
    }

    public void setGlossary() {
        this.glossary.click();
    }

    public void setMemberResources() {
        memberResources.click();
    }

    public void setCignaMobileApps() {
        CignaMobileApps.click();
    }

    public void setEmployerAcaResponsibilities() {
        employerAcaResponsibilities.click();
    }

    public void setMyCignaMemberPortal() {
        myCignaMemberPortal.click();
    }

    public void setCignaAccess() {
        this.cignaAccess.click();
    }

    public void setCompanyProfile() {
        companyProfile.click();
    }

    public void setCareer() {
        career.click();
    }

    public void setNewsRoom() {
        newsRoom.click();
    }

    public void setInvestors() {
        this.investors.click();
    }

    public void setSuppliers() {
        this.suppliers.click();
    }

    public void setInternational() {
        this.international.click();
    }

    }


























