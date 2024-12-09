package proiectfinal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomationExercise extends BasePage {
    @FindBy(xpath = "//h4")
    private WebElement clientCategory;
    @FindBy(xpath = "//*[@id=\"Women\"]/div")
    private WebElement articoleVestimentare;

    public AutomationExercise(WebDriver driver) {
        super(driver);
    }

    @Override
    void isPageLoaded() {
    }
//    //Facem o metoda care sa faca click pe un meniu ales;
//    public void selectMenu(String menuName){
//        scrollDown();

//        for (WebElement element: clientCategory){
//            if (element.getText().equals(menuName)) {
//                element.click();
//                break;
//            }
//        }
//    }
//
//    private void scrollDown() {
    }

