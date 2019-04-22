package nopageobjects.tests;

import com.epam.jdi.light.elements.composite.WebPage;
import org.testng.annotations.Test;

import static com.epam.jdi.light.elements.composite.WebPage.openUrl;
import static com.epam.jdi.light.ui.html.HtmlFactory.$;

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
        WebPage.openUrl("https://jdi-testing.github.io/jdi-light/");
        WebPage.getUrl(); // WebPage.getTitle();
        WebPage.back();   // WebPage.forward();
        WebPage.getHtml();
        WebPage.refresh();
    }
}
