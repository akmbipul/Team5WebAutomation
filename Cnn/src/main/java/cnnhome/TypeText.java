package cnnhome;

import base.CommonApi;
import org.openqa.selenium.By;
import org.testng.Assert;

public class TypeText extends CommonApi {

    public void typeIphonePro(){
        typeOnInputBox("/html/body/div[7]/div[2]/div/div[1]/div/div[1]/input", "iphone pro");
        driver.findElement(By.linkText("Apple will keep production of the new Mac Pro in the United States"));
        String iphonepro=driver.getTitle();
        String actualTitle = "Apple will keep production of the new Mac Pro in the United States";
        Assert.assertEquals(actualTitle, iphonepro);
    }
    public void typeMichellePhan(){
        typeOnInputBox("/html/body/div[7]/div[2]/div/div[1]/div/div[1]/input", "michelle phan");
        driver.findElement(By.linkText("YouTube makeup star Michelle Phan finally posted a new video. Fans hope she's back for good"));
        String michellePhan=driver.getTitle();
        String actualTitle="YouTube makeup star Michelle Phan finally posted a new video. Fans hope she's back for good";
        Assert.assertEquals(actualTitle,michellePhan);
    }
    public void typeGadget() {
        typeOnInputBox("//*[@id=\"nav\"]/header/div/div[1]/div/div[4]/button/svg", "gadget");
        driver.findElement(By.xpath("//*[@id=\"collection_article\"]"));
        driver.findElement(By.linkText("First, Alexa came into your home. Now it wants to get on your body"));
        String gadgets=driver.getTitle();
        String actualTitle="First, Alexa came into your home. Now it wants to get on your body";
        Assert.assertEquals(actualTitle, gadgets);
    }
    public void typeTechnology(){
        typeOnInputBox("/html/body/div[7]/div[2]/div/div[1]/div/div[1]/input", "technology");
        clickOnElement("/html/body/div[7]/div[2]/div/div[1]/div/div[1]/button[2]");
        driver.findElement(By.linkText("Mysterious radio burst reveals tranquil halo of a galaxy"));
        String tech=driver.getTitle();
        String actualTitle="Mysterious radio burst reveals tranquil halo of a galaxy";
        Assert.assertEquals(actualTitle,tech);
    }
    public void typeBusiness(){
        typeOnInputBox("/html/body/div[7]/div[2]/div/div[1]/div/div[1]/input", "business");
        clickOnElement("/html/body/div[7]/div[2]/div/div[1]/div/div[1]/button[2]");
        driver.findElement(By.linkText("Tesla violated labor laws with Elon Musk tweet, judge rules"));
        String business=driver.getTitle();
        String actualTitle="Tesla violated labor laws with Elon Musk tweet, judge rules";
        Assert.assertEquals(actualTitle, business);
    }
    public void typeNancyPelosi(){
        typeOnInputBox("/html/body/div[7]/div[2]/div/div[1]/div/div[1]/input", "nancy pelosi");
        clickOnElement("/html/body/div[7]/div[2]/div/div[1]/div/div[1]/button[2]");
        driver.findElement(By.linkText("Pelosi: This is a cover-up of a cover-up"));
        String nancy=driver.getTitle();
        String actualTitle="Pelosi: This is a cover-up of a cover-up";
        Assert.assertEquals(actualTitle,nancy);
    }
    public void typeMta(){
        typeOnInputBox("\"/html/body/div[7]/div[2]/div/div[1]/div/div[1]/input", "mta");
        clickOnElement("//*[@id=\"left_us\"]");
        driver.findElement(By.linkText("Metropolitan Transportation Authority Fast Facts]"));
        String mta=driver.getTitle();
        String actualTitle="Metropolitan Transportation Authority Fast Facts";
        Assert.assertEquals(actualTitle,mta);
    }
    public void typeNYPD(){
        typeOnInputBox("/html/body/div[7]/div[2]/div/div[1]/div/div[1]/input", "nypd");
        driver.findElement(By.linkText("Three decades later, Jimmy Smits is back in the TV courtroom"));
    }

    public void typeNYSubway(){
        typeOnInputBox("/html/body/div[7]/div[2]/div/div[1]/div/div[1]/input", "new york subway");
        driver.findElement(By.linkText("In 2009, police tracked an 'imminent threat' before 9/11"));
    }
}

