package utility.POM;

import org.openqa.selenium.By;

public class PLPPageObject {

    public static By productText = By.xpath("//span[contains(text(),'Products')]");

    public static By addToCart = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");

    public static By theCart = By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]");

    public static By burgerMenu = By.id("react-burger-menu-btn");

    public static By logOutButton = By.id("logout_sidebar_link");


}