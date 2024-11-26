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

public class DatePicker {

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

    public void DatePicker() {

        driver.get(baseURL);
        driver.findElement(By.xpath("//a[@id='date-picker']")).click();
        driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[1]")).click();
        driver.findElement(By.xpath("//th[contains(text(),'Mar 2018')]")).click();
        driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[3]")).click();
        driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[5]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
        driver.findElement(By.xpath("//input[@id='calendar']")).click();
        driver.findElement(By.xpath("//th[contains(text(),'June 2024')]")).click();
        driver.findElement(By.xpath("//body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[3]/td[4]")).click();


        String mtDate = driver.findElement(By.id("datePickerMonthYearInput")).getAttribute("value");
        System.out.println(mtDate);

    }

    @AfterTest

    public void endTest() {

        driver.quit();

    }





    }

