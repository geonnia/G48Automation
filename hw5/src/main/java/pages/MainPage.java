package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class MainPage extends BasePage{

    public MainPage(WebDriver driver){
        super(driver);
    }

    private final By search = By.name("q");
    private final By dropdownLink = By.xpath("//form[@class='js-site-search-form']//a[contains(@href ,'BKuso/G48Automation')] ");
    //private final By searchResultLink = By.xpath("//ul[@class='repo-list']//a[contains(@href ,'BKuso/G48Automation')] ')] ");


    public ProjectPage search(String searchQuery){
        waitFor25.until(elementToBeClickable(search));
        driver.findElement(search).sendKeys(searchQuery);
        waitFor25.until(elementToBeClickable(dropdownLink)).click();

        return new ProjectPage(driver);
    }


}
