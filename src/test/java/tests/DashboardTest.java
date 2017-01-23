package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.Login;

import java.sql.Driver;

/**
 * Created by superuser on 1/22/2017.
 */
public class DashboardTest {

    Login login;
    WebDriver driver;


    @Before
    public void setup(){
        System.setProperty("webdriver.firefox.marionette","C:\\LeapFrog\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://localhost/wordpress/wp-admin");

        login = new Login(driver);
        PageFactory.initElements(driver,login);
    }

    @Test
    public void testThatDashboardLinkWorks(){

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

        pageobjects.AddNewPage addNewPage = new pageobjects.AddNewPage(driver);
        PageFactory.initElements(driver,addNewPage);
        dashboard.gotoPages();
        dashboard.gotoAddNewPage();

        pageobjects.AddNewUser addNewUser = new pageobjects.AddNewUser(driver);
        PageFactory.initElements(driver,addNewUser);
        dashboard.gotoUsers();
        dashboard.gotoAddNewUser();
    }
    @After
    public void teardown(){
        driver.quit();
    }
}
