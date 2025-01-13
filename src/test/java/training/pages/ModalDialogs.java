package training;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ModalDialogs {
    WebDriver driver;
    @Test

    public void modalDialogsTests() throws InterruptedException {
        openBrowser();
        openAlertFrameWindows();
        openModalDialogs();
        clickSmallModal();
        closeSmallModal();
        clickOnLargeModal();
        closeLargeModal();

    }
    public void openBrowser(){
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().setSize(new Dimension(1980, 1080));
    }
    public void openAlertFrameWindows(){
        WebElement alertsFrameWindowsMenuElement = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        alertsFrameWindowsMenuElement.click();
    }
    public void openModalDialogs(){
        WebElement modalDialogsMenuElement = driver.findElement(By.xpath("//span[text()='Modal Dialogs']"));
        modalDialogsMenuElement.click();
    }
    public void clickSmallModal() throws InterruptedException {
        WebElement smallModalElement = driver.findElement(By.id("showSmallModal"));
        smallModalElement.click();
        Thread.sleep(1500);
    }
    public void closeSmallModal(){
        WebElement closeSmallModalElement = driver.findElement(By.id("closeSmallModal"));
        closeSmallModalElement.click();
    }
    public void clickOnLargeModal() throws InterruptedException {
        WebElement largeModelElement = driver.findElement(By.id("showLargeModal"));
        largeModelElement.click();
        Thread.sleep(1500);
    }
    public void closeLargeModal(){
        WebElement closeLargeModalElement = driver.findElement(By.id("closeLargeModal"));
        closeLargeModalElement.click();
    }

}