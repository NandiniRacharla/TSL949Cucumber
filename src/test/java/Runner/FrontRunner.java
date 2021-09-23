package Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/frontAcc.feature",
		glue="stepDefination",
		monochrome = true,
		dryRun  = false,
		plugin = {"pretty", "html:target/cucumber.html","json:target/JsonReport/report.json"})
public class FrontRunner {

}