package Tests;
import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class UserRegistrationTest extends BaseTest {

    @Test
    public void UserRegistration(){

        driver.get("https://automationexercise.com/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.name("name")).sendKeys("TestUser");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("tes01tUser@gmail.com");
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("password")).sendKeys("Password12345");
        driver.findElement(By.id("first_name")).sendKeys("UserFirstName");
        driver.findElement(By.id("last_name")).sendKeys("UserLastName");
        driver.findElement(By.id("address1")).sendKeys("123 Brooklyn ave");
        driver.findElement(By.id("state")).sendKeys("New York");
        driver.findElement(By.id("city")).sendKeys("Brooklyn");
        driver.findElement(By.id("zipcode")).sendKeys("12345");
        driver.findElement(By.id("mobile_number")).sendKeys("123456789");
        driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();

        Assert.assertEquals(driver.getTitle(), "Automation Exercise - Account Created");
    }
}
