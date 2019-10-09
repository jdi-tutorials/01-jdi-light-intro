package pageobject;

import org.testng.annotations.BeforeSuite;
import pageobject.uiobjects.example.site.SiteJdi;

import static com.epam.jdi.light.elements.init.PageFactory.initElements;

public interface TestsInit {
    @BeforeSuite(alwaysRun = true)
    static void setUp() {
        initElements(SiteJdi.class);
    }
}
