package pageobject.uiobjects.example.jdisite.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.UI;
import com.epam.jdi.light.ui.html.common.Link;
import com.epam.jdi.light.ui.html.common.Text;

@Url("/")
public class HomePage extends WebPage {
    @UI("img#user-icon") public static Link userIcon;
    @UI("#user-name") public static Text userName;
}
