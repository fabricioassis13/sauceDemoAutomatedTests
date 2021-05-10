package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FinishPage {
    private WebDriver driver;
    private Waits waits;

    public FinishPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement getFinishOrderLabel(){
        return waits.visibilityOfElement(By.className("complete-header"));
    }
}
