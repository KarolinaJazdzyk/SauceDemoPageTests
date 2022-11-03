package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class LoginTest extends BaseTest {

    @Test
    public void logInValidTest() {
        WebElement productsHeader = new HomePage(driver)
                .loginValidData("standard_user", "secret_sauce")
                .getProductsHeader();

        Assert.assertEquals(productsHeader.getText(), "PRODUCTS");
    }

    @Test
    public void logInInvalidUserTest() {
        WebElement error = new HomePage(driver)
                .loginInvalidData("standard", "secret_sauce")
                .getErrorMessage();

        Assert.assertTrue(error.getText().contains("Username and password do not match any user in this service"));
    }

    @Test
    public void logInInvalidPasswordTest() {
        WebElement error = new HomePage(driver)
                .loginInvalidData("standard_user", "secret")
                .getErrorMessage();

        Assert.assertTrue(error.getText().contains("Username and password do not match any user in this service"));
    }

    @Test
    public void logInLockedUserTest() {
        WebElement error = new HomePage(driver)
                .loginInvalidData("locked_out_user", "secret_sauce")
                .getErrorMessage();

        Assert.assertTrue(error.getText().contains("Sorry, this user has been locked out."));
    }

}
