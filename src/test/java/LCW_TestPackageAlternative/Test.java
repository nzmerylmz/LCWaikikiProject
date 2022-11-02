package LCW_TestPackageAlternative;

import LCW_TestPackageAlternative.Pages.HomePage;
import LCW_TestPackageAlternative.Pages.ItemPage;
import LCW_TestPackageAlternative.Pages.KitchenItemPage;
import LCW_TestPackageAlternative.Pages.ShoppingCartPage;

public class Test extends TestBase{

    HomePage hp;
    ItemPage ip;
    KitchenItemPage ki;
    ShoppingCartPage sc;

    @org.testng.annotations.Test
    void test(){
        hp=new HomePage(driver);
        ip=new ItemPage(driver);
        ki=new KitchenItemPage(driver);
        sc=new ShoppingCartPage(driver);
        hp.verifyWebsite();
        hp.hoverOverHomeLifeCategory();
        hp.verifyHomeLifeCategory();
        hp.kitchenItemsClick();
        ip.verifyKitchenItems();
        ip.choseItemClick();
        ki.verifyChosenItemDisplayed();
        ki.addToCartBtnClick();
        ki.verifyAddToCart();
        ki.shoppingCartClick();
        sc.verifyShoppingCart();
        sc.goToHomePage();
        hp.verifyHomePage();
    }
}
