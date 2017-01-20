package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by superuser on 1/18/2017.
 */
public class Dashboard {
    WebDriver driver;

    @FindBy(xpath=".//*[@id='menu-dashboard']/a/div[3]")
    WebElement homeLink;

    @FindBy(xpath=".//*[@id='menu-posts']/a/div[3]")
    WebElement posts;

    @FindBy(xpath=".//*[@id='menu-posts']/ul/li[3]/a")
    WebElement addNewPostLink;

    @FindBy(xpath=".//*[@id='menu-pages']/ul/li[3]/a")
    WebElement addNewPageLink;

    @FindBy(xpath=".//*[@id='menu-users']/ul/li[3]/a")
    WebElement addNewUserLink;

    public Dashboard(WebDriver driver) {
        this.driver = driver;
    }

    public void gotohomeLink() {
        homeLink.click();
    }

    public void gotoPosts() {
        posts.click();
    }

    public void gotoAddNewPost() {
        addNewPostLink.click();
    }

    public void gotoAddNewUser() {
       addNewUserLink.click();
    }

    public void gotoAddNewPage() {
        addNewPageLink.click();
    }
}


