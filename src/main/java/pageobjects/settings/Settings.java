package pageobjects.settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by superuser on 2/4/2017.
 */
public class Settings {
    WebDriver driver;

    @FindBy(id= "blogname")
    WebElement sitetitle;
    @FindBy(id= "blogdescription")
    WebElement tagline;
    @FindBy(id = "siteurl")
    WebElement wpaddressurl;
    @FindBy(id = "home")
    WebElement siteaddressurl;
    @FindBy(id = "admin_email")
    WebElement emailaddress;
    @FindBy(id ="users_can_register")
    WebElement membership;
    @FindBy(id ="default_role")
    WebElement role;
    @FindBy(id ="timezone_string")
    WebElement timezone;
    @FindBy(xpath = ".//*[@id='wpbody-content']/div[3]/form/table/tbody/tr[9]/td/fieldset/label[1]/span")
    WebElement dateformat;
    @FindBy(xpath =".//*[@id='wpbody-content']/div[3]/form/table/tbody/tr[10]/td/fieldset/label[1]/input")
    WebElement timeformat;
    @FindBy(id="start_of_week")
    WebElement week;
    @FindBy(id="WPLANG")
    WebElement sitelanguage;
    @FindBy(id="submit")
    WebElement savechanges;

    public Settings(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setSitetitle(String sitetitletext){
        sitetitle.clear();
        sitetitle.sendKeys(sitetitletext);
    }

    public void setTagline(String taglinetext){
        tagline.clear();
        tagline.sendKeys(taglinetext);
    }

    public void setWpaddressurl(String wpaddressurltext){
        wpaddressurl.clear();
        wpaddressurl.sendKeys(wpaddressurltext);
    }

    public void setSiteaddressurl(String siteaddressurltext){
        siteaddressurl.clear();
        siteaddressurl.sendKeys(siteaddressurltext);
    }

    public void setEmailaddress(String emailaddresstext){
        emailaddress.clear();
        emailaddress.sendKeys(emailaddresstext);
    }

    public void setMembership(){
        membership.click();
    }

    public void setRole(String roletext){
        Select dropdown = new Select(role);
        dropdown.selectByVisibleText(roletext);
    }

    public void setTimezone(String timezonetext){
        Select dropdown = new Select(timezone);
        dropdown.selectByVisibleText(timezonetext);
    }

    public void setDateformat(){
        dateformat.click();
    }

    public void setTimeformat(){
        timeformat.click();
    }

    public void setWeek(String weektext){
        Select dropdown = new Select(week);
        dropdown.selectByVisibleText(weektext);
    }

    public void setSitelanguage(String sitelanguagetext){
        Select dropdown = new Select(sitelanguage);
        dropdown.selectByVisibleText(sitelanguagetext);
    }

    public void setSavechanges(){
        savechanges.click();
    }
}
