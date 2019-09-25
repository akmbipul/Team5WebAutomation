package home;

import base.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.testng.annotations.Test;

public class SelectIphone extends CommonApi {


    @Test
    //navigates to iPhone " iPhone 11 Pro (64GB) - Space Gray"
    public void test2() {

        driver.navigate(By.ByClassName = "a-size-medium a-color-base a-text-normal\">Simple Mobile - Apple iPhone 11 Pro (64GB) - Space Gray</span>");

    }
}
