package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class CheckoutTest extends BaseTest {

    @Test
    public void Checkout() {
        WebElement shippingInfo = new HomePage(driver)
                .loginValidData("standard_user", "secret_sauce")
                .addToCart()
                .getCartPage()
                .checkout()
                .setFirstName("Anna")
                .setLastName("Nowak")
                .setPostalCode("51112")
                .clickContinue()
                .getShippingInformation();

        Assert.assertEquals(shippingInfo.getText(), "FREE PONY EXPRESS DELIVERY!");

    }

    @Test
    public void completeOrder() {
        WebElement completeHeader = new HomePage(driver)
                .loginValidData("standard_user", "secret_sauce")
                .addToCart()
                .getCartPage()
                .checkout()
                .setFirstName("Anna")
                .setLastName("Nowak")
                .setPostalCode("51112")
                .clickContinue()
                .clickFinish()
                .getCompleteHeader();

        Assert.assertEquals(completeHeader.getText(), "THANK YOU FOR YOUR ORDER");

    }
}
