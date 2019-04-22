package pageobject.uiobjects.example.jdisite;

import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import pageobject.uiobjects.example.jdisite.pages.HomePage;
import pageobject.uiobjects.example.jdisite.sections.LoginForm;

@JSite("https://jdi-testing.github.io/jdi-light/")
public class JDISite {
    @Url("/") public static HomePage homePage;
    public static LoginForm loginForm;
}
