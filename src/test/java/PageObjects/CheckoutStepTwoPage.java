package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutStepTwoPage {
    private WebDriver driver;
    private Waits waits;

    public CheckoutStepTwoPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement getCheckoutStepTwoLabel(){
        return waits.visibilityOfElement(By.className("title"));
    }

    public WebElement getItemTaxValue(){
        return waits.visibilityOfElement(By.className("summary_tax_label"));
    }

    public WebElement getTotalShoppingValue(){
        return waits.visibilityOfElement(By.className("summary_total_label"));
    }

    public WebElement getFinishButton(){
        return waits.visibilityOfElement(By.id("finish"));
    }
}
