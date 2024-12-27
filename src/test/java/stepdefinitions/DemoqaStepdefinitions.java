package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoqaPage;
import utilities.Driver;

import java.time.Duration;

public class DemoqaStepdefinitions {
    DemoqaPage demoqaPage = new DemoqaPage();

    @Then("soldaki sekmelerden Alerts'e tiklar")
    public void soldaki_sekmelerden_alerts_e_tiklar() {
        demoqaPage.alertsSekmesi.click();
    }

    @When("On button click, alert will appear after {int} seconds karsisindaki click me butonuna basar")
    public void on_button_click_alert_will_appear_after_seconds_karsisindaki_click_me_butonuna_basar(Integer int1) {
        demoqaPage.timerAlertButton.click();
    }

    @When("Allert’in gorunur olmasini bekler")
    public void allert_in_gorunur_olmasini_bekler() {
        // 1.adim wait objesi olusturmak
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        // 2.adim mumkunse wait icin kullanacagimiz Webelementi locate edip kaydedin
        //        biz alert'i bekleyecegimiz icin locate edecek bir sey yok

        // 3.adim expectedConditions kullanarak wait objesini bekletin
        wait.until(ExpectedConditions.alertIsPresent());

    }

    @Then("Allert uzerindeki yazinin {string} oldugunu test eder")
    public void allert_uzerindeki_yazinin_oldugunu_test_eder(String expectedAlertYazi) {

        String actualAlertYazi = Driver.getDriver()
                                        .switchTo()
                                        .alert()
                                        .getText();

        Assertions.assertEquals(expectedAlertYazi,actualAlertYazi);
    }

    @Then("Ok diyerek alerti kapatir")
    public void ok_diyerek_alerti_kapatir() {

        Driver.getDriver()
                .switchTo()
                .alert()
                .accept();
    }

    @Then("soldaki sekmelerden Elements'e tiklar")
    public void soldakiSekmelerdenElementsETiklar() {

        demoqaPage.elementsSekmesi.click();
    }

    @And("acilan menuden Dynamic Properties'e tiklar")
    public void acilanMenudenDynamicPropertiesETiklar() {
        demoqaPage.dynamicPropertiesMenu.click();
    }


    @Then("Will enable {int} seconds butonunun enable olmasini bekler")
    public void will_enable_seconds_butonunun_enable_olmasini_bekler(Integer onemsiz) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(20));

        wait.until(ExpectedConditions.elementToBeClickable(demoqaPage.enableAfter5SecondsButonu));

    }

    @Then("butonun enable oldugunu test eder")
    public void butonun_enable_oldugunu_test_eder() {

        Assertions.assertTrue( demoqaPage.enableAfter5SecondsButonu.isEnabled());
    }


    @And("Visible After {int} Seconds butonunun visible olmasini bekler")
    public void visibleAfterSecondsButonununVisibleOlmasiniBekler(int onemsiz) {

        // wait objesi olustur
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(20));

        // bekledigimiz visible after 5 secods butonu
        // visible olmadigi icin locate edip webelement olarak kaydetme sansimiz yok
        // bunun yerine 2. ve 3. adimlari birlestirip
        // locate edip kaydetme ve bekleme islemelerini BIRLIKTE yapiyoruz
        // bekleme ve locate'i birlikte yapacagimiz icin
        // page class'inda degil burada locate etmeliyiz

        WebElement visibleAfter5SecondsButonu =
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
    }

    @Then("butonun visible oldugunu test eder")
    public void butonunVisibleOldugunuTestEder() {
        Assertions.assertTrue(demoqaPage.visibleAfter5Seconds.isDisplayed());
    }
}
