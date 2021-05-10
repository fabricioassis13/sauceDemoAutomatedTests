package Validations;

import Framework.Report;
import Framework.Screenshot;
import Tasks.TasksAbstraction;
import Utils.Highlights;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class InventoryItemValidations extends TasksAbstraction {

    private WebDriver driver;

    public InventoryItemValidations(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    protected void validateItemAddedToCart(){
        try{
            String label = inventoryItemPage.getRemoveLabel().getText();
            Highlights.highLighterMethod(driver, inventoryItemPage.getRemoveLabel(), "blue");
            Assertions.assertEquals("REMOVE", label);
            Report.log(Status.PASS, "Sauce Labs Backpack adicionada com sucesso!", Screenshot.fullPageBase64(driver));
        }catch (Exception e){
            Report.log(Status.FAIL, "Falha ao adicionar Sauce Labs Backpack", Screenshot.fullPageBase64(driver));
        }
    }

    protected void validateNextPageLabel(){
        try {
            String label = cartPage.getCartLabel().getText();
            Highlights.highLighterMethod(driver, cartPage.getCartLabel(), "red");
            Assertions.assertEquals("YOUR CART", label);
            Report.log(Status.PASS, "Ir ao carrinho com sucesso!", Screenshot.fullPageBase64(driver));
        }catch (Exception e){
            Report.log(Status.FAIL, "Erro em ir ao carrinho!", Screenshot.fullPageBase64(driver));
        }
    }
}
