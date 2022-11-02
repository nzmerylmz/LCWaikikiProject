package LCW_TestPackageAlternative.Pages;

import LCW_TestPackageAlternative.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitchenItemPage extends TestBase {

    public KitchenItemPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
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
}
