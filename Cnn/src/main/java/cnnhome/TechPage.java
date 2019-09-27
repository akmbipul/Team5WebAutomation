package cnnhome;

import base.CommonApi;

public class TechPage extends CommonApi {
    public void checkTechPage(){
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[4]/button/svg");
        clickOnElement("//*[@id=\"nav\"]/header/div/div[2]/div/div[3]/nav/ul/li[8]/a");
    }
}
