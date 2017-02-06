package pageobjects.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    @FindBy(xpath=".//*[@id='menu-pages']/a/div[3]")
    WebElement pages;

    @FindBy(xpath=".//*[@id='menu-pages']/ul/li[3]/a")
    WebElement addNewPageLink;

    @FindBy(xpath=".//*[@id='menu-users']/a/div[3]")
    WebElement users;

    @FindBy(xpath=".//*[@id='menu-users']/ul/li[3]/a")
    WebElement addNewUserLink;

    @FindBy(xpath=".//*[@id='wpbody-content']/div[3]/h1")
    WebElement dashboardHeadingText;

    @FindBy(xpath = ".//*[@id='menu-settings']/a")
    WebElement settings;



    public Dashboard(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void gotoSettings() {
        //(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(settings));
        settings.click();
    }

    public void gotohomeLink() {
        homeLink.click();
    }

    public void gotoPosts() {
        posts.click();
    }

    public void gotoAddNewPost() {
        //mouseover on page
        //click on mouse over sub menu item = "Add New"

    }

    public void gotoPages(){
        pages.click();
    }

    public void gotoAddNewPages(){
        addNewPageLink.click();
    }

    public void gotoUsers(){
        users.click();
    }

    public void gotoAddNewUser() {
       addNewUserLink.click();
    }

    public String getSomeText(){
       String heading=  dashboardHeadingText.getText();
       return heading;
    }

}


