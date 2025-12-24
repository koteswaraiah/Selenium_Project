package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)    
@CucumberOptions(
        features = "C:\\Users\\LENOVO\\eclipse-workspace\\automationSelenium\\Feature",// path of feature file
        glue = "stepDefinations", // package name of step definations
        tags = "@smoke or @regression", // tags present in above scenario line
        plugin = {"pretty", "html:target/Report.html"
        		,"rerun:target/rerun.txt"},
        monochrome = true
)    
public class TestRunner {

}
