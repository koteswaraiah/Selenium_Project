package runners;

import org.testng.annotations.Test;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "Steps",
        plugin = {"pretty", "html:target/cucumber-report.html",
        		 "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"

}
)
@Test
public class TestRunner extends AbstractTestNGCucumberTests {
}