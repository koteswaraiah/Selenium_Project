package stepDefinations;

import org.openqa.selenium.WebDriver;
import factory.DriverFactory;
import io.cucumber.java.Before;
import io.cucumber.java.After;

public class Hook {

    public static WebDriver driver;

    @Before
    public void setUp() {
        DriverFactory.initialize();       // Launch visible browser
        driver = DriverFactory.getDriver();
        System.out.println("Browser launched for scenario.");
    }

    @After
    public void tearDown() {
        DriverFactory.quit();             // Close browser after scenario
        System.out.println("Browser closed for scenario.");
    }
}
