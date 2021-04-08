package pages.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BaseProjectPage;

public class CodePage extends BaseProjectPage {
    private static final String title = "Code Page";
    public CodePage(WebDriver driver, String title) {
        super(driver, title);
    }

    private final By commitMessageText = By.xpath("//a[@data-test-selector = 'commit-tease-commit-message']");

    public CodePage showCommitMessage(){
        LOG.info(driver.findElements(commitMessageText).get(0).getText());
        return this;
    }

}
