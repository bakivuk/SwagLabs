package Fun;

import org.openqa.selenium.WebDriver;
import utility.POM.PLPPageObject;

public class PLPFun {

    public static void addToCart(WebDriver driver){
        driver.findElement(PLPPageObject.addToCart).click();




    }


}
