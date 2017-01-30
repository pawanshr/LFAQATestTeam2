package tests;

import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.login.Login;

import java.util.concurrent.TimeUnit;

/**
 * Created by i80921 on 1/30/2017.
 */
public class BaseTestLogin extends BaseTest {
    @Before
    public void setup(){
        super.setup();
        login=new Login(driver);
        login.setUsername("admin");
        login.setPassword("admin");
        login.setLogin();
    }
}
