package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class HomePage extends BasePage{

    //identificam webelementele specifice paginii
    @FindBy(xpath = "//h5")
    private List<WebElement> menuListElements;
    @FindBy(xpath = "//img[@class='banner-image']")
    private WebElement pageTitle;

    //un constructur care preia din clasa BasePage
    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }



    //implementare proprie pentru homepage a metodei abstarcte din BasePage
    @Override
    public void isPageLoaded() {
        Assert.assertTrue(pageTitle.getAttribute("alt").equals("Selenium Online Training"),"Page is not loaded correctly");
    }
    //facem metode specifice pentru pagina

    //Facem o metoda care sa sa faca click meniul Forms
//    public void clickOnFormMenu(){
//        scrollDown();
//        formsMenuElement.click();
//    }
    //facem o metoda care sa faca click pe un meniu ales de noi

    public void goToDesireMenu (String menuName){
        scrollDown();
        for (WebElement element: menuListElements){
            if (element.getText().equals(menuName)){
                element.click();
                break;
            }
        }
    }

    //Facem o metoda cae sa faca scroll in jos pe pagina
    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
    }
}