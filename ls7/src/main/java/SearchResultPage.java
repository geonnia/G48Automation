import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SearchResultPage extends BaseProjectPage {

    public SearchResultPage(WebDriver driver){
        super(driver);
    }

    private final By resultProjectLink = By.cssSelector("li.repo-list-item:first-child a.v-align-middle");

    public ProjectPage choosingProject() throws InterruptedException {
        driver.findElement(resultProjectLink).click();
        Thread.sleep(1000);
        return new ProjectPage(driver);
    }

}