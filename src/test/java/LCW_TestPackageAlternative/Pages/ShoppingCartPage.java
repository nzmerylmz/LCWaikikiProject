package LCW_TestPackageAlternative.Pages;

import LCW_TestPackageAlternative.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends TestBase {
    public ShoppingCartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
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
}
