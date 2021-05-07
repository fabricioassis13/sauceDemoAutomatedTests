package Framework;

import Utils.FileOperations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class TestBase extends DriverManager{
    private static WebDriver driver;

    public static WebDriver getDriver(){
        driver = getDriver(TypeDriver.CHROME);
        return driver;
    }

    @BeforeEach
    public void setUp(){
        String index = FileOperations.getProperties("url").getProperty("url.index");

        getDriver().get(index);
    }

    @AfterEach
    public void tearDown(){
        quitDriver();
    }
}
