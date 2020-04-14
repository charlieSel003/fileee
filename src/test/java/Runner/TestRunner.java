package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Requirments1", glue = "steps", dryRun = true, plugin = { "pretty",
		"html:Folder name/report/cucumber" })
public class TestRunner {

}
