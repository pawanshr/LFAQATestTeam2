package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Ujjwal on 1/18/2017.
 */
public class Login {
     WebDriver driver;
    @FindBy(id = "user_login")
    WebElement username;

    @FindBy(id = "user_pass")
    WebElement password;
    
    @FindBy(id = "wp-submit")
    WebElement login;

   public Login(WebDriver driver){

       this.driver=driver;

   }

    //set username in username field

    public  void setUsername(){
        username.sendKeys("admin1");
    }
    //set password in password field
    public void setPassword(){
        password.sendKeys("admin");
    }

    //click the submit button
    public void setLogin(){
       login.click();
    }

}
