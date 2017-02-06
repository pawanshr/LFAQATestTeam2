package pageobjects.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by superuser on 1/18/2017.
 */
public class Dashboard {
    WebDriver driver;

    @FindBy(xpath = ".//*[@id='wp-admin-bar-site-name']/a")
    WebElement homeLink;

    @FindBy(xpath = ".//*[@id='wp-admin-bar-view-site']/a")
    WebElement visitSite;

    @FindBy(xpath=".//*[@id='menu-dashboard']/a/div[3]")
    WebElement dashboardLink;

    @FindBy(xpath=".//*[@id='menu-posts']/a/div[3]")
    WebElement postsLink;

    @FindBy(xpath=".//*[@id='menu-posts']/ul/li[3]/a")
    WebElement addNewPostLink;

    @FindBy(xpath=".//*[@id='menu-pages']/a/div[3]")
    WebElement pagesLink;

    @FindBy(xpath=".//*[@id='menu-pages']/ul/li[3]/a")
    WebElement addNewPageLink;

    @FindBy(xpath=".//*[@id='menu-users']/a/div[3]")
    WebElement usersLink;

    @FindBy(xpath=".//*[@id='menu-users']/ul/li[3]/a")
    WebElement addNewUserLink;

    @FindBy(xpath=".//*[@id='wpbody-content']/div[3]/h1")
    WebElement dashboardHeadingText;

    @FindBy(xpath = ".//*[@id='menu-settings']/a/div[3]")
    WebElement settingsLink;

    @FindBy(xpath = ".//*[@id='menu-settings']/ul/li[2]/a")
    WebElement generalLink;

    public Dashboard(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void gotoVisitSiteLink() {
        new Actions(driver).moveToElement(homeLink).build().perform();
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(visitSite));
        visitSite.click();
    }

    public void gotoSettingsGeneral() {
        new Actions(driver).moveToElement(settingsLink).moveToElement(settingsLink).build().perform();
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(generalLink)).click();
    }

    public void gotoDashboardHomeLink() {
        dashboardLink.click();
    }

    public void gotoAddNewPost() {
        new Actions(driver).moveToElement(postsLink).build().perform();
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(addNewPostLink)).click();
    }

    public void gotoAddNewPage(){
        new Actions(driver).moveToElement(pagesLink).build().perform();
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(addNewPageLink)).click();
    }

    public void gotoAddNewUser(){
        new Actions(driver).moveToElement(usersLink).build().perform();
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(addNewUserLink)).click();
    }

    public String getSomeText(){
       String heading=  dashboardHeadingText.getText();
       return heading;
    }

}


