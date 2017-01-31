package pageobjects.page;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        publishpage.click();
        WebDriverWait w = new WebDriverWait(driver,15);
        w.until(ExpectedConditions.elementToBeClickable(publishpage));
    }

    public void seepreview() {
        preview.click();
    }

    public String titleofpage(){
        String title = newpage.getText();
        return  title;
    }







}
