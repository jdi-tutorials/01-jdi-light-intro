package pageobject.uiobjects.example.site;

import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import pageobject.uiobjects.example.site.pages.HomePage;

@JSite("https://epam.github.io/JDI/")
public class SiteJdi {
    @Url("/") public static HomePage homePage;
}
