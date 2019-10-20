package home;

import amazonhome.LogIn;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestLogIn extends LogIn {
    @Test
    public void testLoginWithValidCredentials() {
        loginWithValidCredentials();
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
    }

    @Test
    public void testLoginWithInvalidCredentials() {
        loginWithInvalidCredentials();
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
    }
    @Test
    public void createAccount (){
        createAccount();
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
    }
}
