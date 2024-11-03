package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class _03_AdresEklemeSteps {
    DialogContent dc = new DialogContent();

    @Then("Go to My Account.")
    public void goToMyAccount() {
        dc.myClick(dc.sagTik);
        dc.myClick(dc.myAccount);
        dc.myClick(dc.manageAddresses);

    }

    @When("Enter your address details.Name as {string} surname as {string}  Company as {string} PhoneNumber as {string} StreetAddress as {string} City as {string} StateProvince as {string} Zip as{string} Country as {string} click save adrees button.")
    public void enterYourAddressDetailsNameAsSurnameAsCompanyAsPhoneNumberAsStreetAddressAsCityAsStateProvinceAsZipAsCountryAsClickSaveAdreesButton(String Name, String surname, String Company, String PhoneNumber, String StreetAddress, String City, String StateProvince, String Zip, String Country) {
        dc.myClick(dc.addNewAddress);
        dc.mySendKeys(dc.firstname, Name);
        dc.mySendKeys(dc.lastname, surname);
        dc.mySendKeys(dc.company, Company);
        Select select = new Select(dc.country);
        select.selectByValue("TR");
        dc.mySendKeys(dc.telephone, PhoneNumber);
        dc.mySendKeys(dc.street_1, StreetAddress);
        dc.mySendKeys(dc.city, City);
        dc.mySendKeys(dc.zip, Zip);
        dc.mySendKeys(dc.state, StateProvince);
        dc.myClick(dc.saveAddress);
    }

    @Then("User should saved the address successfully")
    public void userShouldSavedTheAddressSuccessfully() {
        dc.LoginContainsText(dc.mesaj, "saved the address");
    }

    @When("Correct your address details. ChangedName as {string} Changedsurname as {string} click save adrees button.")
    public void correctYourAddressDetailsChangedNameAsChangedsurnameAsClickSaveAdreesButton(String ChangedName, String Changedsurname) {
        dc.myClick(dc.edit);
        dc.mySendKeys(dc.firstname, ChangedName);
        dc.mySendKeys(dc.lastname, Changedsurname);
        dc.myClick(dc.saveAddress);
        dc.LoginContainsText(dc.mesaj, "saved the address");
    }

    @When("Adress delete")
    public void adressDelete() {
        dc.myClick(dc.delete);
        dc.myClick(dc.oK);

    }

    @Then("User should deleted the address successfully")
    public void userShouldDeletedTheAddressSuccessfully() {
        dc.LoginContainsText(dc.mesaj, "deleted");

    }
}
