package tests;

import org.junit.Test;

/**
 * Created by Ujjwal on 1/18/2017.
 */
public class LoginTest extends BaseTest{
    @Test
    public void testThatLoginWorks() {
        login.setUsername("admin");
        login.setPassword("admin");
        login.setLogin();
    }
    @Test
    public void testThatLoginDosentWork(){
        login.setUsername("admin1");
        login.setPassword("admin");
        login.setLogin();

    }

}
