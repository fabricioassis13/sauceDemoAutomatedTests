package Tasks;

import Framework.Waits;
import PageObjects.LoginPage;
import Validations.LoginValidations;
import org.openqa.selenium.WebDriver;

public class LoginTask extends LoginValidations {

    private WebDriver driver;

    private Waits waits;

    public LoginTask(WebDriver driver) {
        super(driver);
        this.driver = driver;
        waits = new Waits(driver);
    }

    public void doLogin(){
        waits.loadElement(loginPage.userNameTextField);
        loginPage.userNameTextField.sendKeys("standard_user");
        loginPage.passwordTextField.sendKeys("secret_sauce");
        loginPage.loginButton.click();

        validateLoginSuccess();
    }
}
