import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class SearchResultPage extends BasePage{

    public SearchResultPage(WebDriver driver){
        super(driver);
    }
//
//    private final By resultProjectLink = By.cssSelector("li.repo-list-item:first-child a.v-align-middle");
//
//    public ProjectPage choosingProject(){
//        driver.findElement(resultProjectLink).click();
//        return new ProjectPage(driver);
//    }
//
}