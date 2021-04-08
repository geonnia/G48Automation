package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{
    private static final String title = "Main Page";
    public HomePage(WebDriver driver, String title) {
        super(driver, title);
    }

    private final By homePageTitle = By.xpath("//h1");

    public void checkIsLogOut(){
        waitFor25.until(ExpectedConditions.visibilityOf(driver.findElement(homePageTitle)));
    }

}
