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
    public void TestTrydayFree()
    {
        homePage.getDayFree();
}
    @Test
    public void TestWhatIsNetflix(){
        homePage.getWhatIsNetflix();
    }
    @Test
    public void TestHowmuchNetflixCosts(){
        homePage.getHowMuchNetflixCosts();
    }
    @Test
    public void TestWhereCanIwatch(){
        homePage.getWhereCanIwatch();
    }
    @Test
    public void TestHowDoIcancel(){
        homePage.gethowDoIcancel();
    }
    @Test
    public void TestHowCanIwatchOnNetflix(){
        homePage.getHowCanIwatchOnNetflix();
    }
    @Test
    public void TestHowFreetrialWorks(){
        homePage.getHowFreetrialWorks();
    }
    @Test
    public void TestFaq(){
       homePage.getFaq();
    }
    @Test
    public void TestMediaCenter(){
        homePage.getMediaCenter();
    }
    @Test
    public void TestRedeemGiftcards(){
        homePage.RedeemGiftCards();
    }


}
