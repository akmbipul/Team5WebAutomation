package home;

import base.CommonApi;
import org.testng.annotations.Test;

@Test
public class Test2019Election extends CommonApi {
    public void get2019Elections() {
        clickOnElement("//*[@id=\"nav\"]/header/div/div[2]/div/div[4]/nav/ul/li[3]/ul/li[6]/a");

    }
}


