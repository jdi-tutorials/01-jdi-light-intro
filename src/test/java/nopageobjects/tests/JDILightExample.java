package nopageobjects.tests;

import com.epam.jdi.light.elements.composite.WebPage;
import org.testng.annotations.Test;

import static com.epam.jdi.light.elements.composite.WebPage.*;
import static com.epam.jdi.light.ui.html.HtmlFactory.$;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class JDILightExample {
    @Test
    public void openJDITestSite() {
        openUrl("https://epam.github.io/JDI/index.html");
    }
    @Test
    public void loginAndOpenContactPage() {
        openUrl("https://jdi-testing.github.io/jdi-light/");
        $("img#user-icon").click();
        $("#name").sendKeys("epam");
        $("#password").sendKeys("1234");
        $("#login-button").click();
        $("#user-name").is().displayed();
    }

    @Test
    public void actionsWithPage() {
        WebPage.openUrl("https://epam.github.io/JDI/index.html");
        WebPage.getUrl();
        WebPage.getTitle();
        WebPage.back();
        WebPage.forward();
        WebPage.getHtml();
        WebPage.refresh();
    }
}
