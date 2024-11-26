package swag.lab.test;

import Fun.CartFun;
import Fun.CheckOutFun;
import Fun.LogInFun;
import Fun.PLPFun;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import utility.BeforeAll;
import utility.POM.LogInPageObject;
import utility.POM.PLPPageObject;

public class ChecOutTest extends BeforeAll {


    @Test(priority = 1, description = "log in")
    public void checkout() {


        LogInFun.logInValidAccount(driver, wait);

        //The Cart
        PLPFun.addToCart(driver);

        //Go to Cart
        CartFun.goToCart(driver);

        //Checkout
        CheckOutFun.checkoutProduct(driver);











    }
}
