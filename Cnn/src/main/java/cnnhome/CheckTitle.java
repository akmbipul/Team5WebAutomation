package cnnhome;

import base.CommonApi;
import org.testng.Assert;

public class CheckTitle extends CommonApi {
    public void checkTitle() {

        String cnntitle = driver.getTitle();
        String actualTitle = "CNN - Breaking News, Latest News and Videos";
        Assert.assertEquals(actualTitle, cnntitle);
    }
}

