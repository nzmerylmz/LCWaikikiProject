package LCW_TestPackageAlternative.Pages;

import LCW_TestPackageAlternative.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
    public HomePage(WebDriver driver) {
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
    @FindBy(css = "#_sorun_icon_img")
    private WebElement verifyHomePage;

    public void verifyHomePage(){
        verifyElementDisplayed(verifyHomePage);
    }
}
