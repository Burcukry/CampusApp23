package Pages;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import Utilities.ParameterDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends MyMethods {
    public DialogContent() {

        PageFactory.initElements(ParameterDriver.getDriver(),this);
    }

    @FindBy(xpath="//input[@placeholder='Username']")
    public WebElement username;
    @FindBy(xpath="//input[@placeholder='Password']")
    public WebElement password;
    @FindBy(xpath="//span[normalize-space()='LOGIN']")
    public WebElement loginButton;
    @FindBy(xpath="//span[normalize-space()='Dashboard']")
    public WebElement dashBoard;

    @FindBy(css="input[data-placeholder='Name']")
    public WebElement NameInput;

    @FindBy(xpath="//span[text()='Search']")
    public WebElement SearchButton;

    @FindBy(xpath="(//span[@class='mat-mdc-button-touch-target'])[10]")
    public WebElement AddButton;

    @FindBy(xpath="(//input[@data-placeholder='Name'])[2]")
    public WebElement NameButtonSecond;

    @FindBy(xpath="//span[text()='Save']")
    public WebElement SaveButton;

    @FindBy(xpath= "//div[@class='hot-toast-message']/div")
    public WebElement SuccessMessage;

    @FindBy(xpath = "//div[text()=' There is no data to display ']")
    public WebElement NoDataDisplayMessage;



    @FindBy(xpath="//div[@class='hot-toast-message']//div/dynamic-view")
    public WebElement ErrorMessage;

    @FindBy(xpath="//button[@color='accent']")
    public WebElement EditButton;

    @FindBy(xpath="//div[@class='hot-toast-message']//div/dynamic-view")
    public WebElement UpdatedMessage;

    @FindBy(xpath = "//mat-error[text()=' This field cannot be left blank!']")
    public WebElement UpdateMessageError;

    @FindBy (xpath="//button[@color='warn']")
    public WebElement DeleteButton;


    @FindBy(xpath="//span[normalize-space()='Delete']")
    public WebElement DeleteButtonClick;

    @FindBy(xpath="//span[normalize-space()='Cancel']")
    public WebElement CancelButton;

    @FindBy(xpath = "(//td[@role='cell'])[2]")
    public WebElement SamePositionVisible;

    @FindBy(xpath="//div[text()='The Attestation with Name \"lesson1\" already exists.']")
    public WebElement NotToAddAttestation;


}




