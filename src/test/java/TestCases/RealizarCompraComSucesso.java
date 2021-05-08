package TestCases;

import Framework.Report;
import Framework.ReportType;
import Framework.TestBase;
import Tasks.LoginTask;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RealizarCompraComSucesso extends TestBase {

    private WebDriver driver = getDriver();

    private LoginTask loginTask = new LoginTask(driver);

    @Test
    public void realizarCompraComSucesso(){
        Report.createTest("Realizar compra com sucesso!", ReportType.SINGLE);

        loginTask.doLogin();
    }
}
