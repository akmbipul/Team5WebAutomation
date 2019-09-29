package pageobjects;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompanyFrofilePage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"1385098823854\"]/div/div[5]/header/div/nav/div/ul/li[1]/a")
    WebElement companyProfile;
    @FindBy(css = "#\\31 386145326728 > div > div > div:nth-child(2)")
    WebElement healthCareLeadership;
    @FindBy(css = "#\\31 386145326728 > div > div > div:nth-child(3) > div.col-xs-12.col-sm-5.col-md-5.plan-heading > h3")
    WebElement factsAboutCigna;
    @FindBy(css = "#\\31 386145326728 > div > div > div:nth-child(4)")
    WebElement executiveAndLeadershipTeam;
    @FindBy(css = "#\\31 386145326728 > div > div > div:nth-child(5)")
    WebElement corporateGovernance;
    @FindBy(css = "#\\31 386145326728 > div > div > div:nth-child(6)")
    WebElement milestones;
    @FindBy(xpath = "//*[@id=\"1386145326728\"]/div/div/div[6]")
    WebElement cignaCompanies;
    @FindBy(xpath = "//*[@id=\"1386145326728\"]/div/div/div[7]/div[1]/h3")
    WebElement otherCignaWebsites;

    public void setCompanyProfile(){
        companyProfile.click();
    }
    public void setHealthCareLeadership(){
        healthCareLeadership.click();
    }
    public void setFactsAboutCigna(){
        this.factsAboutCigna.click();
    }
    public void setExecutiveAndLeadershipTeam(){
        executiveAndLeadershipTeam.click();
    }
    public void setCorporateGovernance(){
        corporateGovernance.click();
    }
    public void setMilestones(){
        this.milestones.click();
    }
    public void setCignaCompanies(){
        cignaCompanies.click();
    }
    public void setOtherCignaWebsites(){
        otherCignaWebsites.click();
    }
    }
