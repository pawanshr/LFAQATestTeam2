package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Ujjwal on 1/18/2017.
 */
public class Login {
     WebDriver driver;

    By username=By.id("user_login");
    By password=By.id("user_pass");
    By login=By.id("wp-submit");


   public Login(WebDriver driver){

       this.driver=driver;

   }

    //set username in username field

    public  void setUsername(){
        driver.findElement(username).sendKeys("admin");
    }
    //set password in password field
    public void setPassword(){
        driver.findElement(password).sendKeys("admin");
    }

    //click the submit button
    public void setLogin(){
        driver.findElement(login).click();
    }

}
