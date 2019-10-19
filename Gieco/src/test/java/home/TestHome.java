package home;

import base.CommonAPI;
import datasource.DataSource;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.SearchPage;
import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

import java.sql.Driver;

public class TestHome extends CommonAPI {

    HomePage homePage;
    SearchPage searchPage;
    DataSource data = new DataSource();

    @BeforeMethod
    public void initElements() {
    homePage = PageFactory.initElements(driver, HomePage.class);
    searchPage = PageFactory.initElements(driver, SearchPage.class);
    }

    @Test
    public void testInsurance() {homePage.getInsurance();}
    @Test
    public void testGiecoTitle() { homePage.getGiecoTitle();}
    @Test
    public void testVehileInsurance() {homePage.getvehicleInsurance();}
    @Test
    public void testSearchBoxFromDataSource() {searchPage.getSearchBox(); }
    @Test
    public void testAuto() {homePage.getAuto(); }
    @Test
    public void testMotorCycle() { homePage.getMotorCycle();}
    @Test
    public void testAtv() { homePage.getAtv();}
    @Test
    public void testRv() {homePage.getRv();}
    @Test
    public void testBoatPwc() { homePage.getBoatPwc();}
    @Test
    public void testCollectorAuto() { homePage.getCollectorAuto();}
    @Test
    public void testRideShare() { homePage.getRideShare();}
    @Test
    public void testCommercialAuto() {homePage.getCommercialAuto();}
    @Test
    public void testMexicoAuto() { homePage.getMexicoAuto();}
    @Test
    public void testPropertyInsurance() {homePage.getPropertyInsurance();}
    @Test
    public void testHomeOwners() {homePage.getHomeOwners(); }
    @Test
    public void testRenters() { homePage.getRenters();}
    @Test
    public void testCondoCoOp() { homePage.getCondoCoOp(); }
    @Test
    public void testMobileHome() {homePage.getMobileHome();}
    @Test
    public void testLandLord() {homePage.getLandLord();}
    @Test
    public void testFlood() { homePage.getFlood();}
    @Test
    public void testBusinessInsurance() { homePage.getBusinessInsurance();}
    @Test
    public void testBusinessOwners() { homePage.getBusinessOwners();}
    @Test
    public void testGeneralLiability() {homePage.getGeneralLiability();}
    @Test
    public void testProfessionalLiability() { homePage.getProfessionalLiability();}
    @Test
    public void testGetWorkersCompensation() { homePage.getGetWorkersCompensation();}
    @Test
    public void testMedicalMalPractice() { homePage.getMedicalMalPractice();}
    @Test
    public void testWellnessAndFitness() {homePage.getWellnessAndFitness();}
    @Test
    public void testCommercialAuto2() { homePage.getCommercialAuto2();}
    @Test
    public void testRideShare2() {homePage.getRideShare2();}
    @Test
    public void testAdditionalInsurance() { homePage.getAdditionalInsurance();}
    @Test
    public void testUmbrella() {homePage.getUmbrella();}
    @Test
    public void testLife() {homePage.getLife();}
    @Test
    public void testTravel() {homePage.getTravel(); }
    @Test
    public void testOverseas() {homePage.getOverseas(); }
    @Test
    public void testIdentityProtection() { homePage.getIdentityProtection(); }
    @Test
    public void testPet() {homePage.getPet(); }
    @Test
    public void testJewlery() { homePage.getJewlery();}
    @Test
    public void testInformation() { homePage.getInformation();}
    @Test
    public void testMyaccount() { homePage.getMyaccount();}
    @Test
    public void testIDCards() {homePage.getIDCards();}
    @Test
    public void testAddAVehicle() { homePage.getAddAVehicle(); }
    @Test
    public void testGoPaperless() { homePage.getGoPaperless();}
    @Test
    public void testToolsAndResources() { homePage.getToolsAndResources();}
    @Test
    public void testLifeEventPlanning() {homePage.getLifeEventPlanning();}
    @Test
    public void testPersonalPropertyCalculator() { homePage.getPersonalPropertyCalculator();}
    @Test
    public void testInsuranceTerms() {homePage.getInsuranceTerms();}
    @Test
    public void testParkingLocator() { homePage.getParkingLocator();}
    @Test
    public void testparkingInspectionSites() { homePage.getparkingInspectionSites();}
    @Test
    public void testAboutGieco() { homePage.getAboutGieco(); }
    @Test
    public void testCareers() {homePage.getCareers(); }
    @Test
    public void testCorporateInformation() { homePage.getCorporateInformation();}
    @Test
    public void testInTheCommunity() { homePage.getInTheCommunity();}
    @Test
    public void testPressReleases() { homePage.getPressReleases();}
    @Test
    public void testB2bServices() {homePage.getB2bServices();}
    @Test
    public void testOrganizationDiscount() { homePage.getOrganizationDiscount();}


}




















