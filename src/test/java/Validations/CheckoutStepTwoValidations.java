package Validations;

import Framework.Report;
import Framework.Screenshot;
import Tasks.TasksAbstraction;
import Utils.FileOperations;
import Utils.Highlights;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class CheckoutStepTwoValidations extends TasksAbstraction {
    private WebDriver driver;

    public CheckoutStepTwoValidations(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void validateTotalShopping(){
        try{

            Assertions.assertTrue(verifyEqualityOfValues());

            Highlights.highLighterMethod(driver, checkoutStepTwoPage.getTotalShoppingValue(), "blue");
            Report.log(Status.PASS, "Total da compra calculado com sucesso!", Screenshot.fullPageBase64(driver));
        }catch (Exception e){
            Report.log(Status.FAIL, "Falha no cálculo do total da compra!", Screenshot.fullPageBase64(driver));
        }
    }

    private boolean verifyEqualityOfValues(){
        String taxString = checkoutStepTwoPage.getItemTaxValue().getText().substring(6);
        String itemTotalString = FileOperations.getProperties("data").getProperty("sauceLabsBackpackValue");
        String totalShoppingActualString = checkoutStepTwoPage.getTotalShoppingValue().getText().substring(8);

        float taxNum = Float.parseFloat(taxString);
        float itemTotal = Float.parseFloat(itemTotalString);
        float totalShoppingActual = Float.parseFloat(totalShoppingActualString);
        float totalShoppingExpected = taxNum + itemTotal;

        if(totalShoppingActual == totalShoppingExpected){
            return true;
        }else {
            return false;
        }
    }

    public void validateOrderFinished(){
        try{
            String label = finishPage.getFinishOrderLabel().getText();

            Highlights.highLighterMethod(driver, finishPage.getFinishOrderLabel(), "red");
            Assertions.assertEquals("THANK YOU FOR YOUR ORDER", label);
            Report.log(Status.PASS, "Compra finalizada com sucesso!", Screenshot.fullPageBase64(driver));
        }catch (Exception e){
            Report.log(Status.FAIL, "Falha ao finalizar a compra!", Screenshot.fullPageBase64(driver));
        }
    }

}
