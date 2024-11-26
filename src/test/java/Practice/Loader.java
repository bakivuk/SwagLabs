package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class Loader {

    public WebDriver driver;
    public WebDriverWait wait;
    public String baseURL;

    @BeforeTest
    public void setUp() throws IOException {

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        baseURL = "https://qa-practice.netlify.app/";

    }

    @Test

    public void Loader(){


        driver.get(baseURL);
        driver.findElement(By.xpath("//a[@id='loader']")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='loader']")));
       driver.findElement(By.xpath("//h2[contains(text(),'Tada!')]")).isDisplayed();



    }

    @AfterTest

    public void endTest(){

        driver.quit();
    }
}
