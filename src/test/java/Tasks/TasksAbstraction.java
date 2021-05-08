package Tasks;

import PageObjects.InventoryPage;
import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;

public class TasksAbstraction {

    protected LoginPage loginPage;
    protected InventoryPage inventoryPage;

    public TasksAbstraction(WebDriver driver){
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
    }
}
