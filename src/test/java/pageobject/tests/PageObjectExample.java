package pageobject.tests;

import pageobject.TestsInit;
import org.testng.annotations.Test;

import static pageobject.uiobjects.example.site.SiteJdi.*;
import static pageobject.uiobjects.example.site.pages.HomePage.*;

public class PageObjectExample implements TestsInit {
    @Test
    public void openPage() {
        homePage.open();
        userIcon.click();
        name.sendKeys("epam");
        password.sendKeys("1234");
        loginButton.click();
        menuContactForm.click();
        contactPage.checkOpened();
    }
}
