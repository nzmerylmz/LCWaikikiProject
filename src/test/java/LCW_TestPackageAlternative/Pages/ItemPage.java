package LCW_TestPackageAlternative.Pages;

import LCW_TestPackageAlternative.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemPage extends TestBase {

    public ItemPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
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

}
