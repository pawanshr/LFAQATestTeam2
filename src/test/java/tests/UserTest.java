package tests;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pageobjects.AddNewUser;
import pageobjects.Dashboard;

/**
 * Created by RajniSh on 1/24/2017.
 */
public class UserTest extends BaseTest{
    @Test
    public void testThatAddNewUserWorks(){
        login.setUsername("admin");
        login.setPassword("admin");
        login.setLogin();

        Dashboard dashboard=new Dashboard(driver);
        PageFactory.initElements(driver,dashboard);
        dashboard.gotoUsers();
        dashboard.gotoAddNewUser();


        AddNewUser addNewUser=new AddNewUser(driver);
        PageFactory.initElements(driver,addNewUser);
        addNewUser.setUsername();
        addNewUser.setEmail();
        addNewUser.setFirstname();
        addNewUser.setlastname();
        addNewUser.setwebsite();
        addNewUser.setPassword();
        addNewUser.setSendusernotification();
        addNewUser.setRole();
        addNewUser.setSubmitbutton();

    }
}
