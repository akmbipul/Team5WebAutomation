package amazonhome;

import base.CommonApi;
import reporting.TestLogger;

public class SearchItems extends CommonApi {
    public void searchMenu(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        typeOnElement("#twotabsearchtextbox","books");
        driver.navigate().back();
        typeOnElement("#twotabsearchtextbox","dresses");
        driver.navigate().back();
        typeOnElement("#twotabsearchtextbox","shoes");
        driver.navigate().back();
        typeOnElement("#twotabsearchtextbox","cosmetics");
        driver.navigate().back();

    }
}
