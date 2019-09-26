package cnnhome;

import base.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends CommonApi {

    public void navigateToUsSection() {
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[1]/a");
    }
    public void navigateToWorldSection() {
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[2]/a");
    }
    public void navigateToPoliticsSection() {
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[3]/a");
    }

    public void navigateToBusinessPage(){
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[4]/a");
    }

    public void navigateToOpinionPage(){
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[5]/a");
    }

    public void navigateToHealthPage(){
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[6]/a");
    }

    public void navigateToEntertainmentPage(){
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[7]/a");
    }

    public void navigateToStylePage(){
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[8]/a");
    }

    public void navigateToTravelPage(){
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[9]/a");
    }

    public void navigateToSportsPage(){
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[10]/a");
    }

    public void navigateTovideosPage(){
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[2]/nav/ul/li[11]/a");
    }
}



