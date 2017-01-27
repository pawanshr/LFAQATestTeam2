package tests.loginTest;


import org.junit.Assert;
import org.junit.Test;
import pageobjects.Dashboard;
import tests.BaseTest;

import org.junit.Test;


/**
 * Created by Ujjwal on 1/18/2017.
 */
public class LoginTest extends BaseTest {
    @Test
    public void testThatLoginWorks() {
        login.setUsername("admin");
        login.setPassword("admin");
        login.setLogin();

        Dashboard dashboard= new Dashboard(driver);
        String heading=dashboard.getSomeText();
        Assert.assertEquals("Dashboard",heading);
    }
    @Test
    public void testThatLoginDosentWork(){
        login.setUsername("admin1");
        login.setPassword("admin");
        login.setLogin();

    }

}
