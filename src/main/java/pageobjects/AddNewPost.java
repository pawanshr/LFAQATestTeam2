package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Genelia on 18/01/2017.
 */
public class AddNewPost {

    WebDriver driver;

    private WebElement title = driver.findElement(By.id("title"));

    //private WebElement media = driver.findElement(By.id("insert-media-buttons"));

    private WebElement paragraph = driver.findElement(By.id("tinymce"));

    private WebElement publish = driver.findElement(By.id("publish"));




    public AddNewPost (WebDriver driver)

    {
        this.driver = driver;

    }

    public doAddNewPost() {

      title.sendKeys("chandagiri is beautiful");
      paragraph.sendKeys("chandagiri is located in thankot .you can view changagiri hills by cable car");
      publish.click();


    }
}




