package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {

    private static WebDriver driver;

    public static void initialize() {
    	System.setProperty("webdriver.edge.driver", "C:\\Users\\Koti\\Drivers\\edgedriver_win64\\msedgedriver.exe");
        driver = new EdgeDriver();      // Normal visible browser
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void quit() {
        if(driver != null){
            driver.quit();
        }
    }
}
