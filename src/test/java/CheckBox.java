import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class CheckBox {

    public WebDriver driver;
    public WebDriverWait wait;
    public String baseURL;



    @BeforeTest
    public void setUp() throws IOException {

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        baseURL = "https://demoqa.com/";


    }


    @Test

    public void CheckBox() {

        driver.get(baseURL);
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/*[1]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Check Box')]")).click();
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/button[1]/*[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/button[1]/*[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]")).click();



    }


    @AfterTest
    public void endTest() {
        driver.quit();
    }

    }



