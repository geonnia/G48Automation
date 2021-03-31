import org.junit.Before;
import org.junit.Test;

public class getTabNamesOfProject extends BaseTest{

    private LoginPage login;
    private MainPage mainPage;
    private ProjectPage projectPage;

    @Before
    public void setUp(){
        login = new LoginPage(driver);
        mainPage = new MainPage(driver);
        projectPage = new ProjectPage(driver);

    }

    @Test
    public void getTabNames() throws InterruptedException {
       login.login(System.getProperty("username"), System.getProperty("password"));
       mainPage.searchLocal("BKuso/G48Automation");
       projectPage.getTabNamesofProject();
    }


}
