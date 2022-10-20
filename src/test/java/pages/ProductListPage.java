package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage {

    @FindBy(xpath = "//span[text()='Products']")
    private WebElement productsHeader;


    //do sprawdzenia że jest 6 produktów
    @FindBy(xpath = "//div[@class='inventory_item']")
    private WebElement listOfProducts;

    @FindBy(id= "add-to-cart-sauce-labs-backpack")
    private WebElement addToCartButton;

    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    private WebElement cartBadge;

    @FindBy(className = "shopping_cart_link")
    private WebElement cartLink;

    private WebDriver driver;

    public ProductListPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebElement getProductsHeader() {
        return productsHeader;
    }

    public ProductListPage addToCart(){
        addToCartButton.click();
        return this;
    }

    public WebElement getCartBadge() {
        return cartBadge;
    }

    public CartPage getCartPage(){
        cartLink.click();
        return new CartPage(driver);

    }

}
