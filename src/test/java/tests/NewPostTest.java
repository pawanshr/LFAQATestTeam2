package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.Login;

/**
 * Created by Genelia on 20/01/2017.
 */
public class NewPostTest {

    @Test
    public void testThatPostWorks(){
        System.setProperty("webdriver.firefox.marionette","C:\\LeapFrog\\geckodriver.exe");

        WebDriver driver=new FirefoxDriver();
        driver.get("http://localhost/wordpress/wp-admin");

        Login login = new Login(driver);
        PageFactory.initElements(driver,login);
        login.setUsername("admin");
        login.setPassword("admin");
        login.setLogin();


        pageobjects.Dashboard dashboard = new pageobjects.Dashboard(driver);
        PageFactory.initElements(driver,dashboard);
        dashboard.gotohomeLink();

        pageobjects.AddNewPost addNewPost = new pageobjects.AddNewPost(driver);
        PageFactory.initElements(driver,addNewPost);
        dashboard.gotoPosts();
        dashboard.gotoAddNewPost();








    }
}
