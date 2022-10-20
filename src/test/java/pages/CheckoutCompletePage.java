package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletePage {


    @FindBy(className = "complete-header")
    private WebElement completeHeader;

    private WebDriver driver;

    public CheckoutCompletePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebElement getCompleteHeader() {
        return completeHeader;
    }
}
