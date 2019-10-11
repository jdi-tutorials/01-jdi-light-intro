package pageobject.uiobjects.example.jdisite.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Link;
import com.epam.jdi.light.ui.html.elements.common.Text;

public class HomePage extends WebPage {
    @UI("img#user-icon") public static Link userIcon;
    @UI("#user-name") public static Text userName;
}
