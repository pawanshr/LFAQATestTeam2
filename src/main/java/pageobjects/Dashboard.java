package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by superuser on 1/18/2017.
 */
public class Dashboard {
    WebDriver driver;

    private WebElement homeLink = driver.findElement(By.xpath(".//*[@id='menu-dashboard']/a/div[3]"));
    private WebElement addNewPostLink = driver.findElement(By.xpath(".//*[@id='menu-posts']/ul/li[3]/a"));
    private WebElement addNewPageLink = driver.findElement(By.xpath(".//*[@id='menu-pages']/ul/li[3]/a"));
    private WebElement addNewUserLink = driver.findElement(By.xpath(".//*[@id='menu-users']/ul/li[3]/a"));

    public Dashboard(WebDriver driver){
        this.driver = driver;
    }

    public gotoAddNewUser() {
       homeLink.click();

    }

    public gotoAddNewPost() {
        addNewPostLink.click();
    }

    public gotoAddNewPage(){
       addNewPageLink.click();
    }
}
