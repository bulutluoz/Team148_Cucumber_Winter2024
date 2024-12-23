package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SauceLabsPage {

    public SauceLabsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user-name")
    public WebElement usernameKutusu;

    @FindBy(id = "password")
    public WebElement passwordKutusu;

    @FindBy(id = "login-button")
    public WebElement loginButtonu;

    @FindBy(xpath = "(//*[@*='inventory_item_name '])[1]")
    public WebElement ilkUrunElementi;

    @FindBy(xpath = "(//*[.='Add to cart'])[1]")
    public WebElement ilkUrunAddToCartButonu;

    @FindBy(id = "shopping_cart_container")
    public WebElement alisverisSepeti;

    @FindBy(xpath = "//*[@*='inventory_item_name']")
    public WebElement sepettekiUrunIsimElementi;
}
