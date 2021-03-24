package tests;

import org.junit.Before;
import org.junit.Test;
import pages.LoginObject;
import pages.MainPage;
import pages.ProjectPage;

public class PageProjectTest extends BaseTest{
    private ProjectPage projectPage;

    @Before
    public void setUp(){
        projectPage = new ProjectPage(driver);

    }

    @Test
    public void checkLogin() throws InterruptedException {
        projectPage.gettingVersion();

    }
}
