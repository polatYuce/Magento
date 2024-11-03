package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import Utilities.Tools;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class _05_SepeteEklemeSteps {
    DialogContent dc = new DialogContent();

    @When("Rastgale ürünü seç ve sepete ekle")
    public void rastgaleÜrünüSeçVeSepeteEkle() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
        int random = Tools.randomGenerator(dc.ürünler.size());
        System.out.println("random = " + random);

        int bedenlerRandom = Tools.randomGenerator(dc.bedenler.size());
        System.out.println("bedenlerRandom = " + bedenlerRandom);

        int renkRandom = Tools.randomGenerator(dc.renkSecimi.size());
        System.out.println("renkRandom = " + renkRandom);

        dc.myClick(dc.ürünler.get(random));

        if (dc.bedenler.size() > 0)
            dc.bedenler.get(bedenlerRandom).click();

        if (random == 2) {
            dc.myClick(dc.renkSecimi1);
            dc.myClick(dc.addToCard);
        }

        if (dc.renkSecimi.size() > 0)
            dc.renkSecimi.get(renkRandom).click();
        dc.myClick(dc.addToCard);
    }

    @Then("Başarıyla sepete eklenmiş olması laz")
    public void başarıylaSepeteEklenmişOlmasıLaz() {
        dc.LoginContainsText(dc.mesaj, "added");

    }

    @When("Sepete git ürünün sayısını değiştir")
    public void sepeteGitÜrününSayısınıDeğiştir() {
        if (!(GWD.getDriver().getCurrentUrl().equals("https://magento.softwaretestingboard.com/")))
            dc.myClick(dc.logo);

        dc.myClick(dc.sepet);
        dc.myClick(dc.düzenleme);

//        int random = Tools.randomGenerator(dc.sepetteEdit.size());
//        System.out.println("random = " + random);
//        if (!dc.sepetteEdit.isEmpty())
//            dc.sepetteEdit.get(random).sendKeys("2");

        int bedenlerRandom = Tools.randomGenerator(dc.bedenler.size());
        System.out.println("bedenlerRandom = " + bedenlerRandom);

        int renkRandom = Tools.randomGenerator(dc.renkSecimi.size());
        System.out.println("renkRandom = " + renkRandom);

        if (dc.bedenler.size() > 0)
            dc.bedenler.get(bedenlerRandom).click();

        if (dc.renkSecimi.size() > 0)
            dc.renkSecimi.get(renkRandom).click();

        dc.mySendKeys(dc.adetSayısı, "5");
//
        dc.myClick(dc.updateCart);

    }

    @Then("Başarıyla miktar değişmiş olması lazım")
    public void başarıylaMiktarDeğişmişOlmasıLazım() {
        dc.LoginContainsText(dc.mesaj, "updated");
    }

    @When("Sepete git ürünü sil")
    public void sepeteGitÜrünüSil() {
        GWD.getDriver().get("xhttps://magento.softwaretestingboard.com/");

        dc.myClick(dc.sepet);
        dc.myClick(dc.Remove);
        dc.myClick(dc.oK);
    }

}
