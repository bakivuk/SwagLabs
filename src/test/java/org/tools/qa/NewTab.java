package org.tools.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class NewTab {

    public WebDriver driver;
    public WebDriverWait wait;
    public String baseURL;



    @BeforeTest
    public void setUp() throws IOException {

        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        baseURL = "https://demoqa.com/browser-windows";
    }

    @Test
    public void NewTab(){

        driver.get(baseURL);
        driver.findElement(By.id("tabButton")).click();

        //List of Tabs
        List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());

        //Switch to new tab
        driver.switchTo().window(browserTabs.get(1));
        //Check is it correct page
        String myURL = driver.getCurrentUrl();
        System.out.println(myURL);
        Assert.assertNotEquals(myURL, baseURL);
        driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
        //Close tab and get back
       // driver.close();
        driver.switchTo().window(browserTabs.getFirst());

    }

    @AfterTest
    public void endTest(){
        driver.quit();


    }

}


