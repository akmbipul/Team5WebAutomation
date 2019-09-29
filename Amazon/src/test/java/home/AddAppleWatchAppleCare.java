package home;

import org.testng.annotations.Test;


public class AddAppleWatchAppleCare extends CommonApi {



    @Test

    public void Test13(){
        //adds Apple Care to the Apple Watch

        clickOnElement("//*[@id=\"abb-intl-product-view-B07KTPLYF9\"]/div[2]/div/div/div/div/label/input");
        clickOnElement("//*[@id=\"a-autoid-20\"]/span/input");
    }
}