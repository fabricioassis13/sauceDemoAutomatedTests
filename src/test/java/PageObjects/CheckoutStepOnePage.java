package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutStepOnePage {
    private WebDriver driver;
    private Waits waits;

    public CheckoutStepOnePage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement getCheckoutStepOneLabel(){
        return waits.visibilityOfElement(By.className("title"));
    }

    public WebElement getFirstNameTextField(){
        return waits.visibilityOfElement(By.id("first-name"));
    }

    public WebElement getLastNameTextField(){
        return waits.visibilityOfElement(By.id("last-name"));
    }

    public WebElement getPostalCode(){
        return waits.visibilityOfElement(By.id("postal-code"));
    }

    public WebElement getContinueButton(){
        return waits.visibilityOfElement(By.id("continue"));
    }
}
