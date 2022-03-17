package platforms.api;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.testng.annotations.Test;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@RunWith(Cucumber.class)
@CucumberOptions(
       features = {"src/test/features/api"},
       tags = {"@regression"},
        glue = {"platforms.api.StepDefinitions"},
        dryRun =false,
        format = {"pretty"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/ApiReports/api.html"}
        , monochrome = true)

@Test
public class Api_runner {

    @org.junit.AfterClass
    public static void writeExtentReport() throws IOException {

        Reporter.loadXMLConfig(new File(System.getProperty("user.dir")+ "/extent-api-config.xml"));
        Reporter.loadXMLConfig("extent-api-config.xml");
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;

            while((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }
}