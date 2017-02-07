package tests;

import org.junit.Before;
import pageobjects.login.Login;

/**
 * Created by i80921 on 1/30/2017.
 */
public class BaseTestLogin extends BaseTest {
    protected Login login;

    @Before
    public void setup(){
        super.setup();
        new Login(driver).doLogin("admin","admin");
    }
}
