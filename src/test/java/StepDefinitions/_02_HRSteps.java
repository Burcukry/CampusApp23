package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavBar;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.MDC;

import java.util.List;

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


    @And("Click on Search Button")
    public void clickOnSearchButton() {
        dc.waitUntilVisible(dc.SearchButton);
        dc.clickMethod(dc.SearchButton);
    }


    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {

        dc.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='hot-toast-message']/div")));
        dc.assertText(dc.SuccessMessage, "successfully");
    }

    @Given("Enter a position name into name text field")
    public void enterAPositionNameIntoNameTextField(DataTable dataTable) {
        dc.waitUntilVisible(dc.NameInput);
        List<String> datalist = dataTable.asList(String.class);
        dc.sendKeysMethod(dc.NameInput, datalist.get(0));
    }

    @And("User should see Tehre is no data to be displayed after seacrh")
    public void userShouldSeeTehreIsNoDataToBeDisplayedAfterSeacrh() {

        dc.assertText(dc.NoDataDisplayMessage, "There is no data to display");

    }

    @And("Click on Add Button")
    public void clickOnAddButton() {
        dc.waitUntilVisible(dc.AddButton);
        dc.clickMethod(dc.AddButton);
    }

    @And("Enter  a new position name into the text field")
    public void enterANewPositionNameIntoTheTextField(DataTable dataTable) {

        dc.waitUntilVisible(dc.NameButtonSecond);
        List<String> datalist = dataTable.asList(String.class);
        dc.sendKeysMethod(dc.NameButtonSecond, datalist.get(0));
    }

    @And("Click on Save Button")
    public void clickOnSaveButton() {
        dc.clickMethod(dc.SaveButton);
    }

    @Then("position categories should not be added")
    public void positionCategoriesShouldNotBeAdded() {

        dc.assertText(dc.ErrorMessage,"The Position Category with Name \"Sales Manager\" already exists");

    }
    @And("Enter same name into the text field")
    public void enterSameNameIntoTheTextField() {
        dc.sendKeysMethod(dc.NameButtonSecond,"Sales Manager");

    }

    @And("Click on Edit Button")
    public void clickOnEditButton() {

        dc.wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//button[@color='accent']"),1));
        dc.clickMethod(dc.EditButton);

    }

    @Then("Position should be updated")
    public void positionShouldBeUpdated() {
        dc.assertText(dc.UpdatedMessage,"Position Category successfully updated");
    }
}
