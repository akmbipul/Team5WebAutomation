package home;

import base.CommonApi;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddAppleWatch extends CommonApi {



    @Test


        public void Test12(){
           //adds the Apple Watch to the cart
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();


    }

}