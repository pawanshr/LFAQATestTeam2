package tests.loginTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pageobjects.dashboard.Dashboard;
import pageobjects.login.Login;
import tests.BaseTest;

import javax.xml.transform.sax.SAXSource;


/**
 * Created by Ujjwal on 1/18/2017.
 */
public class LoginTest extends BaseTest {
    private Login login;

    @Before
    public void setup() {
        super.setup();
        login = new Login(driver);
    }

    @Test
    public void testThatLoginWithCorrectUsernameAndCorrectPasswordWorks() {
        login.doLogin("admin", "admin");
        String heading = (new Dashboard(driver)).getSomeText();

        /*Validating if we landed on Dashboard after correct username / password*/
        Assert.assertEquals("Dashboard", heading);
    }

    @Test
    public void testThatLoginWithIncorrectUsernameAndCorrectPasswordDoesntWork() {
        login.doLogin("admin1", "admin");

        /*Validating if we landed back to Login Form with Error Message*/
        String errorText = login.getErrorMessage();
        Assert.assertEquals("ERROR", errorText);
    }

    @Test
    public void testThatLoginWithIncorrectUsernameAndIncorrectPasswordDoesntWork() {
        login.doLogin("admin123", "admin123");

        /*Validating if we landed back to Login Form with Error Message*/
        String errorText = login.getErrorMessage();
        Assert.assertEquals("ERROR", errorText);
    }

    @Test
    public void testThatLoginWithCorrectUsernameAndBlankPasswordDosentWork() {
        login.doLogin("admin", "");

        /*Validating if we landed back to Login Form with Error Message*/
        String errorText = login.getErrorMessage();
        Assert.assertEquals("ERROR", errorText);
    }

    @Test
    public void testThatLoginWithBlankUsernameAndCorrectPasswordDosentWork() {
        login.doLogin("", "admin");

        /*Validating if we landed back to Login Form with Error Message*/
        String errorText = login.getErrorMessage();
        Assert.assertEquals("ERROR", errorText);
    }

    @Test
    public void testThatLoginWithBlankUsernameAndBlankPasswordDosentWork() {
        login.doLogin("", "");

        /*Validating if we landed back to Login Form with Error Message*/
        String pageTitle = login.getTitleOfPage();
        Assert.assertTrue(pageTitle.contains("Log In"));
    }

    @Test
    public void testThatLoginWithCorrectUsernameAndIncorrectPasswordDosentWork() {
        login.doLogin("admin", "admin123");

        /*Validating if we landed back to Login Form with Error Message*/
        String errorText = login.getErrorMessage();
        Assert.assertEquals("ERROR", errorText);
    }

    @Test
    public void testThatLoginWithIncorrectUsernameAndCorrectPasswordDosentWork() {
        login.doLogin("admin123", "admin");

        /*Validating if we landed back to Login Form with Error Message*/
        String errorText = login.getErrorMessage();
        Assert.assertEquals("ERROR", errorText);
    }

    @Test
    //Incorrect 256 character username and valid password
    public void testThatLoginWith256CharacterUsernameAndCorrectPasswordDosentWork() {
        login.doLogin("rrjndjdhddjfdfhdfdjhdjhfdkjfhdkjfdfjddjdjdduddjdhdydhdydjdhdydhdjdhdjdhdjdhdjdhdjddklolkio90imjuujdu87djdjjdjdkdjdkddijkkkkllkdidkdjdjdjdjdiui87udjdndjjdjjdhdjduyddhdkkkkddhjduidiud8idudidud8d8dd8d8dj",
                "admin");

        /*Validating if we landed back to Login Form with Error Message*/
        String errorText = login.getErrorMessage();
        Assert.assertEquals("ERROR", errorText);
    }

    @Test
    public void testThatLoginWithWhiteSpaceInUsernameAndCorrectPasswordDosentWork() {
        login.doLogin("a d m i n","admin");

        /*Validating if we landed back to Login Form with Error Message*/
        String errorText = login.getErrorMessage();
        Assert.assertEquals("ERROR", errorText);
    }

    @Test
    //username with special characters and valid password
    public void testThatLoginWithSpecialCharacterUsernameAndCorrectPasswordDosentWork() {
        login.doLogin("!@#$%^&*","admin");

        /*Validating if we landed back to Login Form with Error Message*/
        String errorText = login.getErrorMessage();
        Assert.assertEquals("ERROR", errorText);
    }
}
