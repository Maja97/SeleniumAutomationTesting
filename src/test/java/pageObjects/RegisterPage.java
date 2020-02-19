package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    private WebDriver driver;

    @FindBy(id = "register.title")
    WebElement titleDropDown;

    @FindBy(id = "register.firstName")
    WebElement nameInputBox;

    @FindBy(id = "register.lastName")
    WebElement surnameInputBox;

    @FindBy(id = "register.email")
    WebElement emailInputBox;

    @FindBy(id = "password")
    WebElement passwordInputBox;

    @FindBy(id = "register.checkPwd")
    WebElement passwordConfirmBox;

    @FindBy(xpath = "//*[@id=\"registerForm\"]/div[10]/button")
    WebElement registerButton;

    @FindBy(id = "registerChkTermsConditions")
    WebElement agreeToTermsButton;

    @FindBy(xpath = "/html/body/div[2]/div[3]/div[2]/div[1]/a")
    WebElement copyMailButton;

    @FindBy(xpath = "/html/body/main/div[5]/div[1]/div")
    WebElement alert;

    public RegisterPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void goToMailPage(){
        driver.navigate().to("https://www.minuteinbox.com/");
    }

    public void copyMail(){
        copyMailButton.click();
    }

    public void goToRegisterPage(){
        driver.navigate().to("https://www.ekupi.hr/hr/login");
    }

    public void enterMail(){
        emailInputBox.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
    }

    public void enterData(String name, String surname,String password){
        titleDropDown.click();
        Select dropDownTitle = new Select(driver.findElement(By.name("titleCode")));
        dropDownTitle.selectByVisibleText("gđa.");
        nameInputBox.sendKeys(name);
        surnameInputBox.sendKeys(surname);
        passwordInputBox.sendKeys(password);
        passwordConfirmBox.sendKeys(password);
    }


    public void agreeToTermsAndConditions(){
        agreeToTermsButton.click();
    }

    public void clickRegisterButton()
    {
        registerButton.click();
    }

    public String getRegisteredAlert(){
        return alert.getText();
    }
}
