package cnnhome;

import base.CommonApi;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckTitle extends CommonApi {
    public void checkTitle() {
        String cnnTitle = driver.getTitle();
        String actualTitle = "CNN - Breaking News, Latest News and Videos";
        Assert.assertEquals(actualTitle, cnnTitle);
    }
}
