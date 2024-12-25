package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class GooglePage {

    public GooglePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//*[.='Accept all'])[1]")
    public WebElement cookieskabulButonu;

    @FindBy(name = "q")
    public WebElement aramaKutusu;

    @FindBy(tagName = "h3")
    public List<WebElement> aramaSonucElementleriList;
}
