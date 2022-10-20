package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage {

    private WebDriver driver;


    @FindBy (xpath = "//div[@class='summary_value_label' and text()='FREE PONY EXPRESS DELIVERY!']")
    private WebElement shippingInformation;

    public OverviewPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebElement getShippingInformation() {
        return shippingInformation;
    }


}
