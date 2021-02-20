package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Himanshu.Dubey\\eclipse-workspace\\CucumberBDDFramework\\src\\main\\java\\Features\\login.feature",
glue = {"StepDefinitions"},
format = {"pretty","html:test-output"},
dryRun=true)

public class RunnerTest {

}
