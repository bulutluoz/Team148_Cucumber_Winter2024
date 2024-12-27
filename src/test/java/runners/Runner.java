package runners;

import io.cucumber.junit.platform.engine.Constants;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("src/test/java")
@ConfigurationParameter(key = Constants.FEATURES_PROPERTY_NAME,value = "src/test/resources/features")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME,value = "stepdefinitions")
@ConfigurationParameter(key = Constants.FILTER_TAGS_PROPERTY_NAME,value = "@wip")
@ConfigurationParameter(key = Constants.EXECUTION_DRY_RUN_PROPERTY_NAME,value = "false")

@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, html:target/cucumber-report/HtmlReport.html")
//@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, json:target/json-reports/cucumberRapor.json")
//@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, junit:target/xml-report/cucumber.xml")


public class Runner {

    /*
        Cucumber'daki Runner Class'i icinde hicbir kod yazilmaz

        Gorevi TestNG'deki .xml dosyalari gibi
        toplu calistirmayi saglamaktir.

        Runner class'i gorevini
        kullanacagimiz notasyon'lar ile gerceklestirir.
     */
    /*
        @IncludeEngines("cucumber")  : Class'in cucumber ile calismasini saglar
        @SelectClasspathResource("src/test/java") : Java class'larini bulacagi dosya yolu

        Constants.FEATURES_PROPERTY_NAME : "src/test/resources/features"
        calistirilacak feature dosyalarinin yerini gosterir

        Constants.GLUE_PROPERTY_NAME : "stepdefinitions"
        belirlenen feature dosyalarini calistirmak icin
        kullanilacak stepdefinition'larin bulundugu package'in dosya yolu

        EGER sadece bu notasyonlari kullanirsak,
        features klasoru icindeki tum feature'lari calistirir

        istedigimiz feature'lari calistirmak icin
        cucumber 2 alternatif sunar
        1- istediginiz feature'lari bir klasor icine koyup
           sadece o klasoru calistirmasini isteyebilirsiniz
        2- istediginiz Feature veya Scenario'lari bir tag ile belirleyip,
           Constants.FILTER_TAGS_PROPERTY_NAME : "@smoke"

        EGER Runner dosyasi ile calistirdigimiz feature dosyalarini
        SADECE eksik stepdefinition'lari bulmak ve method'larini olusturmak icin
        calistiriyorsak

        Constants.EXECUTION_DRY_RUN_PROPERTY_NAME : "true" yapariz

        dryRun degeri true iken Runner SADECE eksik adim kontrolu yapar
        Feature veya Scenario'lari calistirmaz
        eksik adim varsa failed deyip eksik adimlari verir
        eksik adim yoksa passed deyip calismayi bitirir

     */
}
