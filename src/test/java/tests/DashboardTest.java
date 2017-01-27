package tests;

import org.junit.Test;

/**
 * Created by superuser on 1/22/2017.
 */
public class DashboardTest extends BaseTest {
    @Test
    public void testThatDashboardLinkWorks(){

        login.setUsername("admin");
        login.setPassword("admin");
        login.setLogin();

        pageobjects.Dashboard dashboard = new pageobjects.Dashboard(driver);
        dashboard.gotohomeLink();



    }

}
