package Tasks;

import Validations.CheckoutStepTwoValidations;
import org.openqa.selenium.WebDriver;

public class CheckoutStepTwo extends CheckoutStepTwoValidations {
    private WebDriver driver;

    public CheckoutStepTwo(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void finishOrder(){
        validateTotalShopping();
        checkoutStepTwoPage.getFinishButton().click();
        validateOrderFinished();
    }
}
