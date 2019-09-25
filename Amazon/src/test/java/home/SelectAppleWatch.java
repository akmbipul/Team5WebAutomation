package home;

import base.CommonApi;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SelectAppleWatch extends CommonApi {


    @Test

    public void Test11(){

        driver.findElement(By.className("style__overlay__2qYgu style__overlay__2pc5x")).click();
    }
}
