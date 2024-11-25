package training;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WebTablesTest {

    //declaram o variabila globala pentru dimnesiunea tabelului
    int initialTableSize = '0';

    WebDriver driver;
    @Test
    public void WebTableFlowTest(){
    openBrowser();
    clickOnElementsMenu();
    openWebTables();
    clickOnAddButton();
    fillRegistrationForm();


    }

    public void openBrowser(){
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        //driver.manage().window().getSize(new Dimension());
    }

    public void clickOnelementsMenu(){
            driver = new ChromeDriver();
            driver.get("https://demoqa.com/");
            //driver.manage().window().getSize(new Dimension());

    }

}
