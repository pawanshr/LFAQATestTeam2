package tests.dashoard;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pageobjects.dashboard.Dashboard;
import tests.BaseTestLogin;


/**
 * Created by superuser on 1/22/2017.
 */
public class DashboardTest extends BaseTestLogin {
    private Dashboard dashboard;

    @Before
    public void setup() {
        super.setup();
        dashboard = new Dashboard(driver);
    }

    @Test
    public void testThatDashboardLinkWorks(){
        String heading =dashboard.getSomeText();
        dashboard.gotoDashboardHomeLink();
        Assert.assertEquals("Dashboard",heading);
    }

    @Test
    public void testThatVisitSiteWorks() {
        dashboard.gotoVisitSiteLink();
    }

    @Test
    public void testThatSettingsGeneralOpensPage(){
        dashboard.gotoSettingsGeneral();
    }

    @Test
    public void testThatAddNewPostLinkOpensPage() {
        dashboard.gotoAddNewPost();
    }

    @Test
    public void testThatAddNewPageLinkOpensPage() {
        dashboard.gotoAddNewPage();
    }

    @Test
    public void testThatAddNewUsersOpensPage() {
        dashboard.gotoAddNewUser();
    }
}
