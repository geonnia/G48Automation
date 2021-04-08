package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LoginPage extends BasePage {

    private final By loginField = By.name("login");
    private final By passwordField = By.name("password");
    private final By submitButton = By.name("commit");
    private final By errorMessageText = By.xpath("//div[@class = 'flash flash-full flash-error ']/div");

    private static final String title = "Login Page";
    public LoginPage(WebDriver driver, String title) {
        super(driver, title);
    }

    public MainPage login(String username, String password){
        driver.findElement(loginField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(submitButton).click();
        LOG.info("The authorization is success");
        return new MainPage(driver, title);
    }

    public LoginPage validateErrorMessage(String errorMessage){
        waitFor25.until(visibilityOf(driver.findElement(errorMessageText)));
        Assert.assertEquals(errorMessage, driver.findElement(errorMessageText).getText());
        return this;
    }

}
