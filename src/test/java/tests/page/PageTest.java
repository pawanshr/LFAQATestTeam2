package tests.page;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pageobjects.page.AddNewPage;
import pageobjects.dashboard.Dashboard;
import tests.BaseTest;

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

        Dashboard dashboard1=new Dashboard(driver);
        dashboard1.gotoPages();

        AddNewPage addNewPage1=new AddNewPage(driver);
        String title = addNewPage1.titleofpage();
        Assert.assertEquals("this is the title page",title);


    }
}
