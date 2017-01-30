package tests.page;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pageobjects.page.AddNewPage;
import pageobjects.dashboard.Dashboard;
import tests.BaseTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ujjwal on 1/23/2017.
 */
public class PageTest extends BaseTest {
    @Test
    public void testThatAddPageWorks(){
        login.setUsername("admin");
        login.setPassword("admin");
        login.setLogin();

        Dashboard dashboard=new Dashboard(driver);
        dashboard.gotoPages();
        dashboard.gotoAddNewPages();

        AddNewPage addNewPage=new AddNewPage(driver);
        addNewPage.doAddtitle("this is the title page");
        addNewPage.addpagecontent("this is where my content goes");
        addNewPage.dopublishpage();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        String title = addNewPage.titleofpage();
        Assert.assertEquals("Page published",title);


    }
}
