package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UserLoginPage extends BaseTest {

    @Test
    public void testUserLogin(){
        driver.get("https://automationexercise.com/login");
        driver.findElement(By.name("email")).sendKeys("tes0001tUser@gmail.com");
        driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("Password12345");
        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();

}
}
