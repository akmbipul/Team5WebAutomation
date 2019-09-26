package cnnhome;

import base.CommonApi;

public class SearchCoupon extends CommonApi {
    public void testSearchCoupons() {
        clickOnElement("//*[@id=\"nav\"]/header/div/div[1]/div/div[4]/button/svg");
        typeOnElement("//*[@id=\"header-search-bar\"]", "coupons");
    }
}