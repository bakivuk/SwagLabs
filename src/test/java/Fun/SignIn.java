package Fun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class SignIn {

    public WebDriver driver;
    public WebDriverWait wait;
    public String baseURL;

    @BeforeTest
    public void setUp()throws IOException {

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        baseURL = "https://planetasport.rs/";
    }



    @Test

    public void SignIn() {

        driver.get(baseURL);

        driver.findElement(By.xpath("//span[contains(text(),'Uloguj se ili kreiraj nalog')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Kreiraj nalog')]")).click();
        driver.findElement(By.xpath("//input[@id='firstname']")).click();
        driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Baki");
        driver.findElement(By.xpath("//input[@id='lastname']")).click();
        driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Vuk");
        driver.findElement(By.xpath("//input[@id='phone']")).click();
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("631234567");
        driver.findElement(By.xpath("//input[@id='email_address']")).click();
        driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("bakivuk@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).click();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("barbaravukic");
        driver.findElement(By.xpath("//input[@id='password-confirmation']")).click();
        driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys("barbaravukic");
        driver.findElement(By.xpath("//input[@id='show-password']")).click();
        driver.findElement(By.xpath("//body/div[2]/main[1]/div[3]/div[1]/form[1]/div[1]/div[1]/button[1]/span[1]")).click();
    }

    @AfterTest

    public void endTest(){

        driver.quit();



    }
}
