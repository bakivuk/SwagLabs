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

public class Register {

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

    public void Register() {

        driver.get(baseURL);
        driver.findElement(By.xpath("//a[contains(text(),'Forms')]")).click();
        driver.findElement(By.xpath("//a[@id='register']")).click();
        driver.findElement(By.xpath("//input[@id='firstName']")).click();
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Marko");
        driver.findElement(By.xpath("//input[@id='lastName']")).click();
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Markovic");
        driver.findElement(By.xpath("//input[@id='phone']")).click();
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("123456");
        driver.findElement(By.xpath("//select[@id='countries_dropdown_menu']")).click();
        driver.findElement(By.xpath("//option[contains(text(),'Spain')]")).click();
        driver.findElement(By.xpath("//input[@id='emailAddress']")).click();
        driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys("admin@admin.com");
        driver.findElement(By.xpath("//input[@id='password']")).click();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
        driver.findElement(By.xpath("//button[@id='registerBtn']")).click();
        driver.findElement(By.xpath("//div[@id='message']")).isDisplayed();

    }

    @AfterTest

    public void endTest() {

        driver.quit();

    }







    }


