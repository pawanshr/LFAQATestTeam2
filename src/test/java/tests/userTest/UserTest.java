package tests.userTest;

import org.junit.Test;
import pageobjects.dashboard.Dashboard;
import pageobjects.user.AddNewUser;
import tests.BaseTest;

/**
 * Created by RajniSh on 1/27/2017.
 */
public class UserTest extends BaseTest{
        @Test
        public void testThatAddNewUserWorks(){
            login.setUsername("admin");
            login.setPassword("admin");
            login.setLogin();

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
            addNewUser.setRole("Adminstrator");
            addNewUser.setSubmitbutton();
        }
    }

