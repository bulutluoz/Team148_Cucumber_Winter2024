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
@ConfigurationParameter(key = Constants.FILTER_TAGS_PROPERTY_NAME,value = "@paralel1")
@ConfigurationParameter(key = Constants.EXECUTION_DRY_RUN_PROPERTY_NAME,value = "false")

//@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, html:target/cucumber-report/HtmlReport1.html")
@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, json:target/json-reports/cucumberRapor1.json")
//@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, junit:target/xml-report/cucumber1.xml")



public class ParalelRun1 {
    /*
        Cucumber'da toplu calistirmayi Runner class'indan yapiyoruz

        Paralel olarak birden fazla browser'i calismasi icin
        birden fazla Runner Class hazirlamaliyiz

        Birden fazla Runner class'i oldugunda, hepsini birlikte
        manuel olarak calistirmamiz MUMKUN olmadigindan
        Terminal'den bu Runner class'larini calistirabilecegimiz
        bir yapi olusturmaliyiz

        Terminalden Runner class calistirmak icin
        1- Maven'i sistem degiskenlerine eklemeliyiz
        2- pom.xml'e terminalden calistirmayi saglayacak
           ve bize guzel HTML raporlar olusturacak
           bazi plugin'leri eklemeliyiz
     */
}
