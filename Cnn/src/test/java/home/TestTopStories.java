package home;

import base.CommonApi;
import org.testng.annotations.Test;

public class TestTopStories extends CommonApi {
    @Test
    public void findTopStories(){
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[4]/button");
        typeOnElement("//*[@id=\"header-search-bar\"]", "top stories");
    }
}
