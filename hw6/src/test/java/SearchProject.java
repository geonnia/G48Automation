import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.*;

@RunWith(Parameterized.class)
public class SearchProject extends BaseTest{
    private LoginPage login;
    private MainPage mainPage;
    private ProjectPage projectPage;
    private SearchResultPage searchResultPage;

    private String projectName;

    public SearchProject(String projectName) {
        this.projectName = projectName;
    }

    @Parameterized.Parameters
    public static List<String> projectNames(){
        List<String> projectNamesList = new ArrayList<>();
        projectNamesList.add("sudoren/g48automation");
        projectNamesList.add("geonnia/G48Automation");
        projectNamesList.add("BKuso/G48Automation");
        projectNamesList.add("RomaMalanchuk/G48Automation");

        return projectNamesList;
    }

    @Before
    public void setUp(){
        login = new LoginPage(driver);
        mainPage = new MainPage(driver);
        projectPage = new ProjectPage(driver);

    }

    @Test
    public void searchProjectNames() throws InterruptedException {
        login.login(System.getProperty("username"), System.getProperty("password"));
        mainPage.searchGlobal(projectName);
        //searchResultPage.choosingProject();
    }
}
