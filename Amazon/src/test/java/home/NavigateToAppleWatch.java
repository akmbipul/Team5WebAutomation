package home;

import base.CommonApi;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NavigateToAppleWatch extends CommonApi {



    @Test
    public void Test10(){

        driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[4]/span")).click();
    }
}