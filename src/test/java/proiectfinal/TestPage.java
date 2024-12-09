package proiectfinal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import training.pages.CommonPage;
import training.pages.HomePage;

public class TestPage {
public WebDriver driver;

public AutomationExercise automationExercise;

    @BeforeClass

    public void openBrowser(){
        driver = new ChromeDriver();
        automationExercise= new AutomationExercise(driver);
        driver.get("https://www.automationexercise.com/");

        //Facem fereastra la dimensiunea maxima:
        driver.manage().window().maximize();

        //Facem fereastra la dimensiunea dorita: 1980 cu 1080
        // driver.manage().window().setSize(new Dimension(1980, 1080));

    }
//    @AfterMethod
//    public void quitBrowser(){
//        if (driver != null){
//            driver.quit();
//        }
//    }
}
