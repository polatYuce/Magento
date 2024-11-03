package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class _02_LoginSteps {
    DialogContent dc = new DialogContent();

    @When("Enter email and password and click login button")
    public void enterEmailAndPasswordAndClickLoginButton() {
        dc.myClick(dc.signIn);
        if (GWD.getDriver().getCurrentUrl().equals("https://magento.softwaretestingboard.com/customer/account/create/")) {
            dc.myClick(dc.signIn);
            dc.mySendKeys(dc.emailLogIN, "dc8221sdfasd123@gmail.com");
            dc.mySendKeys(dc.passwordLogIN, "Bursa16121311");
            dc.myClick(dc.logIn);
        }
        dc.mySendKeys(dc.emailLogIN, "dc8221sdfasd123@gmail.com");
        dc.mySendKeys(dc.passwordLogIN, "Bursa16121311");
        dc.myClick(dc.logIn);



    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {

        if (GWD.getDriver().equals("https://magento.softwaretestingboard.com/customer/account/")) {
            GWD.getDriver().get("https://magento.softwaretestingboard.com/");
        }
        dc.LoginContainsText(dc.loginWelcome, "Welcome");
    }

    @When("Enter email as {string} and password as {string} and click login button")
    public void enterEmailAsAndPasswordAsAndClickLoginButton(String email1, String password1) {
        dc.myClick(dc.signIn);
        dc.mySendKeys(dc.emailLogIN, email1);
        dc.mySendKeys(dc.passwordLogIN, password1);
        dc.myClick(dc.logIn);
    }

    @Then("User should login Negatif")
    public void userShouldLoginNegatif() {
        dc.LoginContainsText(dc.mesaj, "Please wait and try again later.");

    }
}
