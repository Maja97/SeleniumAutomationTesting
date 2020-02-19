package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    @FindBy(xpath = "/html/body/main/header/nav[3]/div/ul[2]/li[2]/span[1]/a")
    WebElement electronicsItem;

    @FindBy(xpath = "/html/body/main/header/nav[3]/div/ul[2]/li[2]/div/div/div[3]/ul/li[2]/a")
    WebElement gamesItem;

    @FindBy(xpath = "//*[@id=\"product-facet\"]/div[1]/div[2]/ul/li[3]/form/label/span/span[1]")
    WebElement priceCheckBox;

    @FindBy(xpath = "//*[@id=\"product-facet\"]/div[3]/div[2]/ul/li[2]/form/label/span/span[1]")
    WebElement platformCheckBox;

    @FindBy(xpath = "//*[@id=\"product-facet\"]/div[4]/div[2]/ul/li[1]/form/label/span/span[1]")
    WebElement genreCheckBox;

    @FindBy(xpath = "//*[@id=\"product-facet\"]/div[6]/div[2]/ul/li[3]/form/label/span/span[1]")
    WebElement ageRestrictionCheckBox;

    @FindBy(xpath = "/html/body/main/div[5]/div[1]/div[2]/div/div/div[2]/div[1]/div/a")
    WebElement firstGameChoice;

    @FindBy(id = "js-site-search-input")
    WebElement searchTextBox;

    @FindBy(xpath = "//*[@id=\"ui-id-1\"]/li[1]")
    WebElement firstSearchItem;

    @FindBy(xpath = "/html/body/main/div[5]/div[2]/div[3]/div/div/div[2]/div/div/div[2]/div/div[1]/span[2]/button")
    WebElement increaseQuantityButton;

    @FindBy(id = "addToCartButton")
    WebElement addToCartButton;

    @FindBy(xpath = "//*[@id=\"addToCartLayer\"]/a[1]")
    WebElement proceedToDeliveryButton;

    @FindBy(xpath = "//*[@id=\"editEntry_0\"]/span")
    WebElement itemOptions;

    @FindBy(id = "actionEntry_0")
    WebElement removeFromBasketButton;

    @FindBy(xpath = "/html/body/main/div[5]/div[1]/div")
    WebElement alert;

    @FindBy(xpath = "/html/body/main/div[5]/div[3]/div[1]/div/div[1]/div/div[1]/h1")
    WebElement cartTitle;

    @FindBy(xpath = "//*[@id=\"cboxLoadedContent\"]")
    WebElement addedToCartWindow;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        driver.navigate().to("https://www.ekupi.hr/hr/");
    }

    public void clickGamesOnNavBar(){
        Actions action = new Actions(this.driver);
        action.moveToElement(this.electronicsItem).moveToElement(this.gamesItem).click().build().perform();
    }

    public void filterPrice(){
        priceCheckBox.click();
    }

    public void filterPlatforms(){
        platformCheckBox.click();
    }

    public void filterGenres(){
        genreCheckBox.click();
    }
    public void filterAgeRestriction(){
        ageRestrictionCheckBox.click();
    }

    public void chooseGame(){
        firstGameChoice.click();
    }

    public void searchForItems(String itemName){
        searchTextBox.sendKeys(itemName);
    }

    public void chooseFirstSearchItem(){
        firstSearchItem.click();
    }

    public void increaseQuantity(){
        increaseQuantityButton.click();
    }

    public void addToCart(){
        addToCartButton.click();
    }

    public void proceedToDeliveryChoice(){
        proceedToDeliveryButton.click();
    }

    public void deleteFromBasket(){
        itemOptions.click();
        removeFromBasketButton.click();
    }
    public String getProductDeletedAlert(){
        return alert.getText();
    }

    public String getCartTitle(){
        return cartTitle.getText();
    }

    public WebElement getAddedToCartWindow(){
        return addedToCartWindow;
    }
}
