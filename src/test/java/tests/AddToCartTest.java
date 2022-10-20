package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;


public class AddToCartTest extends BaseTest {

    @Test
    public void AddToCart() {
        WebElement cartBadge = new HomePage(driver)
                .loginValidData("standard_user", "secret_sauce")
                .addToCart().getCartBadge();


        Assert.assertEquals(cartBadge.getText(), "1");
    }

}
