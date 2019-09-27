package home;

import base.CommonApi;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddIpadProAppleCare extends CommonApi {


    @Test
    //adds apple care to Ipad
    public void Test9() {

        driver.findElement(By.xpath("//*[@id=\"abb-intl-product-view-B07KTXPGXD\"]/div[2]/div/div/div/div/label/input")).click();
        driver.findElement(By.className("a-button-input")).click();
    }


}