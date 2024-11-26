package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class BeforeAll {


    public WebDriver driver;
    public WebDriverWait wait;

    String baseURL;


    @BeforeTest
    public void setUp() {

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, (Duration.ofSeconds(10)));
        baseURL = "https://www.saucedemo.com/";
        driver.get(baseURL);
    }
    @AfterTest
    public void endTest(){
        driver.quit();

    }


    }


