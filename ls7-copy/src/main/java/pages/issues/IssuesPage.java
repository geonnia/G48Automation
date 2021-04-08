package pages.issues;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BaseProjectPage;

public class IssuesPage extends BaseProjectPage {

    private static final String title = "Issues Page";
    public IssuesPage(WebDriver driver, String title) {
        super(driver, title);
    }

    private final By newIssueButton = By.xpath("//span[text() = 'New issue']");

    public IssueCreationPage openCreationPage(){
        driver.findElement(newIssueButton).click();
        return new IssueCreationPage(driver, title);
    }
}
