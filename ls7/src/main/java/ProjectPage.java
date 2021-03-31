import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.*;


public class ProjectPage extends BasePage{
    public ProjectPage(WebDriver driver){
        super(driver);
    }

    private final By tabName = By.xpath("//nav//span[@data-content]");


    public void getTabNamesofProject(){
        List <WebElement> tabNamesList = driver.findElements(tabName);
        for(WebElement webElement: tabNamesList){
            LOG.info(webElement.getText());
        }
    }

}
