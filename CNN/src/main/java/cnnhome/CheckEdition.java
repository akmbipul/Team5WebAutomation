package cnnhome;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CheckEdition extends CommonApi {

    public void checkEditionButton() {
        WebElement element = getElement("//div[@id='edition-picker-toggle-desktop']");
        Assert.assertEquals(element.isDisplayed(), true, "edition button is not displayed");
        element.click();
        WebElement valueOfEditionMethod = getElement("//div[@class='Box-sc-1fet97o-0 edition-pickerstyles__Dropdown-t9lxqp-2 gTgbio']");
        Assert.assertEquals(valueOfEditionMethod.isDisplayed(), true, "value doesn't displayed");
    }
    public void checkUSEdition(){
        clickOnElement("#edition-picker-toggle-desktop");
        WebElement element=getElement("//*[@id=\"edition-picker-desktop\"]/div[2]/ul/li[1]/a");
        Assert.assertEquals(element.isDisplayed(), true, "US edition button is not displayed");
        element.click();
    }

    public void checkInternationalEd(){
        clickOnElement("#edition-picker-toggle-desktop");
        WebElement element=getElement("//*[@id=\"edition-picker-desktop\"]/div[2]/ul/li[2]/a");
        Assert.assertEquals(element.isDisplayed(), true, "International edition button is not displayed");
        element.click();
    }

    public void checkArabicEdition(){
        clickOnElement("#edition-picker-toggle-desktop");
        WebElement element=getElement("//*[@id=\"edition-picker-desktop\"]/div[2]/ul/li[3]/a");
        Assert.assertEquals(element.isDisplayed(), true, "Arabic edition button is not displayed");
        element.click();
    }
    public void checkEspanolEdition(){
        clickOnElement("#edition-picker-toggle-desktop");
        WebElement element=getElement("//*[@id=\"edition-picker-desktop\"]/div[2]/ul/li[4]/a");
        Assert.assertEquals(element.isDisplayed(), true, "Espanol edition button is not displayed");
        element.click();
    }
}
