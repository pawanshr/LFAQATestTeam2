package tests;

import org.apache.bcel.generic.NEW;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.AddNewUser;
import org.openqa.selenium.support.PageFactory;
import pageobjects.AddNewPage;
import pageobjects.AddNewPost;
import pageobjects.Dashboard;
import pageobjects.Login;

/**
 * Created by Ujjwal on 1/18/2017.
 */
public class LoginTest {

    @Test
    public void testThatLoginWorks(){
        System.setProperty("webdriver.firefox.marionette","C:\\LeapFrog\\geckodriver.exe");

        WebDriver driver=new FirefoxDriver();
        driver.get("http://localhost/wordpress/wp-admin");


        Login login = new Login(driver);
        PageFactory.initElements(driver,login);
        login.setUsername();
        login.setPassword();
        login.setLogin();

    }
    @Test

    public void testThatLoginDosentWork(){
        System.setProperty("webdriver.firefox.marionette","C:\\Leapfrog\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://localhost/wordpress/wp-admin");
        Login login=new Login(driver);
        PageFactory.initElements(driver,login);
        login.setUsername();
        login.setPassword();
        login.setLogin();
    }
}
