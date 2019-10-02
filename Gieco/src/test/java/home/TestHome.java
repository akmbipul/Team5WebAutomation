package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.HomePage;

import java.sql.Driver;

public class TestHome extends CommonAPI {

HomePage homePage;


    @BeforeMethod
    public void initElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

   @Test
    public void testMakeApayment(){
        homePage.getmakeApayment();
   }


    @Test
    public void testInsurance(){
        homePage.getInsurancetest();
    }

    @Test

        public void testVehileInsurance(){

           homePage.getvehicleTest();
        }





    }
















