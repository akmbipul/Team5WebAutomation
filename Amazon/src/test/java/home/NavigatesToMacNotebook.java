package home;

import base.CommonApi;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NavigatesToMacNotebook extends CommonApi {


    @Test
   //add
    public void Test15(){

          //Selects the Macbook Air 13 inch
        driver.findElement(By.className("style__overlay__2qYgu style__overlay__2pc5x")).click();
    }
}