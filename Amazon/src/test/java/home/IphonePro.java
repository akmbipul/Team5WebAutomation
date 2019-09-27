package home;

import base.CommonApi;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class IphonePro extends CommonApi {


    @Test
    //Click on "IPhone 11 Pro Max"
    public void Test3() {
      driver.findElement(By.name("IPhone 11 Pro Max")).click();


    }
}