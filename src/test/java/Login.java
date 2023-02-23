import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Login extends Setup{
   @Test (priority = 0, description = "Get login pagge.")
    public void login(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @Test(priority = 1, description = "login into the webpage" )
    public void userLogin(){
        List<WebElement> enterUserName = driver.findElements(By.className("oxd-input"));
        enterUserName.get(0).sendKeys("Admin");
        List<WebElement> enterPass = driver.findElements(By.className("oxd-input"));
        enterPass.get(1).sendKeys("admin123");
        List<WebElement> loginButton = driver.findElements(By.className("oxd-button"));
        loginButton.get(0).click();

    }
}
