package Tasks;

import Validations.InventoryItemValidations;
import org.openqa.selenium.WebDriver;

public class InventoryItemTask extends InventoryItemValidations {
    private WebDriver driver;

    public InventoryItemTask(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void addSauceLabsBackpackToCart(){
        inventoryItemPage.getAddToCartSauceLabsBackpack().click();
        validateItemAddedToCart();
    }

    public void goToCart(){
        inventoryItemPage.getCartButton().click();
        validateNextPageLabel();
    }
}
