package training;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

//Declaram o variabila globala ptdimensiunea tabelului
//int initialTableSize = 0;


import java.util.List;

public class WebTableTest {
    int initialTableSize = 0;

    public WebDriver driver;

    @Test
    public void navigateFromHomePageToPracticeElementsPage() {
        openBrowser();
        clickOnElementsMenu();
        openWebTables();
        getInitialTableSize();
        clickOnAddButton();
        fillRegistrationForm();
        checkNewTableRecord();
    }

    public void openBrowser() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().setSize(new Dimension(1980, 1080));
    }

    public void clickOnElementsMenu() {
        WebElement formsMenuElement = driver.findElement(By.xpath("//h5[text()='Elements']"));
        formsMenuElement.click();
    }

    public void openWebTables() {
        WebElement webTablesElements = driver.findElement(By.xpath("//span[text()='Web Tables']"));
        webTablesElements.click();
    }

    //Fac o metoda sa apas pe "add" button

    public void clickOnAddButton() {
        WebElement addButtonElement = driver.findElement(By.id("addNewRecordButton"));
        Actions actions = new Actions(driver);
        actions.moveToElement(addButtonElement).click().perform();
    }

    //Facem o metoda care completeaza tot formularul deodata

    public void fillRegistrationForm() {
        fillFirtsName("Ionut");
        fillLastName("Tester");
        fillEmailAddress("Ionut.TesterBunRau@yahoo.com");
        fillAge("99");
        fillSalary("999999");
        fillDepartament("IT/MC");
        clickOnSubmitButton();

    }

    //Facem metoda care sa completeze First Name
    public void fillFirtsName(String firstName){
        WebElement firstNameElement = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstNameElement.sendKeys(firstName);
    }
    //Facem o metoda care sa completeze Last Name
    public void fillLastName(String lastName){
        WebElement lastNameElement = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastNameElement.sendKeys(lastName);
    }
    //facem metoda pt Email
    public void fillEmailAddress(String emailAddress){
        WebElement emailAddressElement = driver.findElement(By.xpath("//input[@id='userEmail']"));
        emailAddressElement.sendKeys(emailAddress);
    }
    //facem metoda age
    public void fillAge (String age) {
        WebElement ageElement = driver.findElement(By.xpath("//input[@id='age']"));
        ageElement.sendKeys(age);
    }
    //facem metoda salary
    public void fillSalary (String salary) {
        WebElement salaryElement = driver.findElement(By.xpath("//input[@id='salary']"));
        salaryElement.sendKeys(salary);
    }
    // facem metoda departament
    public void fillDepartament (String departament) {
        WebElement departamentElement = driver.findElement(By.xpath("//input[@id='department']"));
        departamentElement.sendKeys(departament);
    }
    //facem metoda submit button
    public void clickOnSubmitButton() {
        WebElement submitButtonElement = driver.findElement(By.xpath("//button[@id='submit']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(submitButtonElement).click().perform();
    }

    //Fac o metoda prin care dovedesc ca am adaugat un rand in tabel(Tema)



    // Verifică dacă rândul a fost adăugat
    //WebElement tabel = driver.findElement(By.xpath("//*[@id="app"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]"));
    //int numarRanduri = tabel.findElements(By.tagName("tr")).size();

    //Facem o metoda prin care luam dimensiunea initiala a tabelului
    //Facem o metoda prin care sa validam ca dupa intoducerea detalor in formular am introdus
    //o linia in tabel
    public int getInitialTableSize(){
        List<WebElement>tableElements = driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']"));
        initialTableSize = tableElements.size();
        System.out.println("Tabelul are: " +initialTableSize + " randuri");
        return initialTableSize;
    }

    public void checkNewTableRecord(){
        List<WebElement>tableElements = driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']"));
        int actualTableSize = tableElements.size();
        int expectedTableSize = initialTableSize + 1;
        Assert.assertEquals(actualTableSize, expectedTableSize, "Actual table size : " + actualTableSize + " is different than expected table size: " + expectedTableSize);
        System.out.println("Actual table size is: " + actualTableSize + " and expected table size is: " + expectedTableSize);
    }
    //public void scrollDown(){
    //JavascriptExecutor js= (JavascriptExecutor) driver;
    //js.executeScript("window.scrollBy(0,250)");
    //}
    //public void waitForElements(){
    //WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    //wait.until(ExpectedConditions.visibilityOf(webElement));

    //}

}