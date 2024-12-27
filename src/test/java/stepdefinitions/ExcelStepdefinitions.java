package stepdefinitions;

import io.cucumber.java.en.*;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelStepdefinitions {
    Workbook workbook;
    Sheet sayfa1 ;

    @Given("kullanici baskentler exceline ulasir")
    public void kullanici_baskentler_exceline_ulasir() throws IOException {
        String excelDosyaYolu = "src/test/resources/ulkeler.xlsx";
        FileInputStream fileInputStream = new FileInputStream(excelDosyaYolu);
        workbook = WorkbookFactory.create(fileInputStream);
        sayfa1 = workbook.getSheet("Sayfa1");

    }
    @Then("{int}.satir {int}.hucredeki datayi yazdirir")
    public void satir_hucredeki_datayi_yazdirir(Integer int1, Integer int2) {

    }
    @Then("{int}.satir {int}.hucredeki datayi bir string degiskene kaydeder")
    public void satir_hucredeki_datayi_bir_string_degiskene_kaydeder(Integer int1, Integer int2) {

    }
    @Then("kaydedilen datanin {string} oldugunu test eder")
    public void kaydedilen_datanin_oldugunu_test_eder(String string) {

    }
    @Then("baskenti Jakarta olan ulkenin Turkce isminin {string} oldugunu test eder")
    public void baskenti_jakarta_olan_ulkenin_turkce_isminin_oldugunu_test_eder(String string) {

    }
    @Then("excelde kayitli ulke sayisinin {int} oldugunu test eder")
    public void excelde_kayitli_ulke_sayisinin_oldugunu_test_eder(Integer int1) {

    }
    @Then("excelde kullanilan fiziki satir sayisinin {int} oldugunu test eder")
    public void excelde_kullanilan_fiziki_satir_sayisinin_oldugunu_test_eder(Integer int1) {

    }
    @When("Tum bilgileri map olarak kaydedip")
    public void tum_bilgileri_map_olarak_kaydedip() {

    }
    @Then("baskenti Jakarta olan ulkenin tum bilgilerini yazdirir")
    public void baskenti_jakarta_olan_ulkenin_tum_bilgilerini_yazdirir() {

    }
    @Then("mapi kullanarak turkce ismi Hollanda olan bir ulke bulundugunu test eder")
    public void mapi_kullanarak_turkce_ismi_hollanda_olan_bir_ulke_bulundugunu_test_eder() {

    }
}
