package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.Driver;

public class GoogleStepdefinitions {

    GooglePage googlePage = new GooglePage();

    @Given("kullanici google anasayfaya gider")
    public void kullanici_google_anasayfaya_gider() {
        Driver.getDriver().get("https://www.google.com");
    }
    @Then("google cookies kabul eder")
    public void google_cookies_kabul_eder() {
        googlePage.cookieskabulButonu.click();
    }
    @When("google'da {string} icin arama yapar")
    public void google_da_icin_arama_yapar(String keyword) {

        googlePage.aramaKutusu.sendKeys(keyword + Keys.ENTER);

    }
    @When("ilk {int} sonucu yazdirir")
    public void ilk_sonucu_yazdirir(Integer yazdirilacakSonucSayisi) {

        for (int i = 0; i <yazdirilacakSonucSayisi ; i++) {

            System.out.println(i+1 +".ci arama sonucu : " + googlePage.aramaSonucElementleriList.get(i).getText());


        }


    }

}
