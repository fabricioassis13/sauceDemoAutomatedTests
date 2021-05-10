package Validations;

import Framework.Report;
import Framework.Screenshot;
import Tasks.TasksAbstraction;
import Utils.Highlights;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class InventoryValidations extends TasksAbstraction {

    private WebDriver driver;

    public InventoryValidations(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    protected void validateNextPage(){
        try{
            String label = inventoryItemPage.getItemLabel().getText();
            Assertions.assertEquals("Sauce Labs Backpack", label);
            Highlights.highLighterMethod(driver, inventoryItemPage.getItemLabel(), "red");
            Report.log(Status.PASS, "Passou para a próxima página com sucesso!", Screenshot.fullPageBase64(driver));
        }catch (Exception e){
            Report.log(Status.FAIL, "Falha em carregar próxima página!", Screenshot.fullPageBase64(driver));
        }
    }
}
