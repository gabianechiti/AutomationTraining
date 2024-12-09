package training.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FramesTest {
    WebDriver driver;
    @Test

    public void framesTest(){
        openBrowser();
        clickOnAlertsFrameWindowMenu();
        clickOnFramesMenu();
        interactiveFrameOne();
        switchToDefaultPage();
        interactiveFrameTwo();
        switchToDefaultPageTwo();

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
    public void clickOnFramesMenu() {
        WebElement browserFramesElement = driver.findElement(By.xpath("//span[text()='Frames']"));
        browserFramesElement.click();
    }
    public void interactiveFrameOne (){
        WebElement frameOneElement = driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(frameOneElement);
        System.out.println("Testul din framu-ul 1 este: " + driver.findElement(By.id("sampleHeading")).getText());
    }
    public void switchToDefaultPage(){
        driver.switchTo().defaultContent();
    }
    public void interactiveFrameTwo (){
        WebElement frameTwoElement = driver.findElement(By.xpath("//iframe[@id='frame2']"));
        driver.switchTo().frame(frameTwoElement);
        System.out.println("Testul din framu-ul 2 este: " + driver.findElement(By.id("sampleHeading")).getText());
    }
    public void switchToDefaultPageTwo(){
        driver.switchTo().defaultContent();
    }
}