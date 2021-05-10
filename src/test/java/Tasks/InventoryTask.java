package Tasks;

import Validations.InventoryValidations;
import org.openqa.selenium.WebDriver;

public class InventoryTask extends InventoryValidations {
    private WebDriver driver;

    public InventoryTask(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void clickInSauceLabsBackpack(){
        inventoryPage.getSauceLabsBackpackImageLink().click();
        validateNextPage();
    }
}
