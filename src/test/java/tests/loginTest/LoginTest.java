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
    @Test
    //incorrect username and incorrect passowrd
    public void testThatLoginDosentWork1() {
        login.setUsername("admin123");
        login.setPassword("admin123");
        login.setLogin();
    }
    @Test
    //valid username and empty password
    public void testThatLoginDosentWork2() {
        login.setUsername("admin");
        login.setPassword("");
        login.setLogin();
    }
    @Test
    //empty username and valid password
    public void testThatLoginDosentWork3() {
        login.setUsername("");
        login.setPassword("admin");
        login.setLogin();
    }
    @Test
    //empty username and empty password
    public void testThatLoginDosentWork4() {
        login.setUsername("");
        login.setPassword("");
        login.setLogin();
    }
    @Test
    //valid username and incorrect password
    public void testThatLoginDosentWork5() {
        login.setUsername("admin");
        login.setPassword("admin123");
        login.setLogin();
    }
    @Test
    //incorrect username and valid password
    public void testThatLoginDosentWork6() {
        login.setUsername("admin123");
        login.setPassword("admin");
        login.setLogin();
    }
    @Test
    //Incorrect 256 character username and valid password
    public void testThatLoginDosentWork7() {
        login.setUsername("rrjndjdhddjfdfhdfdjhdjhfdkjfhdkjfdfjddjdjdduddjdhdydhdydjdhdydhdjdhdjdhdjdhdjdhdjddklolkio90imjuujdu87djdjjdjdkdjdkddijkkkkllkdidkdjdjdjdjdiui87udjdndjjdjjdhdjduyddhdkkkkddhjduidiud8idudidud8d8dd8d8dj");
        login.setPassword("admin");
        login.setLogin();
    }
    @Test
    //some character of username and valid password
    public void testThatLoginDosentWork8() {
        login.setUsername("adm");
        login.setPassword("admin");
        login.setLogin();
    }
    @Test
    //username with whitespace and valid password
    public void testThatLoginDosentWork9() {
        login.setUsername("a d m i n");
        login.setPassword("admin");
        login.setLogin();
    }
    @Test
    //username with special characters and valid password
    public void testThatLoginDosentWork10() {
        login.setUsername("!@#$%^&*");
        login.setPassword("admin");
        login.setLogin();
    }
    @Test
    //username with 255 characters and valid password
    public void testThatLoginDosentWork11() {
        login.setUsername("admin123fjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjf");
        login.setPassword("admin");
        login.setLogin();
    }



}
