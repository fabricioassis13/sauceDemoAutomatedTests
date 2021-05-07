package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
    private WebDriver driver;
    private WebDriverWait wait;

    public Waits(WebDriver driver) {
        wait = new WebDriverWait(driver, 20);
    }

    public WebElement visibilityOfElement(By by){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public WebElement loadElement(WebElement element){
        try{
            return wait.until(ExpectedConditions.visibilityOf(element));
        }catch (WebDriverException e){
            return element;
        }
    }
}
