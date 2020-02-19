package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.RegisterPage;

public class RegisterTest extends BaseClass{

    @Test(description = "Registers the user with a new account")
    public void testRegister() {
         String name = "Name";
         String surname = "Surname";
         String password = "abc123";

         RegisterPage page = PageFactory.initElements(driver, RegisterPage.class);

         page.goToMailPage();
         page.copyMail();
         page.goToRegisterPage();
         page.enterMail();
         page.enterData(name, surname, password);
         page.agreeToTermsAndConditions();
         page.clickRegisterButton();

         Assert.assertEquals(page.getRegisteredAlert(),"×\nVaša registracija je uspješno završena");
    }
}
