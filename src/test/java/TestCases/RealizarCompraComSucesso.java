package TestCases;

import Framework.Report;
import Framework.ReportType;
import Framework.TestBase;
import PageObjects.CheckoutStepOnePage;
import PageObjects.CheckoutStepTwoPage;
import Tasks.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RealizarCompraComSucesso extends TestBase {

    private WebDriver driver = getDriver();

    private LoginTask loginTask = new LoginTask(driver);
    private InventoryTask inventoryTask = new InventoryTask(driver);
    private InventoryItemTask inventoryItemTask = new InventoryItemTask(driver);
    private CartTask cartTask = new CartTask(driver);
    private CheckoutStepOneTask checkoutStepOneTask = new CheckoutStepOneTask(driver);
    private CheckoutStepTwo checkoutStepTwo = new CheckoutStepTwo(driver);

    @Test
    public void realizarCompraComSucesso(){
        Report.createTest("Realizar compra com sucesso!", ReportType.SINGLE);

        loginTask.doLogin();
        inventoryTask.clickInSauceLabsBackpack();
        inventoryItemTask.addSauceLabsBackpackToCart();
        inventoryItemTask.goToCart();
        cartTask.saveSauceLabsBackpackValue();
        cartTask.goToCheckout();
        checkoutStepOneTask.fillCadastrationFields();
        checkoutStepOneTask.continueShopping();
        checkoutStepTwo.finishOrder();
    }
}
