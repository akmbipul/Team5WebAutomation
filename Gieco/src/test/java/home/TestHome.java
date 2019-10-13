package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.SearchPage;

import java.sql.Driver;

public class TestHome extends CommonAPI {

       HomePage homePage;
       SearchPage searchPage;

       @BeforeMethod
       public void initElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

       @Test
       public void testInsurance(){
        homePage.getInsurance();
    }

      // @Test

        public void testVehileInsurance(){
        homePage.getvehicleInsurance();
        }

       // @Test
        public void testGiecoTitle(){
        homePage.getGiecoTitle();
        }

       // @Test

        public void testSearchBoxFromDataSource() throws Exception {
        searchPage.searchItems();

    }

 }
















