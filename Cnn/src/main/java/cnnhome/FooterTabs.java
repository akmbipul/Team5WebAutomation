package cnnhome;

import base.CommonApi;

public class FooterTabs extends CommonApi {
    public void getTermsosUse(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[5]/div/div[2]/nav/ul/li[1]/a");
    }

    public void getPrivacypolicy(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[5]/div/div[2]/nav/ul/li[2]/a");
    }

    public void getAboutUs(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[5]/div/div[2]/nav/ul/li[5]/a");
    }

    public void goToCNNStore(){
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[4]/button/svg");
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[2]/div/div/nav/ul/li[13]/ul/li[6]/a");
    }

    public void getAccessibilityandcc(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[5]/div/div[2]/nav/ul/li[3]/a");
    }

    public void getAdChoices(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[5]/div/div[2]/nav/ul/li[4]/a");
    }

    public void getCNNStudioTours(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[5]/div/div[2]/nav/ul/li[6]/a");
    }

    public void goToNewsletter(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[5]/div/div[2]/nav/ul/li[8]/a");
        clickOnElement("//*[@id=\"textbreakingnews\"]");
        typeOnElement("//*[@id=\"subEmail\"]", "timani@gmail.com");
    }

    public void getTranscript(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[5]/div/div[2]/nav/ul/li[9]/a");
    }

    public void licenseFootage(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[5]/div/div[2]/nav/ul/li[10]/a");
    }

    public void getCNNNewsource(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[5]/div/div[2]/nav/ul/li[11]/a");
    }
    public void getSitemap(){
        clickOnElement("//*[@id=\"footer-wrap\"]/footer/div[5]/div/div[2]/nav/ul/li[12]/a");
    }

    public void get2019Elections() {
        clickOnElement("//*[@id=\"nav\"]/header/div/div[2]/div/div[4]/nav/ul/li[3]/ul/li[6]/a");
        clickOnElement("//*[@id=\"mount\"]/div/main/section[2]/section/div[1]/div[2]/div[1]/div[1]/main/div/a/div");
    }
}

