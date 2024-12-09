package proiectfinal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class FillFormPage extends BasePage{

    @FindBy(xpath = "//button[contains(text(), 'Consent')]")
    private WebElement acceptCookies;

    @FindBy (css = "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(4) > a > i")
    private WebElement signUpButton;

    public FillFormPage(WebDriver driver) {
        super(driver);
    }

    public void Cookies(){
        acceptCookies.click();
    }

    public void pressSignUpButton(){
        signUpButton.click();
    }

    @Override
    void isPageLoaded() {

    }
}

