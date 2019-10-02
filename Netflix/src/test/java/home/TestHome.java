package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject.HomePage;

import java.security.PublicKey;

public class TestHome extends CommonAPI {

HomePage homePage;

    @BeforeMethod
    public void initElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }


@Test
public void TestTrydayFree(){
        homePage.getDayFree();
}



}
