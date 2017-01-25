package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Genelia on 18/01/2017.
 */
public class AddNewPost {

    WebDriver driver;

    @FindBy(id = "title")
    WebElement title;

    @FindBy(id = "tinymce")
    WebElement paragraph;

    @FindBy(id = "content_ifr")
    WebElement frame;

    @FindBy(id = "publish")
    WebElement publish;

    public AddNewPost(WebDriver driver){
        this.driver = driver;
    }

    public void dotitle(String titletext) {
        title.sendKeys(titletext);
    }

    public void paragraph(String paragraphtext){
        driver.switchTo().frame(frame);
        paragraph.sendKeys(paragraphtext);
        driver.switchTo().parentFrame();
    }


    public void dopublish(){

        publish.click();
    }

}




