package Tasks;

import Utils.FileOperations;
import Validations.CartValidations;
import org.openqa.selenium.WebDriver;

public class CartTask extends CartValidations {
    private WebDriver driver;

    public CartTask(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void saveSauceLabsBackpackValue(){
        String sauceLabsBackpackValue = cartPage.getSauceLabsBackpackValue().getText();
        sauceLabsBackpackValue = sauceLabsBackpackValue.substring(1);
        FileOperations.setProperties("data", "sauceLabsBackpackValue", sauceLabsBackpackValue);
    }

    public void goToCheckout(){
        cartPage.getCheckoutButton().click();
        validateNextPage();
    }
}
