package Tasks;

import Models.NewUserModel;
import Utils.FakersGenerator;
import Utils.FileOperations;
import Validations.CheckoutStepOneValidations;
import org.openqa.selenium.WebDriver;

public class CheckoutStepOneTask extends CheckoutStepOneValidations {

    private WebDriver driver;
    private NewUserModel newUserModel;

    public CheckoutStepOneTask(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void fillCadastrationFields(){
        newUserModel = generateNewUser();
        saveUser(newUserModel);

        checkoutStepOnePage.getFirstNameTextField().sendKeys(newUserModel.getFirstName());
        checkoutStepOnePage.getLastNameTextField().sendKeys(newUserModel.getLastName());
        checkoutStepOnePage.getPostalCode().sendKeys(newUserModel.getPostalCode());
    }

    public void continueShopping(){
        checkoutStepOnePage.getContinueButton().click();
        validateNewPage();
    }

    private NewUserModel generateNewUser(){
        return new NewUserModel(
                FakersGenerator.getFirstName(),
                FakersGenerator.getLastName(),
                FakersGenerator.getPostalCode()
        );
    }

    private void saveUser(NewUserModel newUser){
        FileOperations.setProperties("userData", "firstName", newUser.getFirstName());
        FileOperations.setProperties("userData", "lastName", newUser.getLastName());
        FileOperations.setProperties("userData", "postalCode", newUser.getPostalCode());
    }
}
