package GreenKart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class Search {

    public WebDriver driver;
    public WebDriverWait wait;
    public String baseURL;

    @BeforeTest
    public void setUp() throws IOException {

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        baseURL = "https://rahulshettyacademy.com/seleniumPractise/#/";
    }

    @Test

    public void Search() {

        driver.get(baseURL);
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[1]/div[2]/form[1]/input[1]")).click();
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[1]/div[2]/form[1]/input[1]")).sendKeys("Potato");
        driver.findElement(By.xpath("//header/div[1]/div[2]/form[1]/button[1]")).click();
    }


    @AfterTest

    public void endTest() {
    driver.quit();


    }

}


