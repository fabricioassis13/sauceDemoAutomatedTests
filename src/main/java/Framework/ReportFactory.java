package Framework;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import java.io.File;

public class ReportFactory {

    public static WebDriver driver;
    public static final String PATH_REPORT = System.getProperty("user.dir") + File.separator + "Report"
            + File.separator + "Report_" + DateTime.getDateTimeFormatReport();
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extentReports;

    protected synchronized static ExtentReports getInstance(){
        if(extentReports == null){
            configReportExtent();
        }

        return extentReports;
    }

    public static void configReportExtent(){
        CreateFolder.creteFolderReport(PATH_REPORT);

        htmlReporter = new ExtentHtmlReporter(PATH_REPORT + File.separator + "MyReport_" + DateTime.getDateTimeFormatReport() + ".html");
        htmlReporter.config().setDocumentTitle("Relatório de Execução da Automação");
        htmlReporter.config().setReportName("Relatório de Execução dos Testes");
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setEncoding("UTF-8");
        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");

        extentReports = new ExtentReports();

        extentReports.attachReporter(htmlReporter);
    }
}
