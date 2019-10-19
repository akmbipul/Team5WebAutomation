package pageobjects;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InformedOnReformedPage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"1385098823854\"]/div/div[5]/header/div/nav/div/ul/li[3]/a")
    WebElement informedOnReformed;
    @FindBy(xpath = "//*[@id=\"1386145332090\"]/div/div/div[1]/div/div[2]/ul/li/a/span[1]")
    WebElement seeReformTopicsOverview;
    @FindBy(xpath = "//*[@id=\"1391571331073\"]/div/div/div[1]/div[1]/div/div[3]/a/span[1]")
    WebElement getStarted;
    @FindBy(xpath = "//*[@id=\"1391571331073\"]/div/div/div[1]/div[2]/div/div[3]/a/span[1]")
    WebElement getTheAnswers;
    @FindBy(xpath = "//*[@id=\"1391571331073\"]/div/div/div[1]/div[3]/div/div[3]/a/span[1]")
    WebElement pickTopicQuickReplay;

    public void setInformedOnReformed(){ informedOnReformed.click(); }
    public void setSeeReformTopicsOverview(){
        seeReformTopicsOverview.click();
    }
    public void setGetStarted(){
        this.getStarted.click();
    }
    public void setGetTheAnswers(){
        this.getTheAnswers.click();
    }
    public void setPickTopicQuickReplay(){
        pickTopicQuickReplay.click();
    }

    }
