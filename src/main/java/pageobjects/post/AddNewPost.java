package pageobjects.post;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(xpath = ".//*[@id='wpbody-content']/div[3]/h1")
    WebElement postheadingtext;

    public AddNewPost(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
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
    public String getSomeText() {
        String heading1=postheadingtext.getText();
        return heading1;
    }
}




