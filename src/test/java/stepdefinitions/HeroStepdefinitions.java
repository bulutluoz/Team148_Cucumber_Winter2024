package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.NoSuchElementException;
import pages.HerokuPage;

public class HeroStepdefinitions {

    HerokuPage herokuPage = new HerokuPage();

    @When("kullanici Add Element butonuna basar")
    public void kullanici_add_element_butonuna_basar() {
        herokuPage.addElementButonu.click();
    }

    @When("Delete butonu’nun gorunur oldugunu test eder")
    public void delete_butonu_nun_gorunur_oldugunu_test_eder() {
        Assertions.assertTrue(herokuPage.deleteButonu.isDisplayed());
    }

    @Then("Delete tusuna basar")
    public void delete_tusuna_basar() {
        herokuPage.deleteButonu.click();
    }

    @Then("Add Remove Elements yazisinin gorunur oldugunu test eder")
    public void add_remove_elements_yazisinin_gorunur_oldugunu_test_eder() {
        Assertions.assertTrue(herokuPage.addRemoveElementYazisi.isDisplayed());
    }

    @And("Delete butonu’nun gorunur olmadigini test eder")
    public void deleteButonuNunGorunurOlmadiginiTestEder() {

        try {

            System.out.println(herokuPage.deleteButonu.isDisplayed());
            // 37.satirda exception olusmamasi bizim istemedigimiz durumdur
            // element gorunur ise Testimiz FAILED olmalidir
            // biz de bunun icin %100 FAILED olacak asagidaki satiri yazdik
            Assertions.assertTrue(false);

        } catch (NoSuchElementException e) {
            // 37.satirda NoSuchElementException olusmasi bizim istedigimiz durumdur
            // element gorunur olmadigi icin exception olusmasi
            // Testimizin PASSED oldiugunu gosterir
            // biz de bunun icin %100 passed olacak asagidaki satiri yazdik
            Assertions.assertTrue(true);
        }
    }
}
