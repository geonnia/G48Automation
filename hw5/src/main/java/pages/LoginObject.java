package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginObject extends BasePage{

    public LoginObject(WebDriver driver){
        super(driver);
    }

    private final By link = By.partialLinkText("Sign in");
    private final By loginField = By.name("login");
    private final By passwordField = By.name("password");
    private final By commitButton = By.name("commit");





    public void login(String username, String password){
        driver.findElement(link).click();
        waitFor25.until(ExpectedConditions.visibilityOf(driver.findElement(loginField)));
        driver.findElement(loginField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(commitButton).click();
    }
}
