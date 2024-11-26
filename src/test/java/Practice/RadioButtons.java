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

public class RadioButtons {

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

    public void RadioButton() {

        driver.get(baseURL);
        driver.findElement(By.xpath("//a[contains(text(),'Buttons')]")).click();
        driver.findElement(By.xpath("//a[@id='radio-buttons']")).click();
        driver.findElement(By.xpath("//input[@id='radio-button1']")).click();
        driver.findElement(By.xpath("//input[@id='radio-button1']")).isEnabled();
        driver.findElement(By.xpath("//input[@id='radio-button2']")).click();
        driver.findElement(By.xpath("//input[@id='radio-button2']")).isEnabled();
        driver.findElement(By.xpath("//input[@id='radio-button3']")).click();
        driver.findElement(By.xpath("//input[@id='radio-button3']")).isEnabled();

    }

    @AfterTest

    public void endTest(){

        driver.quit();

    }
}
