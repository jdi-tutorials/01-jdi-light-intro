package formpageobject;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pageobject.uiobjects.example.jdisite.JDISite;

import static com.epam.jdi.light.driver.WebDriverUtils.killAllSeleniumDrivers;
import static com.epam.jdi.light.elements.init.PageFactory.initElements;
import static pageobject.uiobjects.example.jdisite.JDISite.homePage;

public interface TestsInit {
    @BeforeSuite(alwaysRun = true)
    static void setUp() {
        initElements(JDISite.class);
        homePage.open();
    }
    @AfterSuite(alwaysRun = true)
    static void teardown() {
        killAllSeleniumDrivers();
    }
}
