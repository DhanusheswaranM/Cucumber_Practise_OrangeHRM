package runnerFile;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = {"pretty" , "json:target/cucumber-Report/LoginOrangeHRMTestNGReport.json"}
				,features ="src/test/resources/com/features/LoginOrangeHRM.feature"
				,glue ="StepDefinitions"
		)
public class runnerTestNG extends AbstractTestNGCucumberTests{

}
