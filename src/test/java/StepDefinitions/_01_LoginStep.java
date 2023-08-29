package StepDefinitions;

import Pages.DialogContent;
import Utilities.ParameterDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _01_LoginStep {

    DialogContent dc=new DialogContent();

    @Given("Navigate to website")
    public void navigateToWebsite() {
        ParameterDriver.getDriver().get("https://test.mersys.io/");

    }

    @When("Enter user name and password")
    public void enterUserNameAndPassword() {
        dc.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        dc.username.sendKeys("turkeyts");
        dc.password.sendKeys("TechnoStudy123");

    }

    @And("Click onLogin Button")
    public void clickOnLoginButton() {
        dc.loginButton.click();
    }

    @Then("User should be login successfully")
    public void userShouldBeLoginSuccessfully() {
        dc.assertText(dc.dashBoard,"Dashboard");
    }

    }
