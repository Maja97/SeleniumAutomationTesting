package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "j_username")
    WebElement mailInputBox;

    @FindBy(id = "j_password")
    WebElement passwordInputBox;

    @FindBy(xpath = "//*[@id=\"loginForm\"]/button")
    WebElement loginButton;

    @FindBy(xpath = "/html/body/main/header/nav[1]/div/div[2]/div/ul/li[2]/div[1]")
    WebElement myProfileButton;

    @FindBy(xpath = "//*[@id=\"accNavComponentDesktopOne\"]/ul/li[1]/a")
    WebElement updatePasswordChoice;

    @FindBy(id = "currentPassword")
    WebElement currentPasswordBox;

    @FindBy(id = "newPassword")
    WebElement newPasswordBox;

    @FindBy(id = "checkNewPassword")
    WebElement confirmPasswordBox;

    @FindBy(xpath = "//*[@id=\"updatePasswordForm\"]/div[4]/div[1]/div/button")
    WebElement updatePasswordButton;

    @FindBy(xpath = "/html/body/main/div[5]/div[1]/div")
    WebElement alert;

    @FindBy(xpath = "/html/body/main/header/nav[1]/div/div[2]/div/ul/li[1]")
    WebElement welcomeText;


    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        driver.navigate().to("https://www.ekupi.hr/hr/login");
    }

    public void enterMail(String mail){
        mailInputBox.sendKeys(mail);
    }

    public void enterPassword(String password){
        passwordInputBox.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public void checkMyProfile(){
        myProfileButton.click();
    }

    public void selectUpdatePassword(){
        updatePasswordChoice.click();
    }

    public void enterCurrentPassword(String password){
        currentPasswordBox.sendKeys(password);
    }

    public void enterNewPassword(String password){
        newPasswordBox.sendKeys(password);
        confirmPasswordBox.sendKeys(password);
    }

    public void updatePassword(){
        updatePasswordButton.click();
    }

    public String getPasswordChangedAlert(){
        return alert.getText();
    }

    public String getWelcomeText(){
        return welcomeText.getText();
    }
}
