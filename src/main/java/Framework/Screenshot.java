package Framework;

import com.assertthat.selenium_shutterbug.core.PageSnapshot;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.ScreenshotException;

import javax.imageio.ImageIO;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public class Screenshot {

    private static final String PATH_SCREENSHOT = ReportFactory.PATH_REPORT + File.separator + "Screenshot";

    public static MediaEntityModelProvider capture(WebDriver driver){
        try {
            CreateFolder.creteFolderReport(PATH_SCREENSHOT);
            File scrshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String screenshotPath = PATH_SCREENSHOT + File.separator + "Image_"
                    + DateTime.getDateTimeFormatScreenshot() + ".png";
            FileUtils.copyFile(scrshot, new File(screenshotPath));
            return MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build();
        }catch (IOException e){
            String message = "Ocorreu uma falha na captura de tela!";
            Report.log(Status.WARNING, message);
        }
        return null;
    }

    public static MediaEntityModelProvider fullPageBase64(WebDriver driver){
        try{
            PageSnapshot screenshot = Shutterbug.shootPage(driver);
            ByteArrayOutputStream stream = new ByteArrayOutputStream();

            ImageIO.write(screenshot.getImage(), "png", stream);
            String base64image = Base64.encodeBase64String(stream.toByteArray());

            return MediaEntityBuilder.createScreenCaptureFromBase64String(base64image).build();
        }catch (ScreenshotException | IOException e){
            String message = "Ocorreu uma falha na captura de tela.";
            Report.log(Status.WARNING, message);
        }

        return null;
    }
}
