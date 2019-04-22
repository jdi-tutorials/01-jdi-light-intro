package pageobject.tests;

import org.testng.annotations.Test;
import pageobject.TestsInit;

import static pageobject.uiobjects.example.site.SiteJdi.homePage;
import static pageobject.uiobjects.example.site.pages.HomePage.*;

public class PageObjectExample implements TestsInit {
    @Test
    public void loginTest() {
        homePage.open();
        userIcon.click();
        name.sendKeys("Roman");
        password.sendKeys("Jdi1234");
        loginButton.click();
        userName.assertThat().displayed();
    }
}
