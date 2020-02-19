package drivers;

import enums.DriverType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import static enums.DriverType.*;


public class WebDriverFactory {


    public static WebDriver getDriver(DriverType browser){
        WebDriver driver = null;
        if(CHROME.equals(browser)){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(FIREFOX.equals(browser)){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else if(OPERA.equals(browser)){
            WebDriverManager.operadriver().setup();
            driver = new OperaDriver();
        }
        else if(EDGE.equals(browser)){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        else if(IE.equals(browser)){
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }

        return driver;
    }
}
