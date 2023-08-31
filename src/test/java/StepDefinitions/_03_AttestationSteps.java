package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNavBar;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class _03_AttestationSteps {

    DialogContent dc=new DialogContent();

    LeftNavBar lb=new LeftNavBar();
    @Given("Navigate to Attestation")
    public void navigateToAttestation() {
      lb.clickMethod(lb.HumanResourcesButton);
      lb.clickMethod(lb.SetUpButton);
      lb.clickMethod(lb.AttestationsButton);
    }

    @Then("Attestation Should not be added")
    public void attestationShouldNotBeAdded() {
        dc.assertText(dc.NotToAddAttestation,"The Attestation with Name lesson1 already exists.");
    }
}

