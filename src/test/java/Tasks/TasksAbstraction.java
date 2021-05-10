package Tasks;

import PageObjects.*;
import org.openqa.selenium.WebDriver;

public class TasksAbstraction {

    protected LoginPage loginPage;
    protected InventoryPage inventoryPage;
    protected InventoryItemPage inventoryItemPage;
    protected CartPage cartPage;
    protected CheckoutStepOnePage checkoutStepOnePage;
    protected CheckoutStepTwoPage checkoutStepTwoPage;
    protected FinishPage finishPage;

    public TasksAbstraction(WebDriver driver){
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
        inventoryItemPage = new InventoryItemPage(driver);
        cartPage = new CartPage(driver);
        checkoutStepOnePage = new CheckoutStepOnePage(driver);
        checkoutStepTwoPage = new CheckoutStepTwoPage(driver);
        finishPage = new FinishPage(driver);
    }
}
