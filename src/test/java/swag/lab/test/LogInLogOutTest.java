package swag.lab.test;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import utility.BeforeAll;
import utility.POM.LogInPageObject;
import utility.POM.PLPPageObject;

public class LogInLogOutTest extends BeforeAll {


    @Test(priority = 1, description = "log in")
    public void validLogInLogOutTest() {

        driver.findElement(LogInPageObject.usernameField).click();
        driver.findElement(LogInPageObject.usernameField).sendKeys(LogInPageObject.userName);

        driver.findElement(LogInPageObject.passwordField).click();
        driver.findElement(LogInPageObject.passwordField).sendKeys(LogInPageObject.password);

        driver.findElement(LogInPageObject.logInButton).click();


        wait.until(ExpectedConditions.visibilityOfElementLocated(PLPPageObject.productText));



    }

    @Test(priority = 2)
    public void logInLogOutTest() {

//Log Out
        driver.findElement(PLPPageObject.burgerMenu).click();
        driver.findElement(PLPPageObject.logOutButton).click();

        //Is Log IN page APPEARS
        driver.findElement(LogInPageObject.logInButton).isDisplayed();

    }

}



