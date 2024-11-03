package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _04_DataTable {
    DialogContent dc = new DialogContent();

    @And("Click on the Element in Dialog")
    public void clickOnTheElementInDialog(DataTable dtButonlar) {
        List<String> butonlar = dtButonlar.asList();

        for (int i = 0; i < butonlar.size(); i++) {
            dc.myClick(dc.getWebElement(butonlar.get(i)));  // Sevgili ln ben sana String adını göndreyeim sen bana WebElemente çevir
        }
    }


    @Then("The user should successfully open page.")
    public void theUserShouldSuccessfullyOpenPage() {
        dc.LoginContainsText(dc.sayfaAcılmışmı,"Home");

    }
}
