import org.apache.bcel.generic.NEW;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.AddNewUser;
import org.openqa.selenium.support.PageFactory;
import pageobjects.AddNewPage;
import pageobjects.AddNewPost;
import pageobjects.Dashboard;
import pageobjects.Login;

/**
 * Created by Ujjwal on 1/18/2017.
 */
public class TestExecutor {

    public static void main(String[] args) {


        System.setProperty("webdriver.firefox.marionette","C:\\LeapFrog\\geckodriver.exe");


        WebDriver driver=new FirefoxDriver();
        driver.get("http://localhost/wordpress/wp-admin");

        Login login = new Login(driver);
        PageFactory.initElements(driver,login);
        login.setUsername();
        login.setPassword();
        login.setLogin();

        Dashboard dashboard=new Dashboard(driver);
        PageFactory.initElements(driver,dashboard);

        dashboard.gotoPosts();
        dashboard.gotoAddNewPost();

        //for AddNewUser page
        AddNewUser addnewuser = new AddNewUser(driver);
        PageFactory.initElements(driver,addnewuser);
        addnewuser.setUsername();
        addnewuser.setEmail();
        addnewuser.setFirstname();
        addnewuser.setlastname();
        addnewuser.setPassword();
        addnewuser.setwebsite();
        addnewuser.setSendusernotification();
        addnewuser.setRole();
        addnewuser.setSubmitbutton();



        AddNewPost addNewPost=new AddNewPost(driver);
        addNewPost.doAddNewPost();

        AddNewPage addNewPage=new AddNewPage(driver);
        //addNewPage.doaddpage();
        addNewPage.dopublishpage();
        addNewPage.doAddtitle();
        addNewPage.addpagecontent();
        addNewPage.seepreview();






    }
}
