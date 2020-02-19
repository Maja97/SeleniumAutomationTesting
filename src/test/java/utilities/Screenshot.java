package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Screenshot {

    private WebDriver driver;

    public Screenshot(WebDriver driver){
        this.driver = driver;
    }

    public void takeScreenshot(String name) throws IOException {

        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy h-m-s");
        Date date = new Date();
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("D:\\Selenium logs\\" + name + "-"+ dateFormat.format(date) + ".png"));
    }
}
