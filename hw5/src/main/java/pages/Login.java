package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    @FindBy(name = "login")
    private WebElement loginField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(name = "commit")
    private WebElement commitButton;

    public Login(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void login(String username, String password){
        loginField.sendKeys(username);
        passwordField.sendKeys(password);
        commitButton.click();
    }
}
