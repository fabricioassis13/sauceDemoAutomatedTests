package Validations;

import Framework.Report;
import Framework.Screenshot;
import Tasks.TasksAbstraction;
import Utils.Highlights;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class CartValidations extends TasksAbstraction {
    private WebDriver driver;

    public CartValidations(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    protected void validateNextPage(){
        try{
            String label = checkoutStepOnePage.getCheckoutStepOneLabel().getText();
            Highlights.highLighterMethod(driver, checkoutStepOnePage.getCheckoutStepOneLabel(), "red");
            Assertions.assertEquals("CHECKOUT: YOUR INFORMATION", label);
            Report.log(Status.PASS, "Ir para Checkout formulário com sucesso!!", Screenshot.fullPageBase64(driver));
        }catch (Exception e){
            Report.log(Status.FAIL, "Falha ao prosseguir a compra!", Screenshot.fullPageBase64(driver));
        }
    }
}
