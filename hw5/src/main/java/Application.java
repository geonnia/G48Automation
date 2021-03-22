import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.concurrent.TimeUnit;

public class Application {
    private final static Logger LOG = LogManager.getLogger("TEST");

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driverChrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://github.com/");

        driver.findElement(By.partialLinkText("Sign in")).click();


        driver.findElement(By.name("login")).sendKeys("==YOUR LOGIN==");
        driver.findElement(By.name("password")).sendKeys("==YOUR PASSWORD==");
        driver.findElement(By.name("commit")).click();


        driver.findElement(By.name("q")).sendKeys("BKuso/G48Automation");
        Thread.sleep(1000);
        driver.findElement(By.partialLinkText("G48Automation")).click();
        driver.findElement(By.partialLinkText("G48Automation")).click();
        Thread.sleep(1000);



        driver.findElement(By.cssSelector("[title='pom.xml']")).click();
        Thread.sleep(1000);
        String version = driver.findElement(By.id("LC65")).getText();
        LOG.info(driver.findElement(By.id("LC65")).getText());

        driver.quit();
        String originVersion = "3.141.59";
        String versionCut = "";
        for (int i = 0; i < version.length(); i++) {
            if (Character.isDigit(version.charAt(i)) || version.charAt(i) == '.') {
                versionCut += version.charAt(i);
            }

        }

        System.out.println(versionCut);
        if(originVersion.equals(versionCut)){
            LOG.info("The version is up-to-date");

        }
        else{
            LOG.info("The version of selenium driver isn't " + originVersion);
        }
    }
}
