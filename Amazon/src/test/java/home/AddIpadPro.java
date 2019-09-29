package home;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddIpadPro extends CommonApi {


    @Test

        //adds Ipad Pro to Cart.
        public void Test8(){

        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();


        }
    }