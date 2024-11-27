package training.pages;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    // variabila driver  va fi folosit in toate paginile pe care le creeam de acum inainte si
    // care vor mosteni BasePage-ul
    public WebDriver driver;

    //facem un constructor pentru initializarea driverelor

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    //facem o metoda abstracta pe care fiecare pagina trebuie sa o implementeze pt a verificara
    //daca pagina e incarcata corect

    abstract void isPageLoaded();

}
