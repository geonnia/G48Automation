package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginObject;

public abstract class BaseTest {
    protected WebDriver driver;
    @Before
    public void init(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/");

    }
    @After
    public void exit(){
        driver.quit();
    }
}
