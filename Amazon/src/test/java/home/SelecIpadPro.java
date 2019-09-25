package home;

import base.CommonApi;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SelecIpadPro extends CommonApi {


    @Test
         public void Test7(){
        driver.findElement(By.ByClassName("style__overlay__2qYgu style__overlay__2pc5x")).click();
    }
}
