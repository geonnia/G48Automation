

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class IssuesPage extends BaseProjectPage {

    public IssuesPage(WebDriver driver) {
        super(driver);
    }

    private final By newIssueButton = By.xpath("//span[text() = 'New issue']");

    public WritingIssueDetailsPage openCreationPage(){
        driver.findElement(newIssueButton).click();
        return new WritingIssueDetailsPage(driver);
    }
}