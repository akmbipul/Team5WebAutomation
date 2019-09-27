package home;

import base.CommonApi;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NavigateToIpad extends CommonApi {


    @Test
    //selects Ipad in checkout screen
    public void Test6(){

        driver.findElement(By.xpath("//*[@id="nav-subnav"]/a[3]/span")).click();
    }
}