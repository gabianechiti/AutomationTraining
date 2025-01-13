package training.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import training.pages.AlertsPage;

import java.time.Duration;

import static training.constants.MenuKeys.ALERTS_FRAMES_WINDOWS_MENU;
import static training.constants.SubMenuKeys.ALERTS_SUBMENU;

public class AlertsTest extends BaseTest{
//    public WebDriver driver;

    @Test
    public void testAlertsFrameWindows(){
        homePage.isPageLoaded();
        homePage.selectMenu(ALERTS_FRAMES_WINDOWS_MENU);
        commonPage.isPageLoaded();
        commonPage.selectSubMenu(ALERTS_SUBMENU);
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.isPageLoaded();
        alertsPage.interactWithAllAlerts();
//        openBrowser();
//        clickOnAlertsFrameWindows();
//        clickOnAlertsMenu();
//        clickFirstAlertButton();
//        clickSecondAlertButton();
//        waitForSecondAlert();
//        secondAlert();
//        clickThirdButton();
//        clickFourthButton();
    }
//    public void scrollDown() {
//       JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,160)");
//    }
//
//    public void openBrowser() {
//        driver = new ChromeDriver();
//        driver.get("https://demoqa.com/");
//        driver.manage().window().maximize();
//    }

//    public void clickOnAlertsFrameWindows() {
//        WebElement alertsFrameWindowsElement = driver.findElement(By.xpath("//h5[text()=\"Alerts, Frame & Windows\"]"));
//        alertsFrameWindowsElement.click();
//    }
//
//    public void clickOnAlertsMenu() {
//        WebElement alertsMenu = driver.findElement(By.xpath("//span[text()=\"Alerts\"]"));
//        alertsMenu.click();
//    }

//    public void clickFirstAlertButton(){
//        WebElement firstAlert = driver.findElement(By.id("alertButton"));
//        firstAlert.click();
//        Alert clickOk = driver.switchTo().alert();
//        clickOk.accept();
//    }

//    public void clickSecondAlertButton(){
//        WebElement secondAlert = driver.findElement(By.id("timerAlertButton"));
//        secondAlert.click();
//    }
//
//    public void waitForSecondAlert(){
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.alertIsPresent());
//    }
//
//    public void secondAlert(){
//        Alert clickOk = driver.switchTo().alert();
//        clickOk.accept();
//    }

//    public void clickThirdButton(){
//        WebElement thirdButton = driver.findElement(By.id("confirmButton"));
//        thirdButton.click();
//        Alert clickOk = driver.switchTo().alert();
//        clickOk.dismiss();
//    }
//
//    public void clickFourthButton(){
//        WebElement fourthButton = driver.findElement(By.id("//button[@id='promtButton']"));
//        fourthButton.click();
//        fourthButton.sendKeys("Emanuel");
//        Alert clickOk = driver.switchTo().alert();
//        clickOk.accept();
//    }
}