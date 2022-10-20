package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerInformationPage {

    @FindBy(id = "first-name")
    private WebElement firstNameInput;

    @FindBy(id = "last-name")
    private WebElement lastNameInput;

    @FindBy(id = "postal-code")
    private WebElement postalCodeInput;

    @FindBy(id = "continue")
    private WebElement continueButton;


    private WebDriver driver;

    public CustomerInformationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public CustomerInformationPage setFirstName(String firstName) {
        firstNameInput.sendKeys(firstName);
        return this;
    }

    public CustomerInformationPage setLastName(String lastName) {
        lastNameInput.sendKeys(lastName);
        return this;
    }

    public CustomerInformationPage setPostalCode(String postalCode) {
        postalCodeInput.sendKeys(postalCode);
        return this;
    }

    public OverviewPage clickContinue() {
        continueButton.click();
        return new OverviewPage(driver);
    }


}

