package tests.settingsTest;

import org.junit.Test;
import pageobjects.dashboard.Dashboard;
import pageobjects.settings.Settings;
import tests.BaseTestLogin;

/**
 * Created by superuser on 2/4/2017.
 */
public class SettingsTest extends BaseTestLogin {
    @Test
    public void testThatSettingsWorks(){
        Dashboard dashboard = new Dashboard(driver);
        dashboard.gotoSettingsGeneral();

        Settings settings = new Settings(driver);
        settings.setSitetitle("Career Academy");
        settings.setTagline("this is my project");
        settings.setWpaddressurl("");
        settings.setSiteaddressurl("");
        settings.setEmailaddress("bikthapa41@gmail.com");
        settings.setMembership();
        settings.setRole("Administrator");
        settings.setTimezone("UTC+5:45");
        settings.setDateformat();
        settings.setTimeformat();
        settings.setWeek("Sonntag");
        settings.setSitelanguage("English (United States)");
        settings.setSavechanges();
    }
}

