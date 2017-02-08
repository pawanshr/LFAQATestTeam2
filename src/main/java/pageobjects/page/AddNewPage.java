package pageobjects.page;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by thapa on 1/18/2017.
 */
public class AddNewPage {
    WebDriver driver;
    @FindBy (id = "title")
    WebElement addtitle;

    @FindBy (id = "publish")
    WebElement publishpage;

    @FindBy (id = "post-preview")
    WebElement preview;

    @FindBy(id = "content_ifr")
    WebElement frame;

    @FindBy(id = "tinymce")
    WebElement body;

    @FindBy(xpath = ".//div[\"message\"]/p[contains(text(),\"published\")]")
    WebElement newpage;

    @FindBy(id = "submitdiv")
    WebElement publishsection;

    public AddNewPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void doAddtitle(String addtitletext) {
        addtitle.sendKeys(addtitletext); }

    public void addpagecontent(String addpagecontenttext){
        driver.switchTo().frame(frame);
        body.sendKeys(addpagecontenttext);
        driver.switchTo().parentFrame();
    }

    public void dopublishpage(){

        new Actions(driver).moveToElement(publishsection).click().build().perform();
        new WebDriverWait(driver, 100).until(ExpectedConditions.elementToBeClickable(publishpage));
        publishpage.sendKeys(Keys.ENTER);
    }

    public void seepreview() {
        preview.click();
    }

    public String titleofpage(){
        WebDriverWait waitforpublish = new WebDriverWait(driver,15);
        waitforpublish.until(ExpectedConditions.visibilityOf(newpage));
        String title = newpage.getText();
        return  title;
    }







}
