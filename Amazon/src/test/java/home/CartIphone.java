package home;

import base.CommonApi;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CartIphone extends CommonApi {


    @Test
    //adds " iPhone 11 Pro (64GB) - Space Gray" to cart
    public void Test4() {
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"))
    }
}
