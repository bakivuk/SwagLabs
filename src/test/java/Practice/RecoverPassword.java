package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class RecoverPassword {

    public WebDriver driver;
    public WebDriverWait wait;
    public String baseURL;

    @BeforeTest
    public void setUp() throws IOException {

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        baseURL = "https://qa-practice.netlify.app/";

    }

    @Test

    public void RecoverPassword(){


        driver.get(baseURL);
        driver.findElement(By.xpath("//a[contains(text(),'Forms')]")).click();
        driver.findElement(By.xpath("//a[@id='recover-password']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@admin123");
        driver.findElement(By.xpath("//button[@id='recover-password']")).click();
        driver.findElement(By.xpath("//div[@id='message']")).isDisplayed();

    }


    @AfterTest

    public void endTest() {

        driver.quit();

    }
    }




