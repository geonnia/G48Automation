import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class MainPage extends BaseProjectPage {

    public MainPage(WebDriver driver){
        super(driver);
    }


    private final By search = By.name("q");
    private final By dropdownGlobalLink = By.xpath("//li[@id='jump-to-suggestion-search-global']/a");
    private final By dropdownLocalLink = By.xpath("//form[@class='js-site-search-form']//a[contains(@href ,'geonnia/G48Automation')] ");
    //private final By resultProjectLink = By.cssSelector("li.repo-list-item:first-child a.v-align-middle");

    public SearchResultPage searchLocal(String searchQuery) throws InterruptedException {
        waitFor25.until(elementToBeClickable(search));
        driver.findElement(search).sendKeys(searchQuery);
        waitFor25.until(elementToBeClickable(dropdownLocalLink)).click();

        return new SearchResultPage(driver);
    }

    public SearchResultPage searchGlobal(String searchQuery) throws InterruptedException {
        waitFor25.until(elementToBeClickable(search));
        driver.findElement(search).sendKeys(searchQuery);
        waitFor25.until(elementToBeClickable(dropdownGlobalLink)).click();
//        driver.findElement(resultProjectLink).click();
//        Thread.sleep(1000);
        return new SearchResultPage(driver);
    }


}
