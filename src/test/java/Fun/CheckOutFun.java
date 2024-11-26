package Fun;

import org.openqa.selenium.WebDriver;
import swag.lab.test.CheckOutPageObject;
import swag.lab.test.TheShoppingBag;

public class CheckOutFun {

    public static void checkoutProduct (WebDriver driver){
        driver.findElement(TheShoppingBag.checkout).click();
        driver.findElement(CheckOutPageObject.firstNameField).click();
        driver.findElement(CheckOutPageObject.firstNameField).sendKeys(CheckOutPageObject.firstName);
        driver.findElement(CheckOutPageObject.lastNameField).click();
        driver.findElement(CheckOutPageObject.lastNameField).sendKeys(CheckOutPageObject.lastName);
        driver.findElement(CheckOutPageObject.postalCode).click();
        driver.findElement(CheckOutPageObject.postalCode).sendKeys(CheckOutPageObject.postalCodeText);
        driver.findElement(CheckOutPageObject.continueButton).click();
        driver.findElement(CheckOutPageObject.finishButton).click();
        driver.findElement(CheckOutPageObject.messageEnd).isDisplayed();




    }
}
