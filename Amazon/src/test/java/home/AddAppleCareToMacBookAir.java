package home;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddAppleCareToMacBookAir extends CommonApi {



    @Test


    public void Test16(){
        //Adds Apple Care to MacBook AIr

        driver.findElement(By.xpath("//*[@id=\"abb-intl-product-view-B07KTYFYVX\"]/div[2]/div/div/div/div/label/input")).click();
        driver.findElement(By.xpath("//*[@id=\"a-autoid-23\"]/span/input")).click();
    }
}