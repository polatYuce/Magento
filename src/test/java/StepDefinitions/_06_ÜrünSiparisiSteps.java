package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.*;
import io.cucumber.java.en.When;

public class _06_ÜrünSiparisiSteps {
    DialogContent dc=new DialogContent();
    @When("Odemeyi yapman gerekiyor")
    public void odemeyiYapmanGerekiyor() {
        dc.myClick(dc.sepet);
        dc.myClick(dc.EditCart);
        dc.myClick(dc.Checkout);
        dc.myClick(dc.tik);
        dc.myClick(dc.next);
        dc.myClick(dc.PlaceOrder);
    }

    @Then("Başarıyla sipariş verilmesi lazım")
    public void başarıylaSiparişVerilmesiLazım() {
        dc.LoginContainsText(dc.ürünAlınıd,"Thank you for your purchase!");
    }
}
