package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.login.Login;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ujjwal on 1/23/2017.
 */
public class BaseTest {
    protected static WebDriver driver;
    protected WebDriverWait wait;

    @Before
    public void setup(){
        System.setProperty("webdriver.firefox.marionette","C:\\Leapfrog\\geckodriver.exe");
        //System.setProperty("webdriver.chrome.driver","C:\\Leapfrog\\chromedriver.exe");
        //System.setProperty("webdriver.ie.driver","C:\\Leapfrog\\IEDriverServer.exe");

        driver=new FirefoxDriver();
        //driver = new ChromeDriver();
        //InternetExplorerDriverService service = new InternetExplorerDriverService.Builder().build();
        //DesiredCapabilities capabilities = new DesiredCapabilities();
        //capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
        //capabilities.setCapability(InternetExplorerDriver.ENABLE_ELEMENT_CACHE_CLEANUP,true);
        //capabilities.setCapability("enablePersistentHover", false);
        //driver = new InternetExplorerDriver(service, capabilities);

        wait = new WebDriverWait(driver, 120);

        driver.manage().window().maximize();
        driver.get("http://localhost/wordpress/wp-admin");

      //  PageFactory.initElements(driver,login);
    }

    @After
    public void teardown(){
    driver.quit();
    }
}
