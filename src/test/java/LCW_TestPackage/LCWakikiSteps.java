package LCW_TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LCWakikiSteps extends TestBase {

    public LCWakikiSteps(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#_sorun_icon_img")
    private WebElement verifyWebsite;

    public void verifyWebsite(){
        verifyElementDisplayed(verifyWebsite);
    }

    @FindBy(xpath = "//a[contains(text(),'EV & YAŞAM')]")
    private WebElement homeLifeCategory;

    public void hoverOverHomeLifeCategory(){
        hoverFunction(homeLifeCategory);
    }

    @FindBy(xpath = "//a[contains(text(),'MUTFAK')]")
    private WebElement verifyHomeLifeCategory;

    public void verifyHomeLifeCategory(){
        verifyElementDisplayed(verifyHomeLifeCategory);
    }

    @FindBy(xpath = "//a[contains(text(),'MUTFAK')]")
    private WebElement kitchenItems;

    public void kitchenItemsClick(){
        clickFunction(kitchenItems);
    }

    @FindBy(css = "button.toggle-filter-area-button")
    private WebElement verifyKitchenItems;

    public void verifyKitchenItems(){
        verifyElementDisplayed(verifyKitchenItems);
    }

    @FindBy(xpath = "(//div[contains(@class, 'product-card--one-of-4')])[1]")
    private WebElement chosenItem;

    public void choseItemClick(){
        clickFunction(chosenItem);
    }

    @FindBy(css = "#add-to-favorite-detail")
    private WebElement verifyChosenItemDisplayed;

    public void verifyChosenItemDisplayed(){
        verifyElementDisplayed(verifyChosenItemDisplayed);
    }

    @FindBy(xpath = "(//a[contains(text(),'SEPETE EKLE')])[2]")
    private WebElement addToCartBtn;

    public void addToCartBtnClick(){
        clickFunction(addToCartBtn);
    }

    @FindBy(xpath = "//a[contains(text(),'SEPETE EKLENDİ')]")
    private WebElement verifyAddToCart;

    public void verifyAddToCart(){
        verifyElementDisplayed(verifyAddToCart);
    }

    @FindBy(xpath = "//span[contains(text(),'Sepetim')]")
    private WebElement shoppingCart;

    public void shoppingCartClick(){
        clickFunction(shoppingCart);
    }

    @FindBy(xpath = "//a[contains(text(),'ÖDEME ADIMINA GEÇ')]")
    private WebElement verifyShoppingCart;

    public void verifyShoppingCart(){
        verifyElementDisplayed(verifyShoppingCart);
    }

    @FindBy(xpath = "(//*[@xmlns='http://www.w3.org/2000/svg'])[1]")
    private WebElement goToHomePage;

    public void goToHomePage(){
        clickFunction(goToHomePage);
    }

    @FindBy(css = "#_sorun_icon_img")
    private WebElement verifyHomePage;

    public void verifyHomePage(){
        verifyElementDisplayed(verifyHomePage);
    }
}





