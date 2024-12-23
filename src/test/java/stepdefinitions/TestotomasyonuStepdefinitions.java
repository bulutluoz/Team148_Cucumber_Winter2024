package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import pages.TestotomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class TestotomasyonuStepdefinitions {

    TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();


    @Given("kullanici testotomasyonu anasayfaya gider")
    public void kullanici_testotomasyonu_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
    }

    @When("arama kutusuna phone yazip aratir")
    public void arama_kutusuna_phone_yazip_aratir() {
        testotomasyonuPage.aramaKutusu.sendKeys("phone" + Keys.ENTER);
    }

    @Then("arama sonucunda urun bulunabildigini test eder")
    public void arama_sonucunda_urun_bulunabildigini_test_eder() {
        String unExpectedAramaSonucu = ConfigReader.getProperty("toUnexpectedSonuc");
        String actualAramaSonucu = testotomasyonuPage.aramaSonucuElementi
                                                        .getText();

        Assertions.assertNotEquals(unExpectedAramaSonucu,actualAramaSonucu);
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.quitDriver();

    }

    @When("arama kutusuna dress yazip aratir")
    public void aramaKutusunaDressYazipAratir() {
        testotomasyonuPage.aramaKutusu.sendKeys("dress" + Keys.ENTER);
    }

    @When("arama kutusuna java yazip aratir")
    public void aramaKutusunaJavaYazipAratir() {

        testotomasyonuPage.aramaKutusu.sendKeys("java" + Keys.ENTER);
    }


    @Then("arama sonucunda urun bulunamadigini test eder")
    public void aramaSonucundaUrunBulunamadiginiTestEder() {

        String expectedAramaSonucu = ConfigReader.getProperty("toUnexpectedSonuc");
        String actualAramaSonucu = testotomasyonuPage.aramaSonucuElementi
                                                    .getText();

        Assertions.assertEquals(expectedAramaSonucu,actualAramaSonucu);

    }

    @When("arama kutusuna {string} yazip aratir")
    public void aramaKutusunaYazipAratir(String aranacakKelime) {

        testotomasyonuPage.aramaKutusu.sendKeys(aranacakKelime + Keys.ENTER);
    }

    @And("senkronizasyon icin {int} saniye bekler")
    public void senkronizasyonIcinSaniyeBekler(int beklenecekSaniye) {

        ReusableMethods.bekle(beklenecekSaniye);
    }

    @And("ilk urunu tiklar")
    public void ilkUrunuTiklar() {

        testotomasyonuPage.ilkUrunElementi.click();

    }

    @Then("acilan sayfada urun isminde case sensitive olmadan {string} bulundugunu test eder")
    public void acilanSayfadaUrunIsmindeCaseSensitiveOlmadanBulundugunuTestEder(String arananKelime) {

        String actualUrunIsmi = testotomasyonuPage.ilkUrunSayfasindakiIsimElementi
                                                    .getText()
                                                    .toLowerCase();

        Assertions.assertTrue(actualUrunIsmi.contains(arananKelime));
    }

    @When("arama kutusuna test data dosyasindaki belirlenen kelimeyi yazip aratir")
    public void aramaKutusunaTestDataDosyasindakiBelirlenenKelimeyiYazipAratir() {

        testotomasyonuPage.aramaKutusu
                            .sendKeys(ConfigReader.getProperty("toAranacakKelime") + Keys.ENTER);
    }

    @Then("acilan sayfada urun isminde case sensitive olmadan test data dosyasindaki belirlenen kelime bulundugunu test eder")
    public void acilanSayfadaUrunIsmindeCaseSensitiveOlmadanTestDataDosyasindakiBelirlenenKelimeBulundugunuTestEder() {

        String actualUrunIsmi = testotomasyonuPage.ilkUrunSayfasindakiIsimElementi
                                                    .getText()
                                                    .toLowerCase();

        String expectedIsimIcerik = ConfigReader.getProperty("toAranacakKelime");

        Assertions.assertTrue(actualUrunIsmi.contains(expectedIsimIcerik));

    }

    @Given("kullanici test data dosyasinda verilen {string} anasayfaya gider")
    public void kullanici_test_data_dosyasinda_verilen_anasayfaya_gider(String configIstenenUrl) {

        Driver.getDriver().get(ConfigReader.getProperty(configIstenenUrl));

    }
    @Then("url'in test data dosyasinda verilen {string} ile ayni oldugunu test eder")
    public void url_in_test_data_dosyasinda_verilen_ile_ayni_oldugunu_test_eder(String configIstenenUrl) {

        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty(configIstenenUrl);

        Assertions.assertEquals(expectedUrl,actualUrl);

    }
}
