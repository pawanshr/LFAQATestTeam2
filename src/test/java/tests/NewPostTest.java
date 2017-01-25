package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.AddNewPage;
import pageobjects.AddNewPost;
import pageobjects.Dashboard;
import pageobjects.Login;

/**
 * Created by Genelia on 20/01/2017.
 */
public class NewPostTest extends BaseTest {
    @Test
    public void testThatAddNewPostWorks(){
        login.setUsername("admin");
        login.setPassword("admin");
        login.setLogin();


        Dashboard dashboard=new Dashboard(driver);
        PageFactory.initElements(driver,dashboard);

        dashboard.gotoPosts();
        dashboard.gotoAddNewPost();

        AddNewPost addNewPost=new AddNewPost(driver);

        addNewPost.dotitle("title");
        addNewPost.paragraph("paragraph");
        addNewPost.dopublish();


    }

}
