package nopageobjects.tests;

import com.epam.jdi.light.elements.composite.WebPage;
import org.testng.annotations.Test;
import pageobject.uiobjects.example.jdisite.entities.ContactInfo;

import static com.epam.jdi.light.elements.composite.WebPage.openUrl;
import static com.epam.jdi.light.elements.init.UIFactory.*;
import static formpageobject.tests.LoginExample.ROMAN;

public class JDILightExample {
    @Test
    public void openJDITestSite() {
        openUrl("https://jdi-testing.github.io/jdi-light/");
    }
    @Test
    public void loginSimpleTest() {
        openUrl("https://jdi-testing.github.io/jdi-light/");
        $("img#user-icon").click();
        $("#name").sendKeys("Roman");
        $("#password").sendKeys("Jdi1234");
        $("#login-button").click();
        $("#user-name").is().displayed();
    }
    @Test
    public void actionsWithPage() {
        WebPage.getUrl(); // WebPage.getTitle();
        WebPage.back();   // WebPage.forward();
        WebPage.getHtml();
        WebPage.refresh();
    }
    @Test
    public void loginFormTest() {
        openUrl("/");
        $("img#user-icon").click();
        loginAs(ROMAN);
        $("#user-name").is().displayed();
    }

    public static ContactInfo SIMPLE_CONTACT = new ContactInfo().set(c -> {
        c.name = "Roman"; c.lastName = "Iovlev"; c.position = "ChiefQA";
        c.passportNumber = 4321; c.passportSeria = 123456;
        c.description = "JDI - awesome UI autoamtion tool"; }
    );
    @Test
    public void contactFormTest() {
        openUrl("/");
        $("img#user-icon").click();
        loginAs(ROMAN);
        openUrl("/contacts.html");
        form("form#contact-form", ContactInfo.class).submit(SIMPLE_CONTACT);
    }

}
