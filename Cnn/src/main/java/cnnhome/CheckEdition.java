package cnnhome;

import base.CommonApi;

public class CheckEdition extends CommonApi {
    public void testCheckEdition(){
        clickOnElement("#edition-picker-toggle-desktop");
    }
    public void checkUSEdition(){
        clickOnElement("#edition-picker-toggle-desktop");
        clickOnElement("//*[@id=\"edition-picker-desktop\"]/div[2]/ul/li[1]/a");
    }

    public void checkInternationalEd(){
        clickOnElement("#edition-picker-toggle-desktop");
        clickOnElement("//*[@id=\"edition-picker-desktop\"]/div[2]/ul/li[2]/a");
    }

    public void checkArabicEdition(){
        clickOnElement("#edition-picker-toggle-desktop");
        clickOnElement("//*[@id=\"edition-picker-desktop\"]/div[2]/ul/li[3]/a");
    }

    public void checkEspanolEdition(){
        clickOnElement("#edition-picker-toggle-desktop");
        clickOnElement("//*[@id=\"edition-picker-desktop\"]/div[2]/ul/li[4]/a");
    }

}


