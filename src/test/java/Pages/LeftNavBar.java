package Pages;

import Utilities.MyMethods;
import Utilities.ParameterDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNavBar extends MyMethods {
    public LeftNavBar() {
        PageFactory.initElements(ParameterDriver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Human Resources']")
    public WebElement HumanResourcesButton;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    public WebElement SetUpButton;

    @FindBy(xpath = "(//span[@class='nav-link-title ng-star-inserted'])[26]")
    public WebElement PositionsCategoriesButton;

    @FindBy(xpath="//span[text()='Attestations']")
    public WebElement AttestationsButton;
}