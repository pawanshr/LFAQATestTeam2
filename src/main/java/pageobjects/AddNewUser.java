package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

/**
 * Created by RajniSh on 1/18/2017t.
 */
public class AddNewUser {
    WebDriver driver;
    By username = By.id("user_login");
    By Email = By.id("email");
    By firstname = By.id("first_name");
    By lastname = By.id("last_name");
    By website = By.id("url");
    By password = By.id("pass1-text");
    By sendusernotification = By.id("send_user_notification");
    By role = By.id("role");
    By submitbutton = By.id("createusersub");

    public AddNewUser(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername() {
        driver.findElement(username).sendKeys("admin");

    }

    public void setEmail() {
        driver.findElement(Email).sendKeys("");
    }

    public void setFirstname() {
        driver.findElement(firstname).sendKeys("Rajnish");

    }
    public void setlastname(){
        driver.findElement(lastname).sendKeys("Pradhan");

    }
    public  void setwebsite(){
        driver.findElement(website).sendKeys("www.google.com");

    }
    public  void setPassword(){
        driver.findElement(password).sendKeys("admin");

    }
    public  void setSendusernotification(){
        driver.findElement(sendusernotification).click();

    }
    public  void setRole(){
        driver.findElement(role).sendKeys("adminstrator");

    }
    public  void setSubmitbutton(){
        driver.findElement(submitbutton).click();

    }

}
