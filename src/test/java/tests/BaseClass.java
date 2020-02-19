package tests;

import drivers.WebDriverFactory;
import enums.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utilities.Screenshot;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class BaseClass {
    public WebDriver driver = null;

  @BeforeTest
  public void initialize(){
      driver = WebDriverFactory.getDriver(DriverType.CHROME);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.manage().window().maximize();
  }

    @AfterMethod
    public void afterResult(ITestResult result) throws IOException
    {
        if(result.getStatus() == ITestResult.FAILURE)
        {
            Screenshot screenshot = new Screenshot(driver);
            screenshot.takeScreenshot(result.getMethod().getMethodName());
        }
    }

    @AfterTest
    public void tearDown()
    {
        if(driver != null) {
            driver.quit();
        }
    }
}
