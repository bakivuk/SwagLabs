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

public class Pagination {

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

    public void Pagination(){


        driver.get(baseURL);
        driver.findElement(By.xpath("//a[@id='pagination']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'1')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'1')]")).isEnabled();
        driver.findElement(By.xpath("//div[@id='pageResult']")).isDisplayed();
        driver.findElement(By.xpath("//a[contains(text(),'2')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'2')]")).isEnabled();
        driver.findElement(By.xpath("//a[contains(text(),'2')]")).isDisplayed();
        driver.findElement(By.xpath("//a[contains(text(),'3')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'3')]")).isEnabled();
        driver.findElement(By.xpath("//div[@id='pageResult']")).isDisplayed();
        driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Next')]")).isEnabled();
        driver.findElement(By.xpath("//div[@id='pageResult']"));


    }

    @AfterTest

    public void endTest(){

        driver.quit();

    }
}


