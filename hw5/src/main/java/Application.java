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


        driver.findElement(By.name("login")).sendKeys("oksana.wonderland@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Rododendrone1!");
        driver.findElement(By.name("commit")).click();

        //driver.findElement(By.id("dashboard-repos-filter-left")).click();
        driver.findElement(By.id("dashboard-repos-filter-left")).sendKeys("G48Automation");
        Thread.sleep(200);
        driver.findElement(By.cssSelector("ul.filterable-active li:first-child a")).click();

        //driver.findElement(By.xpath("//summary[contains(@aria-label, \"View\")]")).click();
        //driver.findElement(By.xpath("//details-menu[@class="dropdown-menu"]/a[contains(@aria-label, \"repositories\")]")).click();

        driver.findElement(By.cssSelector("[title='pom.xml']")).click();
        Thread.sleep(1000);
        String version = driver.findElement(By.id("LC25")).getText();
        LOG.info(driver.findElement(By.id("LC25")).getText());


        //List<WebElement> elements = driver.findElements(By.xpath(".highlight.tab-size.js-file-line-container > tbody"));
        //table[@class="highlight tab-size js-file-line-container"]/tbody/tr/td/span[contains(text(), "version")]


        driver.quit();
        String originVersion = "3.141.59";

       // String version = "3.141.59";

        if(originVersion.equals(version)){
            LOG.info("The version is up-to-date");

        }
        else{
            LOG.info("The version of selenium driver isn't " + originVersion);
        }
    }
}
