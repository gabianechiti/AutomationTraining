package training;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;
import training.pages.HomePage;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class PracticeFormTest<WebDriverWait> {
    //creeam o metoda de test care sa mearga de pe pagina principala pana in pagina practice form

    public WebDriver driver;

    @Test
    public void navigateFromHomePageToPracticeForm() {
        openBrowser();
        HomePage homePage = new HomePage(driver);
        homePage.goToDesiredMenu("Forms");
        homePage.isPageLoaded();
//        clickOnPracticeFormMenu();
//        scrollDown();
//        fillFirstName();
//        fillLastName();
//        fillEmail();
//        fillPhoneNumber();
//        fillGender("Male");
//        selectSubject();
//        scrollDown();
//        clickOnSubmitButton();
//        filldateOfBirth();
//        selectStateNcr();
//        addthePicture();
    }

    //facem o motoda care sa deschisa browserul Chrome
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com");
        try {
            // Delay for 2 seconds (2000 milliseconds)
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // Handle the exception
            e.printStackTrace();
        }
        driver.manage().window().maximize();

    }

    //facem o metoda care sa faca click pe meniul Fonts
    public void clickOnFormMenu() {
        scrollDown();

        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))  // Maximum wait time
                .pollingEvery(Duration.ofMillis(500)) // Frequency to check the condition
                .ignoring(Exception.class);           // Ignore exceptions during wait

        WebElement formMenuElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h5[text()='Fonts']")));

        System.out.println(formMenuElement);

        formMenuElement.click();
    }

    //facem o metoda care sa fac scroll mai jos pe pagina
    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
    }

    //facem o metodsa care sa faca click pe submeniul Practice form
    public void clickOnPracticeFormSubmenu() {
        WebElement practiceFormSubElement = driver.findElement(By.xpath("//span[text()='Practice Form']"));
        practiceFormSubElement.click();

    }

    //facem o metoda sa completam campul de first Name
    public void fillFirstName() {
        WebElement firstNameFieldElement = driver.findElement(By.id("firstName"));
        firstNameFieldElement.sendKeys("Bogdan");
    }

    //facem o metoda care sa compelteze campul last Name
    public void fillLastName() {
        WebElement lastNameFieldElement = driver.findElement(By.id("lastName"));
        lastNameFieldElement.sendKeys("Ionescu");
    }

    //facem o metoda care sa compelteze campul de email
    public void fillEmail() {
        WebElement emailFieldElement = driver.findElement(By.xpath("//input[@id='userEmail']"));
        emailFieldElement.sendKeys("exemplu@yahoo.com");
    }

    //facem o metoda care sa completeze campul de gen
    public void fillGender(String gender) {
        WebElement maleGenderCheckboxElement = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
        WebElement femaleGenderCheckboxElement = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
        WebElement otherGenderCheckboxElement = driver.findElement(By.xpath("//label[@for='gender-radio-3']"));
        List<WebElement> genderListElements = new ArrayList<>();
        genderListElements.add(maleGenderCheckboxElement);
        genderListElements.add(femaleGenderCheckboxElement);
        genderListElements.add(otherGenderCheckboxElement);
        for (int i = 0; i < genderListElements.size(); i++) {
            if (genderListElements.get(i).getText().equals(gender)) {
                genderListElements.get(i).click();
            }
        }
    }

    //facem o metoda care sa compelteze campul de Phone number
    public void fillPhoneNumber() {
        WebElement phoneNumberFieldElement = driver.findElement(By.xpath("//input[@id='userNumber']"));
        phoneNumberFieldElement.sendKeys("0712345678");

    }

    //facem o metoda care sa compelteze campul de Data nasterii
    public void filldateOfBirth() {
        WebElement selectDateOfBirthInputField = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
        selectDateOfBirthInputField.clear();
        selectDateOfBirthInputField.sendKeys("28 September 1982");
        selectDateOfBirthInputField.sendKeys(Keys.ENTER);

    }

    //facem o metoda care sa compelteze campul de Subjects
    public void selectSubject() {
        WebElement selectSubjectInputField = driver.findElement(By.id("subjectsInput"));
        selectSubjectInputField.sendKeys("Accounting");
        selectSubjectInputField.sendKeys(Keys.ENTER);
    }
    //facem o metoda care sa completeze campul de Hobbies

    //facem o metoda care sa incarce un fisier
    public void addthePicture(){
        String pictureFilePath = "src/test/resources/A.java";
        File file = new File(pictureFilePath);
        WebElement inputPictureElements = driver.findElement(By.cssSelector("#uploadPicture"));
        inputPictureElements.sendKeys(file.getAbsolutePath());
    }
    //vom face scroll down in continuare
    //facem o metoda care sa compelteze campul Curent addres
    //facem o metoda care sa selecteze Orasul

    public void selectStateNcr() {
        WebElement selectStateNcrInputField = driver.findElement(By.xpath(" //input[@id='selectState']"));
        selectStateNcrInputField.sendKeys("NCR");
        selectStateNcrInputField.sendKeys(Keys.ENTER);
    }

    //facem o metoda care sa faca click pe submit
    public void clickOnSubmitButton() {
        WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
        submitButton.click();
    }
    //de validat tabelul cu valori
    
    //

}


