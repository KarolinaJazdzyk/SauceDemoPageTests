package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class LoginTest extends BaseTest {

    @Test
    public void logInTest() {
        WebElement productsHeader = new HomePage(driver)
                .loginValidData("standard_user", "secret_sauce")
                .getProductsHeader();

        Assert.assertEquals(productsHeader.getText(), "PRODUCTS");
    }
}
