package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class NavigationAndFilterTest extends BaseClass{

    @Test(description = "Searches for specific items by filtering results and adds the item to the cart")
    public void testNavigationAndFilter() throws InterruptedException{

        HomePage page = PageFactory.initElements(driver, HomePage.class);

        page.clickGamesOnNavBar();
        Thread.sleep(500);
        page.filterPrice();
        Thread.sleep(500);
        page.filterPlatforms();
        Thread.sleep(500);
        page.filterGenres();
        Thread.sleep(500);
        page.filterAgeRestriction();
        Thread.sleep(500);
        page.chooseGame();
        page.addToCart();

        Assert.assertTrue(page.getAddedToCartWindow().getSize().width !=0);
    }
}
