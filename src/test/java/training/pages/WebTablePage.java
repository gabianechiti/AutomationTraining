package training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class WebTablePage extends BasePage{


    @FindBy(xpath = "//h1")
    private WebElement pageTitleElement;

    public WebTablePage(WebDriver driver) {
        super(driver);
    }

    @Override
    void isPageLoaded() {
        Assert.assertEquals(pageTitleElement.getText(), "Web Tables", "Title is invalid and actual value is: " +pageTitleElement.getText());
    }
}
