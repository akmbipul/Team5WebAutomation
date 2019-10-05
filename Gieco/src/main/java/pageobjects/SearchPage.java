package pageobjects;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import javax.activation.DataSource;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class SearchPage extends CommonAPI {

@FindBy(how = How.XPATH, using = "//*[@id=\"header-right-links\"]/ul[1]/li[3]/a/span")
public WebElement searchIcon;
@FindBy(how = How.XPATH, using = "//*[@id=\"search\"]/div[2]/div/div[2]/div[1]/div/div[1]/div[1]/input")
public WebElement searchBox;
@FindBy(how = How.XPATH,using = "//*[@id=\"search\"]/div[2]/div/div[2]/div[1]/div/div[2]/a[2]")
public  WebElement searchButton;


    public WebElement getSearchIcon() { return searchIcon; }
    public WebElement getSearchBox() { return searchBox; }
    public WebElement getSearchButton(){return searchButton;}

    public void clickOnSearchIcon(){ getSearchIcon().click(); }
    public void searchFor(String value){getSearchBox().sendKeys(value);}
    public void clickOnSearchButton(){getSearchButton().click();}
    public void clearInput(){getSearchBox().clear();}


    public void searchBox(){
        clickOnSearchIcon();
        searchFor("Vehicle Insurance");
        clickOnSearchButton();
        navigateBack();
        clearInput();
        searchFor("Business Insurance");
        clickOnSearchButton();
    }


//    public void searchItemsAndSubmitButton() throws Exception, IOException, SQLException, ClassNotFoundException {
//        clickOnSearchButton();
//        List<String> list = DataSource.getItemsListFromDB();
//        for (int i = 0; i < list.size(); i++) {
//           searchFor(list.get(i));
//            clickOnSearchButton();
//            navigateBack();
//            clearInput();
//        }
//
//    }
        public void searchItems () throws Exception, IOException, SQLException, ClassNotFoundException {
            clickOnSearchButton();
            List<String> itemList = datasource.DataSource.getItemValue();
            for (String st : itemList) {
                searchFor(st);
                clickOnSearchButton();
                navigateBack();
                clearInput();
                //validate items
            }

        }

    }