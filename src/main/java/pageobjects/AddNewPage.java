package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by thapa on 1/18/2017.
 */
public class AddNewPage {

    WebDriver driver;
    @FindBy (id = "title")
    WebElement addtitle;
    @FindBy (id = "tinymce")
    WebElement pagecontent;
    @FindBy (id = "publish")
    WebElement publishpage;
    @FindBy (id = "post-preview")
    WebElement preview;




    public AddNewPage(WebDriver driver){
        this.driver = driver;
    }

    public void doAddtitle(String addtitletext) { addtitle.sendKeys(addtitletext); }

    public void addpagecontent(String addpagecontenttext){
        pagecontent.sendKeys(addpagecontenttext);
    }

    public void dopublishpage(){
        publishpage.click();
    }

    public void seepreview() {
        preview.click();
    }







}
