package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends ParentPage {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//a[text()='Create an Account'])[1]")
    public WebElement createAnAccount;

    @FindBy(id = "firstname")
    public WebElement firstname;

    @FindBy(id = "lastname")
    public WebElement lastname;

    @FindBy(id = "email_address")
    public WebElement email;

    @FindBy(id = "email")
    public WebElement emailLogIN;

    @FindBy(id = "pass")
    public WebElement passwordLogIN;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "password-confirmation")
    public WebElement passwordConfirmation;

    @FindBy(xpath = "(//div[@role='alert']//div)[2]")
    public WebElement registeringSuccesfly;

    @FindBy(xpath = "(//span[text()='Create an Account'])[1]")
    public WebElement registerAnAccount;

    @FindBy(css = "[class='logo']")
    public WebElement logo;

    @FindBy(xpath = "(//ul[@class='header links']//a)[2]")
    public WebElement signIn;

    @FindBy(xpath = "(//span[text()='Sign In'])[1]")
    public WebElement logIn;

    @FindBy(xpath = "(//li[@class='greet welcome']//span)[1]")
    public WebElement loginWelcome;

    @FindBy(xpath = "(//div[@role='alert']//div)[2]")
    public WebElement mesaj;

    @FindBy(xpath = "(//button[@class='action switch'])[1]")
    public WebElement sagTik;

    @FindBy(xpath = "//span[text()='Manage Addresses']")
    public WebElement manageAddresses;

    @FindBy(xpath = "//span[text()='Add New Address']")
    public WebElement addNewAddress;

    @FindBy(id = "company")
    public WebElement company;

    @FindBy(id = "telephone")
    public WebElement telephone;

    @FindBy(id = "street_1")
    public WebElement street_1;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "country")
    public WebElement country;

    @FindBy(xpath = "//span[text()='Save Address']")
    public WebElement saveAddress;

    @FindBy(xpath = "(//a[text()='My Account'])[1]")
    public WebElement myAccount;

    @FindBy(id = "zip")
    public WebElement zip;

    @FindBy(id = "region")
    public WebElement state;

    @FindBy(xpath = "(//span[text()='Edit'])[1]")
    public WebElement edit;

    @FindBy(xpath = "(//span[text()='Delete'])[1]")
    public WebElement delete;

    @FindBy(xpath = "//span[text()='OK']")
    public WebElement oK;

    @FindBy(xpath = "//a[@id='ui-id-3']/span")
    public WebElement whatsNew;

    @FindBy(xpath = "//li[@class='item home']/a")
    public WebElement sayfaAcılmışmı;

    @FindBy(xpath = "//span[text()='Women']")
    public WebElement women;

    @FindBy(xpath = "//a[text()='Tops']")
    public WebElement tops;

    @FindBy(xpath = "//a[text()='Bottoms']")
    public WebElement bottoms;

    @FindBy(xpath = "//span[text()='Men']")
    public WebElement men;

    @FindBy(xpath = "//span[text()='Gear']")
    public WebElement gear;

    @FindBy(xpath = "//a[text()='Bags']")
    public WebElement bags;

    @FindBy(xpath = "//a[text()='Fitness Equipment']")
    public WebElement fitnessEquipment;

    @FindBy(xpath = "//a[text()='Watches']")
    public WebElement watches;

    @FindBy(xpath = "//span[text()='Training']")
    public WebElement training;

    @FindBy(xpath = "//a[text()='Video Download']")
    public WebElement videoDownload;

    @FindBy(xpath = "//span[text()='Sale']")
    public WebElement Sale;


    @FindBy(xpath = "//div[@class='product-item-info']/a[@href]")
    public List<WebElement> ürünler;

    @FindBy(xpath = "//ol[@class='product-items widget-product-grid']/li")
    public List<WebElement> ürünler6;


    @FindBy(xpath = "//span[text()='Add to Cart']")
    public WebElement addToCard;

    @FindBy(xpath = "(//div[text()='M'])[1]")
    public WebElement mBeden;

    @FindBy(xpath = "(//div[@role='listbox'])[1]//div")
    public List<WebElement> bedenler;

    @FindBy(xpath = "(//div[@role='listbox'])[2]//div")
    public List<WebElement> renkSecimi;

    @FindBy(xpath = "(//div[@role='listbox'])[2]//div")
    public WebElement renkSecimi1;

    @FindBy(css = "[class='counter-number']")
    public WebElement sepet;

    @FindBy(xpath = "[id^='cart-item']")
    public List<WebElement> sepetteEdit;

    @FindBy(xpath = "(//a[@title='Edit item'])[1]")
    public WebElement düzenleme;


    @FindBy(css = "[id='qty']")
    public WebElement adetSayısı;

    @FindBy(xpath = "//button//span[text()='Update']")
    public List<WebElement> update;

    @FindBy(xpath = "//span[text()='Update Cart']")
    public WebElement updateCart;

    @FindBy(xpath = "//span[text()='Remove']")
    public List<WebElement> çopKutusu;

    @FindBy(xpath = "(//a[@title='Remove item'])[1]")
    public WebElement Remove;

    @FindBy(xpath = "//span[text()='View and Edit Cart']")
    public WebElement EditCart;

    @FindBy(xpath = "//span[text()='Proceed to Checkout']")
    public WebElement Checkout;

    @FindBy(xpath = "(//td[@class='col col-method'])[1]//input")
    public WebElement tik;

    @FindBy(xpath = "//span[text()='Next']")
    public WebElement next;

    @FindBy(xpath = "(//div[@class='primary'])[4]")
    public WebElement PlaceOrder;

    @FindBy(xpath = "//span[text()='Thank you for your purchase!']")
    public WebElement ürünAlınıd;

    @FindBy(id = "search")
    public WebElement ürünArama;

    @FindBy(xpath = "(//div[@role='tab'])[3]")
    public WebElement Category;

    @FindBy(xpath = "(//ol[@class='items']//li/a)[1]")
   // @FindBy(xpath = "(//span[text()='Jackets'])[1]")
    public WebElement jackets;

    @FindBy(xpath = "(//a[@class='product-item-link'])[7]")
    public WebElement ceket;

    @FindBy(xpath = "//div[text()='MJ08']")
    public WebElement sku;

    @FindBy(xpath = "//ul[@role='listbox']//li")
    public WebElement tıklama;

    @FindBy(xpath = "//div[@class='message notice']/div")
    public WebElement ürünYokMesajı;

    @FindBy(xpath = "//a[@class='logo']/img")
    public WebElement logo1;





    public WebElement getWebElement(String strElementName) {

        switch (strElementName.trim()) {
            case "whatsNew":
                return this.whatsNew;
            case "women":
                return this.women;
            case "tops":
                return this.tops;
            case "bottoms":
                return this.bottoms;
            case "men":
                return this.men;
            case "gear":
                return this.gear;
            case "bags":
                return this.bags;
            case "fitnessEquipment":
                return this.fitnessEquipment;
            case "watches":
                return this.watches;
            case "videoDownload":
                return this.videoDownload;
            case "Sale":
                return this.Sale;
            case "training":
                return this.training;
        }

        return null;
    }


}
