package formpageobject.tests;

import formpageobject.TestsInit;
import org.testng.annotations.Test;
import pageobject.uiobjects.example.jdisite.entities.User;

import static pageobject.uiobjects.example.jdisite.JDISite.loginAs;
import static pageobject.uiobjects.example.jdisite.pages.HomePage.*;

public class LoginExample implements TestsInit {
    User ROMAN = new User().set(c -> {
        c.name = "epam";
        c.password = "1234";} );

    @Test
    public void fillContactTest() {
        loginAs(ROMAN);
        userName.is().displayed();
    }
}
