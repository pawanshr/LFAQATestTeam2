package tests.dashoard;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import pageobjects.dashboard.Dashboard;
import tests.BaseTest;
import tests.BaseTestLogin;


/**
 * Created by superuser on 1/22/2017.
 */
public class DashboardTest extends BaseTestLogin {
    @Test
    public void testThatDashboardLinkWorks(){

        Dashboard dashboard=new Dashboard(driver);
        String heading =dashboard.getSomeText();
        dashboard.gotohomeLink();
        Assert.assertEquals("Dashboard",heading);

    }

    @Test
    public void testThatSettingsGeneralPageOpens(){
        (new Dashboard(driver)).gotoSettings();
    }

    @After
    public void teardown(){

    }
}
