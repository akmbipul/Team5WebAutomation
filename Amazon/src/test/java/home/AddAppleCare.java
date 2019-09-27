package home;

import base.CommonApi;
import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class AddAppleCare extends CommonApi {


    @Test
    //adds Applecare IPhone 11 Pro
    public void Test5() {
        driver.findElement(By.xpath("//*[@id=\"abb-intl-product-view-B07KTY3PCD\"]/div[2]/div/div/div/div/label/input")).click();
        driver.findElement(By.xpath("//*[@id=\"a-autoid-19\"]/span/input")).click();
    }
}