package automate.automate;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:\\Users\\LENOVO\\eclipse-workspace\\automate\\Feature",   // relative path to your .feature files
    glue = {"automate.automate"},   // package name where step definitions live
    plugin = {"pretty", "html:target/CucumberReport.html"},
    monochrome = true
)  
public class TestRunner {

}

