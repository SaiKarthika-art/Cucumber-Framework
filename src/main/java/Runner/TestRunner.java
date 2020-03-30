package Runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src\\main\\java\\Features"
		,glue= {"stepDefinition"}
		,plugin= {"pretty","html:test-output"}
		,monochrome=true
		,dryRun=false
		,tags= {"@SmokeTest"}
		)

public class TestRunner {

	
}
