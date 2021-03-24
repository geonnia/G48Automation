package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class ProjectPage extends BasePage{
    public ProjectPage(WebDriver driver){
        super(driver);
    }

    private final By xmlDocLink = By.cssSelector("[title='pom.xml']");
    private final By seleniumVersion = By.id("LC65");
    private String seleniumVersionString;
    private String originVersion = "3.141.59";
    private String versionCut = "";

    public ProjectPage gettingVersion() throws InterruptedException {
        waitFor1000.until(elementToBeClickable(driver.findElement(xmlDocLink))).click();
        driver.findElement(xmlDocLink).click();
        Thread.sleep(1000);
        //waitFor1000.until(visibilityOf(driver.findElement(seleniumVersion)));
        seleniumVersionString = driver.findElement(seleniumVersion).getText();
        LOG.info(seleniumVersionString);



        for (int i = 0; i < seleniumVersionString.length(); i++) {
            if (Character.isDigit(seleniumVersionString.charAt(i)) || seleniumVersionString.charAt(i) == '.') {
                versionCut += seleniumVersionString.charAt(i);
            }

        }

        System.out.println(versionCut);
        if(originVersion.equals(versionCut)){
            LOG.info("The version is up-to-date");

        }
        else{
            LOG.info("The version of selenium driver isn't " + originVersion);
        }
        return this;
    }

}
