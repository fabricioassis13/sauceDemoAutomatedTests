package PageObjects;

import Framework.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;
    private Waits waits;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
    }

    public WebElement getUserNameTextField(){
        return waits.visibilityOfElement(By.id("user-name"));
    }

    public WebElement getPasswordTextField(){
        return waits.visibilityOfElement(By.name("password"));
    }

    public WebElement getLoginButton(){
        return waits.visibilityOfElement(By.id("login-button"));
    }
}
