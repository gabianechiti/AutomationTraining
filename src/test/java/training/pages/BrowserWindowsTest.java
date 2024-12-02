package training;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserWindowsTest {
    WebDriver driver;
    @Test

    public void browserWindowsTest(){
        openBrowser();
        clickOnAlertsFrameWindowMenu();
        clickOnBrowserWindowMenu();
        clickNewTab();
        clickOnNewWindow();
        clickOnNewWindowMessage();
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
    public void clickOnBrowserWindowMenu() {
        WebElement browserWindowsMenuElement = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
        browserWindowsMenuElement.click();
    }
    public void clickNewTab() {
        WebElement newTabElement = driver.findElement(By.xpath("//button[@id='tabButton']"));
        String originalWindows = driver.getWindowHandle();
        newTabElement.click();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindows)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        driver.close();
        driver.switchTo().window(originalWindows);
    }
    public void clickOnNewWindow(){
        WebElement newWindowElement = driver.findElement(By.xpath("//button[@id='windowButton']"));
        String originalWindows = driver.getWindowHandle();
        newWindowElement.click();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindows)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        driver.close();
        driver.switchTo().window(originalWindows);

    }
    public void clickOnNewWindowMessage(){
        WebElement newWindowMessage = driver.findElement(By.xpath("//button[@id='messageWindowButton']"));
        String originalWindows = driver.getWindowHandle();
        newWindowMessage.click();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindows)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        driver.close();
        driver.switchTo().window(originalWindows);
    }
}