package pageobject;

import pageobject.uiobjects.example.site.SiteJdi;
import org.testng.annotations.BeforeSuite;

import static com.epam.jdi.light.logger.LogLevels.STEP;
import static com.epam.jdi.light.settings.WebSettings.logger;
import static com.epam.jdi.light.ui.html.PageFactory.initElements;

public interface TestsInit {
    @BeforeSuite(alwaysRun = true)
    static void setUp() {
        logger.setLogLevel(STEP);
        initElements(SiteJdi.class);
    }
}
