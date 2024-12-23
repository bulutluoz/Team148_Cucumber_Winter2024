package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import pages.SauceLabsPage;

public class SauceLabStepdefinitions {

    SauceLabsPage sauceLabsPage = new SauceLabsPage();
    String ilkUrunIsmi;

    @Then("saucedemo username kutusuna {string} yazar")
    public void saucedemo_username_kutusuna_yazar(String direktKullaniciAdi) {
        sauceLabsPage.usernameKutusu.sendKeys(direktKullaniciAdi);
    }
    @Then("saucedemo password kutusuna {string} yazar")
    public void saucedemo_password_kutusuna_yazar(String direktPassword) {
        sauceLabsPage.passwordKutusu.sendKeys(direktPassword);
    }

    @Then("saucedemo login tusuna basar")
    public void saucedemo_login_tusuna_basar() {
        sauceLabsPage.loginButtonu.click();
    }
    @Then("ilk urunun ismini kaydeder ve bu urunun sayfasina gider")
    public void ilk_urunun_ismini_kaydeder_ve_bu_urunun_sayfasina_gider() {
        ilkUrunIsmi = sauceLabsPage.ilkUrunElementi.getText();

        sauceLabsPage.ilkUrunElementi.click();

    }
    @When("saucedemo add to Cart butonuna basar")
    public void saucedemo_add_to_cart_butonuna_basar() {

        sauceLabsPage.ilkUrunAddToCartButonu.click();

    }
    @Then("saucedemo alisveris sepetine tiklar")
    public void saucedemo_alisveris_sepetine_tiklar() {

        sauceLabsPage.alisverisSepeti.click();

    }
    @Then("sectigi urunun basarili olarak sepete eklendigini test eder")
    public void sectigi_urunun_basarili_olarak_sepete_eklendigini_test_eder() {
        String sepettekiUrunIsmi = sauceLabsPage.sepettekiUrunIsimElementi.getText();

        Assertions.assertEquals(ilkUrunIsmi,sepettekiUrunIsmi);
    }


}
