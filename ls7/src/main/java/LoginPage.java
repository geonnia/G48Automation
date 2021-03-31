import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver){
        super(driver);
    }

    private final By loginField = By.name("login");
    private final By passwordField = By.name("password");
    private final By commitButton = By.name("commit");





    public MainPage login(String username, String password){
        waitFor25.until(ExpectedConditions.visibilityOf(driver.findElement(loginField)));
        driver.findElement(loginField).sendKeys(username);
        waitFor25.until(ExpectedConditions.visibilityOf(driver.findElement(passwordField)));
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(commitButton).click();
        return new MainPage(driver);
    }

}
