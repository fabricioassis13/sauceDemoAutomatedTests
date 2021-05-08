package Validations;

import Framework.Report;
import Framework.Screenshot;
import Tasks.TasksAbstraction;
import Utils.Highlights;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginValidations extends TasksAbstraction {
    private WebDriver driver;

    public LoginValidations(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void validateLoginSuccess(){
        try{
            String label = inventoryPage.getProductsHeaderTextLabel().getText();
            Assertions.assertEquals("PRODUCTS", label);
            Highlights.highLighterMethod(driver, inventoryPage.getProductsHeaderTextLabel());
            Report.log(Status.PASS, "Login realizado!", Screenshot.fullPageBase64(driver));
        }catch (Exception e){
            Report.log(Status.FAIL, "Login falhou!", Screenshot.fullPageBase64(driver));
        }
    }
}
