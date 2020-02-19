package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;


public class LoginTest extends BaseClass{


    @Test(description = "Logs the user in the existing account")
    public void testLogin() {
        String password = "abc123";
        String mail = "giovonni.danyel@eellee.org";
        String username = "NAME";

        LoginPage page = PageFactory.initElements(driver, LoginPage.class);

        page.enterMail(mail);
        page.enterPassword(password);
        page.clickLoginButton();


        Assert.assertEquals(page.getWelcomeText(), "DOBRODOŠLI "+ username);
    }

}
