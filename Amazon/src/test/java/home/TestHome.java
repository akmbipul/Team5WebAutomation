package home;

import org.testng.annotations.Test;

public class TestHome extends CommonApi {

    @Test
    //naviagte to Amazon home page and writes iphone in search bar
    public void test1(){
        typeOnElement("#twotabsearchtextbox", "iPhone");
        clickOnElement(".nav-input");
    }

}
