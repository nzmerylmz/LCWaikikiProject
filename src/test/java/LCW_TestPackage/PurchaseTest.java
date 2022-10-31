package LCW_TestPackage;

import org.testng.annotations.Test;

public class PurchaseTest extends TestBase {

    LCWakikiSteps lcw;

    @Test
    void test() {
        lcw = new LCWakikiSteps(driver);
        lcw.verifyWebsite();
        lcw.hoverOverHomeLifeCategory();
        lcw.verifyHomeLifeCategory();
        lcw.kitchenItemsClick();
        lcw.verifyKitchenItems();
        lcw.choseItemClick();
        lcw.verifyChosenItemDisplayed();
        lcw.addToCartBtnClick();
        lcw.verifyAddToCart();
        lcw.shoppingCartClick();
        lcw.verifyShoppingCart();
        lcw.goToHomePage();
        lcw.verifyHomePage();
    }
}
