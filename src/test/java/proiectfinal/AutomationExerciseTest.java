package proiectfinal;

import org.testng.annotations.Test;

public class AutomationExerciseTest extends TestPage{
    @Test
    public void testSite() throws InterruptedException {
        FillFormPage fillFormPage = new FillFormPage(driver);
        fillFormPage.Cookies();
        fillFormPage.pressSignUpButton();

    }
}
