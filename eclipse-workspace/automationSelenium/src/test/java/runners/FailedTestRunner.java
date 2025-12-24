package runners;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "@target/rerun.txt", // <--- Note the @ symbol
    glue = "stepDefinitions",
    plugin = {
        "pretty",
        "html:target/cucumber-rerun-report.html"
        ,"rerun:target/rerun.txt"
    },
    monochrome = true
)
public class FailedTestRunner {
}
