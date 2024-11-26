package swag.lab.test;

import org.openqa.selenium.By;

public class CheckOutPageObject {

    public static By firstNameField = By.id("first-name");

    public static By lastNameField = By.id("last-name");

    public static By postalCode = By.id("postal-code");

    public static String firstName = "Barbara";

    public static String lastName = "Vukic";

    public static String postalCodeText = "1234";

    public static By continueButton = By.id("continue");

    public static By finishButton = By.id("finish");

    public static By messageEnd = By.xpath("//h2[contains(text(),'Thank you for your order!')]");






}
