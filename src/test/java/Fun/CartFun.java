package Fun;

import org.openqa.selenium.WebDriver;
import utility.POM.PLPPageObject;

public class CartFun {


    public static void goToCart (WebDriver driver){

        driver.findElement(PLPPageObject.theCart).click();


    }
}
