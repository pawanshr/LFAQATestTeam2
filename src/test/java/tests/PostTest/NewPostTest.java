package tests.PostTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pageobjects.post.AddNewPost;
import pageobjects.dashboard.Dashboard;
import tests.BaseTest;

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

        Dashboard dashboard1=new Dashboard(driver);
        dashboard1.gotoAddNewPost();
        String heading=dashboard1.getSomeText();
        Assert.assertEquals("Add New Post",heading);


        AddNewPost addNewPost=new AddNewPost(driver);
        addNewPost.dotitle("title");
        addNewPost.paragraph("paragraph");
        addNewPost.dopublish();


    }


}
