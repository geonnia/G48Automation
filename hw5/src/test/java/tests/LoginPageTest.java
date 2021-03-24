package tests;


import org.junit.Before;
import org.junit.Test;
import pages.LoginObject;
import pages.MainPage;
import pages.ProjectPage;

public class LoginPageTest extends BaseTest{

    private LoginObject login;
    private MainPage mainPage;
    private ProjectPage projectPage;

    @Before
    public void setUp(){
        login = new LoginObject(driver);
        mainPage = new MainPage(driver);
        projectPage = new ProjectPage(driver);

    }

    @Test
    public void checkLogin() throws InterruptedException {
        login.login(System.getProperty("username"), System.getProperty("password"));
        mainPage.search("BKuso/G48Automation");
        projectPage.gettingVersion();

    }


}
