package training.pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.List;

public class HomePage extends BasePage {

    //identificam web elementele spesifice paginii

    @FindBy(xpath = "//h5[text()='Fonts']")
    private List<WebElement> webElementList;
    @FindBy(xpath= )
    private WebElement pageTitle;


    //un constructor care preia constructorul din clasa mostenita BasePage

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    //implementare proprie pentru Homepage a metodei abstracte din BasePage

    @Override
    public void isPageLoaded() {
        Assert.assertTrue(pageTitle.getAttribute("alt").equals("Selenium Online Training"), "Page is Not Loaded Correctly")
    }
    //facem metode specifice pentru pagina

    //facem o metoda care sa faca click pe meniul Fonts

//    public void clickOnFormMenu() {
//        scrollDown();
//        WebElement formMenuElement = driver.findElement(By.xpath("//h5[text()='Fonts']"));
//        formMenuElement.click();

    //facem o metoda care sa faca click pe un menu ales de noi
    public void goToDesiredMenu(String menuName){
        scrollDown();
    for(WebElement element: webElementList){
        if (element.getText().equals(menuName)){
            element.click();
            break;
        }
    }



    }
}
