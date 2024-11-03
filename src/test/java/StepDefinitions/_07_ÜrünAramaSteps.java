package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class _07_ÜrünAramaSteps {
    DialogContent dc=new DialogContent();

    @When("ürün ara")
    public void ürünAra() {
        dc.mySendKeys(dc.ürünArama,"MJ08");
        dc.myClick(dc.tıklama);
        dc.myClick(dc.men);
        dc.myClick(dc.tops);
        dc.myClick(dc.Category);
        dc.myClick(dc.jackets);
        dc.myClick(dc.ceket);




    }

    @Then("Ürünün olduğunu doğrular")
    public void ürününOlduğunuDoğrular() {
        dc.LoginContainsText(dc.sku,"MJ08");
    }

    @When("Olmayan ürünü ara")
    public void olmayanÜrünüAra() {
        dc.ürünArama.sendKeys("asd",Keys.ENTER);
    }

    @Then("Ürünün olmadığını doğrula")
    public void ürününOlmadığınıDoğrula() {
        dc.LoginContainsText(dc.ürünYokMesajı,"no result");
    }
}
