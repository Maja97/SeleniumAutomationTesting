package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class SearchAndAddTest extends BaseClass{


    @Test(description = "Searches for items using the website's searchbox and adds the item to the cart")
    public void testSearchAndAdd() {
        String itemName = "gradski bicikl";

        HomePage page = PageFactory.initElements(driver, HomePage.class);

        page.searchForItems(itemName);
        page.chooseFirstSearchItem();
        page.increaseQuantity();
        page.addToCart();
        page.proceedToDeliveryChoice();

        Assert.assertEquals(page.getCartTitle().substring(0,8),"Košarica");
    }
}
