package tests.loginTest;

import org.apache.bcel.generic.NEW;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pageobjects.dashboard.Dashboard;
import pageobjects.login.Login;
import tests.BaseTest;


/**
 * Created by Ujjwal on 1/18/2017.
 */
public class LoginTest extends BaseTest {
    @Before
    public void setup(){
        super.setup();
        login = new Login(driver);
    }

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

        String errorText=login.setError();
        Assert.assertEquals("ERROR",errorText);

    }

}
