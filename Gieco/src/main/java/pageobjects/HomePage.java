package pageobjects;

import base.CommonAPI;
import com.sun.org.apache.xalan.internal.xsltc.dom.NthIterator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class HomePage extends CommonAPI {

  @FindBy(xpath = "//*[@id=\"header-left-links\"]/ul[1]/li[1]/a")
  WebElement insurance;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[1]/a/span[2]")
  WebElement vehicleInsurance;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[1]/div/ul/li[1]/a/span")
  WebElement auto;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[1]/div/ul/li[2]/a/span")
  WebElement motorcycle;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[1]/div/ul/li[3]/a/span")
  WebElement atv;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[1]/div/ul/li[4]/a/span")
  WebElement rv;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[1]/div/ul/li[5]/a/span")
  WebElement boatPwc;
  @FindBy(xpath = " //*[@id=\"primary-navigation\"]/div[2]/ul/li[1]/div/ul/li[6]/a/span ")
  WebElement collectorAuto;
  @FindBy(xpath ="//*[@id=\"primary-navigation\"]/div[2]/ul/li[1]/div/ul/li[7]/a/span" )
  WebElement rideShare;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[1]/div/ul/li[8]/a")
  WebElement commercialAuto;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[1]/div/ul/li[9]/a")
  WebElement mexicoAuto;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[2]/a/span[2]")
  WebElement propertyInsurance;
  @FindBy(css = "#primary-navigation > div:nth-child(2) > ul > li:nth-child(2) > div > ul > li:nth-child(1) > a > span")
  WebElement homeOwners;
  @FindBy(css = "#primary-navigation > div:nth-child(2) > ul > li:nth-child(2) > div > ul > li:nth-child(2) > a")
  WebElement renters;
  @FindBy(css = "#primary-navigation > div:nth-child(2) > ul > li:nth-child(2) > div > ul > li:nth-child(3) > a > span")
  WebElement condoCoOp;
  @FindBy(css = "#primary-navigation > div:nth-child(2) > ul > li:nth-child(2) > div > ul > li:nth-child(4) > a > span")
  WebElement mobileHome;
  @FindBy(css = "#primary-navigation > div:nth-child(2) > ul > li:nth-child(2) > div > ul > li:nth-child(5) > a > span")
  WebElement landLord;
  @FindBy(css = "#primary-navigation > div:nth-child(2) > ul > li:nth-child(2) > div > ul > li:nth-child(6) > a > span")
  WebElement flood;
  @FindBy(css = "#primary-navigation > div:nth-child(2) > ul > li:nth-child(3) > a > span.geico-nav-menu-item")
  WebElement businessInsurance;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/div/ul/li[1]/a/span")
  WebElement businessOwners;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/div/ul/li[2]/a/span")
  WebElement generalLiability;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/div/ul/li[3]/a/span")
  WebElement professionalLiability;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/div/ul/li[4]/a/span")
  WebElement workersCompensation;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/div/ul/li[4]/a/span")
  WebElement medicalMalPractice;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/div/ul/li[6]/a/span")
  WebElement wellnessAndFitness;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/div/ul/li[7]/a/span")
  WebElement commercialAuto2;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[3]/div/ul/li[8]/a/span")
  WebElement rideShare2;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[4]/a/span[2]")
  WebElement additionalInsurance;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[4]/div/ul/li[1]/a/span")
  WebElement umbrella;
  @FindBy(css = "#primary-navigation > div:nth-child(2) > ul > li:nth-child(4) > div > ul > li:nth-child(2) > a > span")
  WebElement life;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[4]/div/ul/li[3]/a/span")
  WebElement travel;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[4]/div/ul/li[4]/a/span")
  WebElement overseas;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[4]/div/ul/li[5]/a/span")
  WebElement identityProtection;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[4]/div/ul/li[6]/a")
  WebElement pet;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[2]/ul/li[4]/div/ul/li[7]/a/span")
  WebElement jewelery;
  @FindBy(css="#header-left-links > ul.desktop-links > li:nth-child(2) > a")
  WebElement information;
  @FindBy(css = "#primary-navigation > div:nth-child(3) > ul > li.geico-nav--bluejay.section--bluejay > a > span.geico-nav-menu-item")
  WebElement myAccount;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[3]/ul/li[1]/div/ul/li[2]/a/span")
  WebElement getIdcards;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[3]/ul/li[1]/div/ul/li[3]/a/span")
  WebElement addAVehicle;
  @FindBy(css = "#primary-navigation > div:nth-child(3) > ul > li.geico-nav--bluejay.section--bluejay > div > ul > li:nth-child(4) > a > span")
  WebElement goPaperless;
  @FindBy(css = "#TextInputComponent-1")
  WebElement  userIDEmailPolicyNumber;
  @FindBy(css = "#TextInputComponent-2")
  WebElement passWord;
  @FindBy(xpath = "//*[@id=\"wrapper\"]/ng-component/div[1]/div/div[1]/div[1]/form/div[2]/a")
  WebElement forgotUserIDPassWord;
  @FindBy(xpath = "//*[@id=\"wrapper\"]/ng-component/div[1]/div/div[1]/div[3]/a")
  WebElement signUpForAnAccount;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[3]/ul/li[3]/a/span[2]")
  WebElement toolsAndResourses;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[3]/ul/li[3]/div/ul/li[11]/a/span")
  WebElement lifeEventPlanning;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[3]/ul/li[3]/div/ul/li[12]/a")
  WebElement personalPropertyCalculator;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[3]/ul/li[3]/div/ul/li[13]/a/span")
  WebElement insuranceTerms;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[3]/ul/li[3]/div/ul/li[14]/a/span")
  WebElement parkingLocator;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[3]/ul/li[3]/div/ul/li[15]/a/span")
  WebElement parkingInspectionSites;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[3]/ul/li[4]/a/span[2]")
  WebElement aboutGieco;
  @FindBy(css = "#primary-navigation > div:nth-child(3) > ul > li.geico-nav--geico-blue.section--geico-blue > div > ul > li:nth-child(1) > a > span")
  WebElement careers;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[3]/ul/li[4]/div/ul/li[2]/a")
  WebElement corporateInformation;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[3]/ul/li[4]/div/ul/li[3]/a")
  WebElement inTheCommunity;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[3]/ul/li[4]/div/ul/li[4]/a/span")
  WebElement pressReleases;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[3]/ul/li[4]/div/ul/li[5]/a/span")
  WebElement b2bServices;
  @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[3]/ul/li[4]/div/ul/li[6]/a/span")
  WebElement organizationDiscount;

  public WebElement getUserIDEmailPolicyNumber() { return  userIDEmailPolicyNumber ;}
  public WebElement getHomePagePassWord(){return passWord;}
  public WebElement geHomePageForgotUserIDPassWord(){return forgotUserIDPassWord;}
  public WebElement getHomePageSignUpForAnAccount(){return signUpForAnAccount;}



  public boolean getUserIDEmailPolicyNumberDisplayed(){
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    return getUserIDEmailPolicyNumber().isDisplayed();
  }
  public boolean getHomePageUserIDDisplayed(){
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    return getHomePagePassWord().isDisplayed();
  }
  public boolean geHomePageForgotUserIDPassWordDisplayed(){
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    return geHomePageForgotUserIDPassWord().isDisplayed();
  }
  public boolean getHomePageSignUpForAnAccountDisplayed(){
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    return getHomePageSignUpForAnAccount().isDisplayed();
  }
  public String getGiecoTitle(){
    return driver.getTitle();
  }
  public void getInsurance(){
      this.insurance.click();
  }
  public void getvehicleInsurance(){ vehicleInsurance.click(); }
  public void getAuto(){ this.auto.click(); }
  public void getMotorCycle(){
    this.motorcycle.click();
  }

  public void getAtv(){ this.atv.click(); }
  public void getRv(){
    this.rv.click();
  }
  public void getBoatPwc(){ this.boatPwc.click(); }
  public void getCollectorAuto(){
    this.collectorAuto.click();
  }
  public void getRideShare(){
    this.rideShare.click();
  }

  public void getCommercialAuto(){
    this.commercialAuto.click();
  }
  public void getMexicoAuto(){
    this.mexicoAuto.click();
  }
  public void getPropertyInsurance(){
    this.propertyInsurance.click();
  }
  public void getHomeOwners(){
    this.homeOwners.click();
  }
  public void getRenters(){
    this.renters.click();
  }

  public void getCondoCoOp(){
    this.condoCoOp.click();
  }
  public void getMobileHome(){
    this.mobileHome.click();
  }
  public void getLandLord(){
    this.landLord.click();
  }
  public void getFlood(){
    this.flood.click();
  }
  public void getBusinessInsurance(){
    this.businessInsurance.click();
  }

  public void getBusinessOwners(){
    this.businessOwners.click();
  }
  public void getGeneralLiability(){
    this.generalLiability.click();
  }
  public void getProfessionalLiability(){
    this.professionalLiability.click();
  }
  public void getGetWorkersCompensation(){
    this.workersCompensation.click();
  }
  public void getMedicalMalPractice(){
    this.medicalMalPractice.click();
  }

  public void getWellnessAndFitness(){
    this.wellnessAndFitness.click();
  }
  public void getCommercialAuto2(){
    this.commercialAuto2.click();
  }
  public void getRideShare2(){
    this.rideShare2.click();
  }
  public void getAdditionalInsurance(){ this.additionalInsurance.click(); }
  public void getUmbrella(){
    this.umbrella.click();
  }

  public void getLife(){
    this.life.click();
  }
  public void getTravel(){
    this.travel.click();
  }
  public void getOverseas(){
    this.overseas.click();
  }
  public void getIdentityProtection(){
    this.identityProtection.click();
  }
  public void getPet(){
    this.pet.click();
  }

  public void getJewlery(){
    this.jewelery.click();
  }
  public void getInformation(){
    this.information.click();
  }
  public void getMyaccount(){
    this.myAccount.click();
  }
  public void getIDCards(){
    this.getIdcards.click();
  }
  public void getAddAVehicle(){ this.addAVehicle.click(); }

  public void getGoPaperless(){
    this.goPaperless.click();
  }
  public void getToolsAndResources(){
    this.toolsAndResourses.click();
  }
  public void getLifeEventPlanning(){
    this.lifeEventPlanning.click();
  }
  public void getPersonalPropertyCalculator(){
    this.personalPropertyCalculator.click();
  }
  public void getInsuranceTerms(){
    this.insuranceTerms.click();
  }

  public void getParkingLocator(){
    this.parkingLocator.click();
  }
  public void getparkingInspectionSites(){
    this.parkingInspectionSites.click();
  }
  public void getAboutGieco(){ this.aboutGieco.click(); }
  public void getCareers(){
    this.careers.click();
  }
  public void getCorporateInformation(){
    this.corporateInformation.click();
  }

  public void getInTheCommunity(){
    this.inTheCommunity.click();
  }
  public void getPressReleases(){
    this.pressReleases.click();
  }
  public void getB2bServices(){
    this.b2bServices.click();
  }
  public void getOrganizationDiscount(){
    this.organizationDiscount.click();
  }
}
