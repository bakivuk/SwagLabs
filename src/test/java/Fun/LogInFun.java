package Fun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.POM.LogInPageObject;
import utility.POM.PLPPageObject;

public class LogInFun {

    public static void logInValidAccount(WebDriver driver, WebDriverWait wait){

        //Log In
        driver.findElement(LogInPageObject.usernameField).click();
        driver.findElement(LogInPageObject.usernameField).sendKeys(LogInPageObject.userName);
        driver.findElement(LogInPageObject.passwordField).click();
        driver.findElement(LogInPageObject.passwordField).sendKeys(LogInPageObject.password);
        driver.findElement(LogInPageObject.logInButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(PLPPageObject.productText));


    }



}
