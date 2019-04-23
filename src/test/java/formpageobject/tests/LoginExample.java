package formpageobject.tests;

import formpageobject.TestsInit;
import org.testng.annotations.Test;
import pageobject.uiobjects.example.jdisite.entities.User;

import static pageobject.uiobjects.example.jdisite.JDISite.loginForm;
import static pageobject.uiobjects.example.jdisite.pages.HomePage.userIcon;
import static pageobject.uiobjects.example.jdisite.pages.HomePage.userName;

public class LoginExample implements TestsInit {
    User ROMAN = new User().set(c -> {
        c.name = "Roman"; c.password = "Jdi1234";
    } );

    @Test
    public void loginTest() {
        userIcon.click();
        loginForm.loginAs(ROMAN);
        userName.is().displayed();
    }
}
