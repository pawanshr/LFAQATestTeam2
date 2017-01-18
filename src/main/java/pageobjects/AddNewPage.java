package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by thapa on 1/18/2017.
 */
public class AddNewPage {

//    System.setproperty("webdriver.firefox.marionette","F:\\LeapFrog\\geckodriver.exe");

    WebDriver driver;
    WebElement addpage = driver.findElement(By.linkText("Add additional pages"));
    WebElement addtitle = driver.findElement(By.id("title"));
    WebElement pagecontent = driver.findElement(By.id("tinymce"));
    WebElement publishpage = driver.findElement(By.id("publish"));
    WebElement preview = driver.findElement(By.id("post-preview"));


    public AddNewPage(WebDriver driver){
        this.driver = driver;
    }

    public void doaddpage(){
        addpage.click();
    }

    public void doAddtitle() {
        addtitle.sendKeys("QA Class");

    }

    public void addpagecontent(){
        pagecontent.sendKeys("A B C D X Y Z");
    }

    public void dopublishpage(){
        publishpage.click();
    }

    public void seepreview() {
        preview.click();
    }







}
