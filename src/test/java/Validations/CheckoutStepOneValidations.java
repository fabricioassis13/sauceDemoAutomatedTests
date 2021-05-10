package Validations;

import Framework.Report;
import Framework.Screenshot;
import Tasks.TasksAbstraction;
import Utils.Highlights;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class CheckoutStepOneValidations extends TasksAbstraction {

    private WebDriver driver;

    public CheckoutStepOneValidations(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    protected void validateNewPage(){
        try {
            String label = checkoutStepTwoPage.getCheckoutStepTwoLabel().getText();
            Assertions.assertEquals("CHECKOUT: OVERVIEW", label);
            Highlights.highLighterMethod(driver, checkoutStepTwoPage.getCheckoutStepTwoLabel(), "red");
            Report.log(Status.PASS, "Seguiu para Checkout: Overview com sucessp!", Screenshot.fullPageBase64(driver));
        }catch (Exception e){
            Report.log(Status.FAIL, "Falha ao prosseguir de Cadastro!", Screenshot.fullPageBase64(driver));
        }
    }
}
