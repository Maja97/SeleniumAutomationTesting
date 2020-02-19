package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class ClearBasketTest extends BaseClass{

    @Test(description = "Add the item to the cart and then deletes it")
    public void testClearBasket() {
        String itemName = "samsung";

        HomePage page = PageFactory.initElements(driver, HomePage.class);

        page.searchForItems(itemName);
        page.chooseFirstSearchItem();
        page.addToCart();
        page.proceedToDeliveryChoice();

        page.deleteFromBasket();

        Assert.assertEquals(page.getProductDeletedAlert(),"×\nProizvod je uklonjen iz vaše košarice.");
    }
}
