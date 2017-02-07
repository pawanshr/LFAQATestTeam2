package tests.page;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pageobjects.page.AddNewPage;
import pageobjects.dashboard.Dashboard;
import pageobjects.page.DeletePage;
import tests.BaseTest;
import tests.BaseTestLogin;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ujjwal on 1/23/2017.
 */
public class PageTest extends BaseTestLogin {
    @Test
    public void testThatAddPageWorks (){

        Dashboard dashboard=new Dashboard(driver);
        dashboard.gotoAddNewPage();

        AddNewPage addNewPage=new AddNewPage(driver);
        addNewPage.doAddtitle("this is the title page");
        addNewPage.addpagecontent("this is where my content goes");


        addNewPage.dopublishpage();

        String title = addNewPage.titleofpage();
        Assert.assertEquals("Page published. View page",title);

    }
    @Test
    public void testthatDeletePageWorks(){
        Dashboard dashboard = new Dashboard(driver);

        DeletePage deletePage=new DeletePage(driver);
        deletePage.clickoncheckbox();
        deletePage.chooseaction("Move to Trash");
        deletePage.applyaction();

        String confirmation = deletePage.pagedeleted();
        Assert.assertEquals("Undo",confirmation);
    }
    @Test
    public void testthatAddPageWorkswithBlankTitle(){
        Dashboard dashboard=new Dashboard(driver);
        dashboard.gotoPages();
        dashboard.gotoAddNewPages();

        AddNewPage addNewPage=new AddNewPage(driver);
        addNewPage.doAddtitle("");
        addNewPage.addpagecontent("this is where my content goes");


        addNewPage.dopublishpage();

        String title = addNewPage.titleofpage();
        Assert.assertEquals("Page published. View page",title);
    }
    @Test
    public void testthatAddPageWorkswithBlankContent(){

        Dashboard dashboard=new Dashboard(driver);
        dashboard.gotoPages();
        dashboard.gotoAddNewPages();

        AddNewPage addNewPage=new AddNewPage(driver);
        addNewPage.doAddtitle("this is the title page");

        addNewPage.addpagecontent("");


        addNewPage.dopublishpage();

        String title = addNewPage.titleofpage();
        Assert.assertEquals("Page published. View page",title);

    }
    @Test
    public void testthatAddPageWorkswithBlankTitleandContent(){

        Dashboard dashboard=new Dashboard(driver);
        dashboard.gotoPages();
        dashboard.gotoAddNewPages();

        AddNewPage addNewPage=new AddNewPage(driver);
        addNewPage.doAddtitle("");
        addNewPage.addpagecontent("");


        addNewPage.dopublishpage();

        String title = addNewPage.titleofpage();
        Assert.assertEquals("Page published. View page",title);

    }
    @Test
    public void testthatAddPageWorkswithWhiteSpaceonTitle(){

        Dashboard dashboard=new Dashboard(driver);
        dashboard.gotoPages();
        dashboard.gotoAddNewPages();

        AddNewPage addNewPage=new AddNewPage(driver);
        addNewPage.doAddtitle("   ");
        addNewPage.addpagecontent("this is where my content goes");


        addNewPage.dopublishpage();

        String title = addNewPage.titleofpage();
        Assert.assertEquals("Page published. View page",title);

    }

}
