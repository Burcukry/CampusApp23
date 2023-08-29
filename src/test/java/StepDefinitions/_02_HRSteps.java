package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavBar;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.MDC;

public class _02_HRSteps {

    LeftNavBar lb = new LeftNavBar();
    DialogContent dc = new DialogContent();

    @When("Navigate to Human Resources Set Up Position Categories")
    public void navigateToHumanResourcesSetUpPositionCategories() {
        lb.clickMethod(lb.HumanResourcesButton);
        lb.clickMethod(lb.SetUpButton);
        lb.waitUntilVisible(lb.PositionsCategoriesButton);
        lb.clickMethod(lb.PositionsCategoriesButton);

    }

    @Then("Enter a position name into name text field")
    public void enterAPositionNameIntoNameTextField() {

        dc.waitUntilVisible(dc.NameInput);
        dc.NameInput.sendKeys("Sales Manager");
    }

    @And("Click on Search Button")
    public void clickOnSearchButton() {
        dc.waitUntilVisible(dc.SearchButton);
        dc.clickMethod(dc.SearchButton);
    }

    @And("Click on Add Button")
    public void clickOnAddButton() {

        dc.waitUntilVisible(dc.AddButton);
        dc.clickMethod(dc.AddButton);
        dc.NameButtonSecond.sendKeys("Sales Manager");
        dc.SaveButton.click();
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.assertText(dc.SuccessMessage, "successfully");
    }
}
