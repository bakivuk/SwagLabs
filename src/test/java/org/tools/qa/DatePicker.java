package org.tools.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        baseURL = "https://demoqa.com/date-picker";



}

    @Test
public void DatePickerTest() {

        driver.get(baseURL);
        driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']")).click();
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]")).click();
        driver.findElement(By.xpath("//option[contains(text(),'May')]")).click();
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]")).click();
        driver.findElement(By.xpath("//option[contains(text(),'1996')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'16')]")).click();

        String mtDate = driver.findElement(By.id("datePickerMonthYearInput")).getAttribute("value");
        System.out.println(mtDate);

        Assert.assertEquals("05/16/1996",mtDate );



    }

    @AfterTest
    public void endTest() {
        driver.quit();

    }








    }




