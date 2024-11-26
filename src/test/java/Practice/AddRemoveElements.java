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

public class AddRemoveElements {

    public WebDriver driver;
    public WebDriverWait wait;
    public String baseURL;

    @BeforeTest
    public void setUp() throws IOException {

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        baseURL = "https://the-internet.herokuapp.com/";

    }

    @Test

    public void AddRemoveElements() {

        driver.get(baseURL);
        driver.findElement(By.xpath("//a[contains(text(),'Add/Remove Elements')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Add Element')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Add Element')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Add Element')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Add Element')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Add Element')]")).click();

        //Delete

        driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/button[5]")).click();
        driver.findElement(By.xpath("div.row:nth-child(2) div.large-12.columns:nth-child(2) div.example:nth-child(3) div:nth-child(3) > button.added-manually:nth-child(4)")).click();
        driver.findElement(By.xpath("div.row:nth-child(2) div.large-12.columns:nth-child(2) div.example:nth-child(3) div:nth-child(3) > button.added-manually:nth-child(3)")).click();
        driver.findElement(By.xpath("div.row:nth-child(2) div.large-12.columns:nth-child(2) div.example:nth-child(3) div:nth-child(3) > button.added-manually:nth-child(2)")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/button[1]")).click();




    }


    @AfterTest

    public void endTest(){
        driver.quit();

    }

}
