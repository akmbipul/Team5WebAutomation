package home;

import base.CommonApi;
import org.testng.annotations.Test;

public class TestHome extends CommonApi {

    @Test
    public void test1(){
        typeOnElement("#twotabsearchtextbox", "iPhone");
        clickOnElement(".nav-input");
    }

}
