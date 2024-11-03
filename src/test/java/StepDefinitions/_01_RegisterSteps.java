package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class _01_RegisterSteps {
    DialogContent dc = new DialogContent();

    @Given("Navigate to Magento")
    public void navigateToMagento() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
    }

    @When("Enter First Name,Last Name,Email,Password, Confirm Password and Create an Account button")
    public void enterFirstNameLastNameEmailPasswordConfirmPasswordAndCreateAnAccountButton() {
        dc.myClick(dc.createAnAccount);
        dc.mySendKeys(dc.firstname, "Team");
        dc.mySendKeys(dc.lastname, "Beş");
        dc.mySendKeys(dc.email, "dc8221sdfasd123@gmail.com");
        dc.mySendKeys(dc.password, "Bursa16121311");
        dc.mySendKeys(dc.passwordConfirmation, "Bursa16121311");
        dc.myClick(dc.registerAnAccount);
    }

    @Then("User should Register successfully")
    public void userShouldRegisterSuccessfully() {
        dc.LoginContainsText(dc.registeringSuccesfly, "Thank you for registering");
    }

    @When("Click Create an Account and back home page")
    public void clickCreateAnAccountAndBackHomePage() {
        dc.myClick(dc.logo);
    }

    @Then("User should back successfully")
    public void userShouldBackSuccessfully() {
        Assert.assertEquals(GWD.getDriver().getCurrentUrl(),"https://magento.softwaretestingboard.com/");
    }
}
