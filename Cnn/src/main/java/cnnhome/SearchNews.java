package cnnhome;

import base.CommonApi;
import org.openqa.selenium.By;

public class SearchNews extends CommonApi {
    public void searchNews(){
        clickOnElement("#nav > header > div > div.Grid-sc-1kcyc0j-0.headerstyles__NavGrid-sc-1vh4dor-3.EHnfs > div > div.Flex-sc-1sqrs56-0.headerstyles__HideOnMobile-sc-1vh4dor-9.gWkClp > button > svg");
        typeOnElement("#header-search-bar", "news");
    }
}
