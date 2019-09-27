package home;

import base.CommonApi;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddsMackBookAir extends CommonApi {

    @Test

    public void Test16(){

        //adds macbook air to cart
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
    }
}