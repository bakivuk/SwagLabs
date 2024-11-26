import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;

public class CreateNewAccount {

    public WebDriver driver;
    public WebDriverWait wait;

    String baseURL;

    @BeforeTest
    public void setUp() {

        baseURL = "https://parabank.parasoft.com/parabank/index.htm;jsessionid=E756F03A0C7A3D41B031689BBA7445C2";

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, (Duration.ofSeconds(10)));
    }

    @Test
    public void CreateNewAccount(){

        driver.get(baseURL);
        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
        driver.findElement(By.id("customer.firstName")).click();
        driver.findElement(By.id("customer.firstName")).sendKeys("Barbara");
        driver.findElement(By.id("customer.lastName")).click();
        driver.findElement(By.id("customer.lastName")).sendKeys("Vukic");
        driver.findElement(By.id("customer.address.street")).click();
        driver.findElement(By.id("customer.address.street")).sendKeys("Milosa Crnjankog 14");
        driver.findElement(By.id("customer.address.city")).click();
        driver.findElement(By.id("customer.address.city")).sendKeys("Stara Pazova");
        driver.findElement(By.id("customer.address.state")).click();
        driver.findElement(By.id("customer.address.state")).sendKeys("Serbia");
        driver.findElement(By.id("customer.address.zipCode")).click();
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("12345");
        driver.findElement(By.id("customer.phoneNumber")).click();
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("987654321");
        driver.findElement(By.id("customer.ssn")).click();

        driver.findElement(By.id("customer.ssn")).sendKeys("bakivuk");

        driver.findElement(By.id("customer.username")).click();


        String prefix = "myName_";
        String username = prefix + RandomStringUtils.randomAlphanumeric(7).toLowerCase();


        driver.findElement(By.id("customer.username")).sendKeys(username);


        driver.findElement(By.id("customer.password")).click();
        driver.findElement(By.id("customer.password")).sendKeys("bakivukic1");
        driver.findElement(By.id("repeatedPassword")).click();
        driver.findElement(By.id("repeatedPassword")).sendKeys("bakivukic1");
        driver.findElement(By.xpath("//tbody/tr[13]/td[2]/input[1]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Your account was created successfully. You are now')]")));





    }


    @AfterTest
    public void endTest(){

        driver.quit();
    }
}

