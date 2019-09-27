package home;

import base.CommonApi;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SelectMacNotebook extends CommonApi {



    @Test

    public void Test14(){

        driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[5]/span")).click();
    }
}
