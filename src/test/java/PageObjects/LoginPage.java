package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    //Mapeando elementos pela anotação @FindBy, utilizando atributos (PageFactory pattern)

    @FindBy(how = How.ID, using = "user-name")//Utilizando how.locator/using
    public WebElement userNameTextField;

    @FindBy(name = "password")//Utilizando locator
    public WebElement passwordTextField;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
