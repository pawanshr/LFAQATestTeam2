import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium2Example  {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
        System.setProperty("webdriver.firefox.marionette","c:\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        // And now use this to visit Google
        driver.get("http://localhost/wordpress/wp-login.php?redirect_to=http%3A%2F%2Flocalhost%2Fwordpress%2Fwp-admin%2F&reauth=1");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        // Find the text input element by its name
        WebElement element1 = driver.findElement(By.id("user_login"));
        element1.sendKeys("admin");

        WebElement element2 = driver.findElement(By.id("user_pass"));
        element2.sendKeys("admin");

        WebElement element3 = driver.findElement(By.id("wp-submit"));
        element3.click();






    }
}