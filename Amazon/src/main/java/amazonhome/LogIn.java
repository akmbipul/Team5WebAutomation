package amazonhome;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import base.CommonApi;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class LogIn extends CommonApi {
    @FindBy(xpath =  "//div[@id='nav-signin-tooltip']")
    WebElement signIn;
    @FindBy(css = "#createAccountSubmit")
    WebElement  startSignIn;
    @FindBy(css = "#ap_customer_name")
    WebElement name;
    @FindBy (id = "ap_email")
    WebElement email;
    @FindBy(css = "#ap_password")
    WebElement password;
    @FindBy(name = "passwordCheck")
    WebElement verifyPassword;
    @FindBy(css = ".a-button-input")
    WebElement createAccount;


    public void loginWithValidCredentials() {
        driver.findElement(By.cssSelector("#nav-signin-tooltip > a > span")).click();
        driver.findElement(By.cssSelector("#ap_email")).sendKeys("imanitm17@gmail.com");
        driver.findElement(By.className("a-button-input")).click();
        driver.findElement(By.cssSelector("#ap_password")).sendKeys("tmim27@@");
        driver.findElement(By.id("signInSubmit")).click();
    }

    public void loginWithInvalidCredentials() {
        driver.findElement(By.cssSelector("#nav-signin-tooltip > a > span")).click();
        driver.findElement(By.cssSelector("#ap_email")).sendKeys("@gmail.com");
        //driver.findElement(By.cssSelector("#ap_password")).sendKeys("@");
        //driver.findElement(By.id("signInSubmit")).click();
        driver.findElement(By.className("a-button-input")).click();
        driver.findElement(By.className("a-list-item"));
    }
    public void createAccount (){
        signIn.click();
        startSignIn.click();
        name.sendKeys("Tashfia");
        email.sendKeys("tashfiaimani@gmail.com");
        password.sendKeys("rmfm22@@");
        verifyPassword.sendKeys("1243");
        createAccount.click();
    }
}
