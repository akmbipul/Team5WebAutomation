package home;

import amazonhome.DropDown;
import base.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TestDropDown extends DropDown {

    @Test
    public void testAllDropDownMenu() {
        List<WebElement> elementList = getAllElementFromList();
        System.out.println(elementList.size());
        for (int i = 0; i < elementList.size(); i++) {
            System.out.println(elementList.get(i).getText());
        }
    }
    @Test
    public void getAmazonFreshFromDropDownLists(){
        driver.navigate().to("https://www.amazon.com/");
    }
}