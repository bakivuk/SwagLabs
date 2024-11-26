package org.tools.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class UploadTest {

    public WebDriver driver;
    public WebDriverWait wait;
    public String baseURL;

    @BeforeTest
    public void setUp()throws IOException {

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        baseURL = "https://demoqa.com/upload-download";
        driver.get(baseURL);
    }

        @Test
        public void UploadTest() throws InterruptedException {

        //Upload File
    WebElement uploadFileButton = driver.findElement(By.id("uploadFile"));
    //Uploading the file using sendKeys
    uploadFileButton.sendKeys("C:\\Users\\QA1.5\\Desktop\\cola.png");
    Thread.sleep(3000);
    driver.findElement(By.id("uploadedFilePath")).isDisplayed();

    }





         @AfterTest
    public void endTest() {
        driver.quit();

         }
}
