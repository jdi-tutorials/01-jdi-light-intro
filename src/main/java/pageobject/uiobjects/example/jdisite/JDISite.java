package pageobject.uiobjects.example.jdisite;

import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import pageobject.uiobjects.example.jdisite.entities.User;
import pageobject.uiobjects.example.jdisite.pages.HomePage;
import pageobject.uiobjects.example.jdisite.sections.LoginForm;

import static pageobject.uiobjects.example.jdisite.pages.HomePage.userIcon;

@JSite("https://epam.github.io/JDI/")
public class JDISite {
    public static HomePage homePage;
    public static LoginForm loginForm;

    public static void loginAs(User user) {
        userIcon.click();
        loginForm.loginAs(user);
    }
}
