package training.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertTests {
    WebDriver driver;
    @Test
    public void alertsTests(){
        openBrowser();
        clickOnAlertsFrameWindowMenu();
        openAlertsTables();
        clickOnFirstAlert();
        interactivWithAlertOk();
        clickOnSecondAlert();
        interactivWithAlertOkFiveSec();
        clickOnTheThirdAlert();
        interactivWithConfirmAlert();
        clickOnTheFourthAlert();
        interactivWithPastAlert();
    }

    public void openBrowser() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().setSize(new Dimension(1980, 1080));
    }
    public void clickOnAlertsFrameWindowMenu() {
        WebElement alertsFrameWindowsMenuElement = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        alertsFrameWindowsMenuElement.click();
    }
    public void openAlertsTables() {
        WebElement webAlertsElements = driver.findElement(By.xpath("//span[text()='Browser Windows']   "));
        webAlertsElements.click();
    }
    public void clickOnFirstAlert(){
        WebElement firstAlertElement = driver.findElement(By.xpath("//button[@id='alertButton']"));
        firstAlertElement.click();
    }
    public void interactivWithAlertOk(){
        Alert alertOk = driver.switchTo().alert();
        alertOk.accept();
    }
    public void clickOnSecondAlert(){
        WebElement secondAlertElement = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
        secondAlertElement.click();
    }
    public void interactivWithAlertOkFiveSec(){
        waitForAlert();
        Alert timerOk = driver.switchTo().alert();
        timerOk.accept();
    }
    public void waitForAlert(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
    }
    public void clickOnTheThirdAlert(){
        WebElement thirdAlertElement = driver.findElement(By.xpath("//button[@id='confirmButton']"));
        thirdAlertElement.click();
    }
    public void interactivWithConfirmAlert(){
        Alert confirmAlert = driver.switchTo().alert();
        confirmAlert.dismiss();
    }
    public void clickOnTheFourthAlert(){
        WebElement fourthAlertElement = driver.findElement(By.xpath("//button[@id='promtButton']"));
        fourthAlertElement.click();
    }
    public void interactivWithPastAlert(){
        Alert confirmPastAlert = driver.switchTo().alert();
        //driver.switchTo().
        confirmPastAlert.sendKeys("Edy");
        confirmPastAlert.accept();
    }

}
