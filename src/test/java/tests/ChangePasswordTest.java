package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class ChangePasswordTest extends BaseClass{


    @Test(description = "Logs the user in the account and changes the account password")
    public void testChangePassword() {
        String password = "abc123";
        String newPassword = "123abc";
        String mail = "giovonni.danyel@eellee.org";

        LoginPage page = PageFactory.initElements(driver, LoginPage.class);

        page.enterMail(mail);
        page.enterPassword(password);
        page.clickLoginButton();

        page.checkMyProfile();
        page.selectUpdatePassword();
        page.enterCurrentPassword(password);
        page.enterNewPassword(newPassword);
        page.updatePassword();

        Assert.assertEquals(page.getPasswordChangedAlert(),"×\nVaša lozinka je promijenjena");
    }
}