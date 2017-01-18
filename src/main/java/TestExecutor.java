import org.apache.bcel.generic.NEW;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.Login;

/**
 * Created by Ujjwal on 1/18/2017.
 */
public class TestExecutor {

    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.marionette","F:\\LeapFrog\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://localhost/wordpress/wp-admin");

        Login login = new Login(driver);
        login.setUsername();
        login.setPassword();
        login.setLogin();




    }


}
