package pageobject.uiobjects.example.site.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.UI;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.WithText;
import com.epam.jdi.light.ui.html.common.Button;
import com.epam.jdi.light.ui.html.common.Link;
import com.epam.jdi.light.ui.html.common.TextField;

public class HomePage extends WebPage {
    @UI("img#user-icon") public static Link userIcon;
    @UI("#name") public static TextField name;
    @UI("#password") public static TextField password;
    @UI("#login-button") public static Button loginButton;
    @UI("//*[@class='sidebar-menu']//*[text()='Contact form']")
    public static Link menuContactForm;
}
