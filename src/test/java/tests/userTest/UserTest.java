package tests.userTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pageobjects.dashboard.Dashboard;
import pageobjects.user.AddNewUser;
import tests.BaseTest;
import tests.BaseTestLogin;

/**
 * Created by RajniSh on 1/27/2017.
 */
public class UserTest extends BaseTestLogin{
        @Test
        public void testThatAddNewUserWorks(){
            Dashboard dashboard=new Dashboard(driver);
            dashboard.gotoUsers();
            dashboard.gotoAddNewUser();

            AddNewUser addNewUser=new AddNewUser(driver);
            addNewUser.setUsername("rajnish");
            addNewUser.setEmail("tusuju21@gmail.com");
            addNewUser.setFirstname("rajnish");
            addNewUser.setlastname("pradhan");
            addNewUser.setwebsite("www.rajnish.com");
            addNewUser.setPassclick();
            addNewUser.setPassword("admin");
            addNewUser.setSendusernotification();
            addNewUser.setRole("Administrator");
            addNewUser.setSubmitbutton();

            String heading1=dashboard.getSomeText();
            Assert.assertEquals("Add New User",heading1);
        }
    @Test
    public void testThatYourProfileWorks(){
        Dashboard dashboard=new Dashboard(driver);
        dashboard.gotoUsers();
        dashboard.gotYourProfile();
    }
    @Test
    public void testThatAllUserWorks(){
        Dashboard dashboard=new Dashboard(driver);
        dashboard.gotoUsers();
        dashboard.gotoAllUsers();
    }
    @Test
    public void testThatVerifyWhetherTheUserPageIsClickedOrNot(){
        Dashboard dashboard=new Dashboard(driver);
        dashboard.gotoUsers();
        String heading=dashboard.getSomeText();
        Assert.assertEquals("Users Add New",heading);
    }

}

