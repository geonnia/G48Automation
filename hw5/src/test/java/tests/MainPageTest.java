package tests;

import org.junit.Before;
import org.junit.Test;
import pages.MainPage;


public class MainPageTest extends BaseTest{

    private MainPage mainPage;


    @Before
    public void setUp(){
        mainPage = new MainPage(driver);

    }

    @Test
    public void checkLogin() throws InterruptedException {
        mainPage.search("BKuso/G48Automation");


    }
}
