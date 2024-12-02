package training;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import training.pages.HomePage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PracticeFormTest {

    //creem o metoda de test care sa mearga de pe pagina principala pana pe pagina Practice Form
    public WebDriver driver;

    @Test
    public void navigateFromHomePageToPracticeFormPage() {
        openBrowser();
        HomePage homePage = new HomePage(driver);
        homePage.isPageLoaded();
        homePage.goToDesireMenu("Forms");
//        clickOnPracticeFormSubmenu();
//        scrollDown();
//        fillFirstName();
//        fillLastName();
//        fillMail();
//        fillPhoneNumber();
//        fillGender("Other");
//        selectSubject();
//        scrollDown();
//        fillHobbies("Sports");
//        fillDateOfBirth();
//        addThePictures();
//        fillCurrentAddress();
//        fillTheState();
//        fillTheCity();
//        clickOnSubmitButton();

    }

    //Facem o metoda care sa deschida browser-ul Chrome
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
    }

    //Facem o metoda care sa sa faca click meniul Forms
//    public void clickOnFormMenu(){
//        scrollDown();
//        WebElement formsMenuElement = driver.findElement(By.xpath("//h5[text()='Forms']"));
//        formsMenuElement.click();
//    }

    //Facem o metoda cae sa faca scroll in jos pe pagina
    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
    }

    //Facem o metoda care sa faca click pe submeniul practice form
    public void clickOnPracticeFormSubmenu() {
        WebElement practiceFormSubmenuElement = driver.findElement(By.xpath("//span[text()='Practice Form']"));
        practiceFormSubmenuElement.click();
    }

    //Facem o metoda sa completam campul de Name
    public void fillFirstName() {
        WebElement firstNameFieldElement = driver.findElement(By.id("firstName"));
        firstNameFieldElement.sendKeys("Bogdan");
    }

    //Facem o metoda care sa completeze campul Last Name
    public void fillLastName() {
        WebElement lastNameFieldElement = driver.findElement(By.id("lastName"));
        lastNameFieldElement.sendKeys("Popescu");
    }

    //Facem o metoda care sa completeze campul e-mail
    public void fillMail() {
        WebElement mailFieldElement = driver.findElement(By.xpath("//input[@id='userEmail']"));
        mailFieldElement.sendKeys("Bogdan.Popescu@yahoo.com");
    }

    //Facem o metoda care sa selecteze genul
    public void fillGender(String gender) {
        WebElement maleGenderCheckboxElement = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
        WebElement femaleGenderCheckboxElement = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
        WebElement otherGenderCheckboxElement = driver.findElement(By.xpath("//label[@for='gender-radio-3']"));
        List<WebElement> genderListsElements = new ArrayList<>();
        genderListsElements.add(maleGenderCheckboxElement);
        genderListsElements.add(femaleGenderCheckboxElement);
        genderListsElements.add(otherGenderCheckboxElement);
        for (int i = 0; i < genderListsElements.size(); i++) {
            if (genderListsElements.get(i).getText().equals(gender)) {
                genderListsElements.get(i).click();
            }
        }

    }

    //Facem o metoda care sa completeze campul Phone Number
    public void fillPhoneNumber() {
        WebElement phoneNumberElement = driver.findElement(By.xpath("//input[@id='userNumber']"));
        phoneNumberElement.sendKeys("0799544406");
    }

    //Facem o metoda care sa completeze campul data nasterii
    public void fillDateOfBirth() {
        WebElement dateOfBirthElement = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
        dateOfBirthElement.sendKeys("20 Dec 1997");
        WebElement defaultElement = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
        defaultElement.sendKeys(Keys.HOME);
        for (int index = 1; index <= 11; index++) {
            defaultElement.sendKeys(Keys.DELETE);
        }
        dateOfBirthElement.sendKeys(Keys.ENTER);
    }

    //Facem o metoda care sa completeze campul Subjects
    public void selectSubject() {
        WebElement selectSubjectImput = driver.findElement(By.id("subjectsInput"));
        selectSubjectImput.sendKeys("Accounting");
        selectSubjectImput.sendKeys(Keys.ENTER);

    }

    //Facem o metoda care sa completeze campurile de la Hobbies
    public void fillHobbies(String hobbies) {
        WebElement sportsHobbiesCheckboxElement = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
        WebElement readingHobbiesCheckboxElement = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']"));
        WebElement musicHobbiesCheckboxElement = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']"));
        List<WebElement> hobbiesListsElements = new ArrayList<>();
        hobbiesListsElements.add(sportsHobbiesCheckboxElement);
        hobbiesListsElements.add(readingHobbiesCheckboxElement);
        hobbiesListsElements.add(musicHobbiesCheckboxElement);
        for (int i = 0; i < hobbiesListsElements.size(); i++) {
            if (hobbiesListsElements.get(i).getText().equals(hobbies)) {
                hobbiesListsElements.get(i).click();
            }
        }
    }

    //Facem o metoda care sa completeze campul choose a file
    public void addThePictures() {
        String pictureFilePath = "src/test/resources/A.java";
        File file = new File(pictureFilePath);
        WebElement inputPictureElements = driver.findElement(By.cssSelector("#uploadPicture"));
        inputPictureElements.sendKeys(file.getAbsolutePath());
    }

    //Facem o metoda care sa completeze campul Current Adress
    public void fillCurrentAddress() {
        WebElement currentAddressElements = driver.findElement(By.id("currentAddress"));
        currentAddressElements.sendKeys("Str.Jepilor, Nr.10");
    }

    //Vom da scroll down in continuare
    //Facem o metoda sa selecteze Statul
    public void fillTheState() {
        WebElement theStateElements = driver.findElement(By.id("react-select-3-input"));
        theStateElements.sendKeys("NCR");
        theStateElements.sendKeys(Keys.ENTER);
    }

    //Facem o metoda sa selecteze Orasul
    public void fillTheCity() {
        WebElement theCityElements = driver.findElement(By.id("react-select-4-input"));
        theCityElements.sendKeys("Delhi");
        theCityElements.sendKeys(Keys.ENTER);
    }

    //Facem click pe submit
    public void clickOnSubmitButton() {
        WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
        submitButton.click();
    }
}
// De validat tabelul cu valori


