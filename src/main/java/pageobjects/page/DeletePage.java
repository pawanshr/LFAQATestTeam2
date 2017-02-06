package pageobjects.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by thapa on 1/29/2017.
 */
public class DeletePage {

    WebDriver driver;

    @FindBy (id ="bulk-action-selector-top")
    WebElement choose;

    @FindBy (id="doaction")
    WebElement apply;

    @FindBy(id="cb-select-all-1")
    WebElement checkbox;

    @FindBy (linkText = "Undo")
    WebElement undo;

    public DeletePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public void clickoncheckbox(){
        checkbox.click();
    }

    public void chooseaction(String actiontext){
        Select dropdown = new Select(choose);
        dropdown.selectByVisibleText(actiontext);

    }

    public void applyaction(){
        JavascriptExecutor js = ((JavascriptExecutor) driver);

        js.executeScript("scroll(0, -250);");

        WebDriverWait w = new WebDriverWait(driver,15);
        w.until(ExpectedConditions.elementToBeClickable(apply));
        apply.click();
    }
    public String pagedeleted(){
        String confirmation = undo.getText();
        return confirmation;
    }

}
