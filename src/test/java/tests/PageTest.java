package tests;

import org.junit.Test;
import pageobjects.AddNewPage;
import pageobjects.Dashboard;

/**
 * Created by Ujjwal on 1/23/2017.
 */
public class PageTest extends BaseTest{
    @Test
    public void testThatAddPageWorks(){
        login.setUsername("admin");
        login.setPassword("admin");
        login.setLogin();



        Dashboard dashboard=new Dashboard(driver);
        dashboard.gotoPages();
        dashboard.gotoAddNewPage();

        AddNewPage addNewPage=new AddNewPage(driver);
        addNewPage.doAddtitle("pagetitle");
        addNewPage.addpagecontent("pagecontent");
        addNewPage.dopublishpage();


    }
}
