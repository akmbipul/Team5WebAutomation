package home;

import cnnhome.HomePage;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {
    @Test(enabled = false)
    public void headerContent(){
        isElementDisplayed("//div[@class='Cell-i0zvfi-0 headerstyles__NavBarContent-sc-1vh4dor-4 gcRmuT']");
    }
    @Test(enabled = false)
    public void validateSearch(){
        clickOnSearchButton();
        typeOnSearchBar("technology");
        clickOnSearch();
        isSearchPageDisplayed();
        sleepFor(3);
    }
    @Test(enabled = false)
    public void testOnTrending(){
        validateTrending();
    }
    @Test
    public void testOnMenuIcon(){
        menuIcon();
    }
    @Test(enabled = false)
    public void testOnLiveTV(){
        validateLiveTv();
    }
    @Test
    public void viewChannels() {
    }
    @Test
    public void viewShows() {
    }
    @Test
    public void viewSettings() {
    }
    @Test
    public void checkLiveUpdates() {
    }
    @Test
    public void testFactsSection(){
    }
    @Test
    public void testParentingSection(){
    }
    @Test
    public void get2019Elections() {
    }
}
