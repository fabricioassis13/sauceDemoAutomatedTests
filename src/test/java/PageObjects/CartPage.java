package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    private WebDriver driver;
    private Waits waits;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement getCartLabel(){
        return waits.visibilityOfElement(By.className("title"));
    }

    public WebElement getSauceLabsBackpackValue(){
        return waits.visibilityOfElement(By.className("inventory_item_price"));
    }

    public WebElement getContinueShoppingButton(){
        return waits.visibilityOfElement(By.id("continue-shopping"));
    }

    public WebElement getCheckoutButton(){
        return waits.visibilityOfElement(By.id("checkout"));
    }
}
