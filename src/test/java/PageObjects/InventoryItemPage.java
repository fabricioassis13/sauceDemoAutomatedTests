package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryItemPage {

    private WebDriver driver;
    private Waits waits;

    public InventoryItemPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement getItemLabel(){
        return waits.visibilityOfElement(By.cssSelector(".inventory_details_name.large_size"));
    }

    public WebElement getAddToCartSauceLabsBackpack(){
        return waits.visibilityOfElement(By.id("add-to-cart-sauce-labs-backpack"));
    }

    public WebElement getRemoveLabel(){
        return waits.visibilityOfElement(By.id("remove-sauce-labs-backpack"));
    }

    public WebElement getCartButton(){
        return waits.visibilityOfElement(By.className("shopping_cart_link"));
    }
}
