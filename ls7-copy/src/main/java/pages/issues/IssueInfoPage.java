package pages.issues;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BaseProjectPage;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class IssueInfoPage extends BaseProjectPage {

    private static final String title = "Issue Info Page";
    public IssueInfoPage(WebDriver driver, String title) {
        super(driver, title);
    }

    private final By issueTitle = By.xpath("//span[@class = 'js-issue-title markdown-title']");
    private final By body = By.xpath("//td[@class = 'd-block comment-body markdown-body  js-comment-body']");

    private final By labels = By.xpath("//a[@class = 'IssueLabel hx_IssueLabel d-inline-block v-align-middle']");

    public IssueInfoPage validateIssue(String expectedTitle,
                                       String expectedBody,
                                       List<String> expectedLabels){
        assertEquals(expectedTitle, waitFor10.until(visibilityOf(driver.findElement(issueTitle))).getText());
        assertEquals(expectedBody, driver.findElement(body).getText());

        List<WebElement> labelsOnPage =  driver.findElements(labels);
        List<String> labelsTitles = new ArrayList<>();
        labelsOnPage.forEach(label -> {
            assertTrue(expectedLabels.contains(label.getText()));
            labelsTitles.add(label.getText());
        });
        assertEquals(expectedLabels, labelsTitles);
        return this;
    }

}
