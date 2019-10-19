package home;

import facebookhome.Timeline;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

public class TestTimeLn extends Timeline {
    @Test
    public void postAFacebookStatus(){
            typeOnElement("//*[@id=\"email\"]", "megmar09@yahoo.com");
            typeOnElement("//*[@id=\"pass\"]", "rmfm22@@");
            clickOnElement("//*[@id=\"loginbutton\"]");

            typeOnElement("//*[@id=\"js_db\"]", "Happy Facebooking");
            clickOnElement("//*[@id=\"js_2kj\"]");
            clickOnElement("//*[@id=\"js_vc\"]/div[2]/div[3]/div[2]/button");
        }

    }

