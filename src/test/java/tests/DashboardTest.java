package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.Login;

/**
 * Created by superuser on 1/22/2017.
 */
public class DashboardTest {

    @Test
    public void testThatDashboardLinkWorks(){
        System.setProperty("webdriver.firefox.marionette","C:\\LeapFrog\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://localhost/wordpress/wp-admin");

        Login login = new Login(driver);
        PageFactory.initElements(driver,login);
        login.setUsername();
        login.setPassword();
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
}
