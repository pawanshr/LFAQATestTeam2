package pageobjects.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(xpath =".//*[@id='login_error']/strong")
    WebElement error;

   public Login(WebDriver driver){
       PageFactory.initElements(driver,this);
       this.driver=driver;
   }

    //set username in username field
    public  void setUsername(String usernametext){
        username.sendKeys(usernametext);
    }

    //set password in password field
    public void setPassword(String passwordtext){
        password.sendKeys(passwordtext);
    }

    //click the submit button
    public void clickLoginButton(){
        login.click();
    }

    /*Login Behaviour Method
    * This would be 1 method call for
    * setting username,
    * password and
    * clicking Login Button*/
    public void doLogin(String usernameText, String passwordText) {
        setUsername(usernameText);
        setPassword(passwordText);
        clickLoginButton();
    }

    /*get Error Message*/
    public String getErrorMessage(){
        return error.getText();
    }

    /*get Page Title of the Login Page*/
    public String getTitleOfPage(){
        return driver.getTitle();
    }

}
