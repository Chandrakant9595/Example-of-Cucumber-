package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/home/nadsoft/workspace/ExampleOfCucumberOne/src/main/java/feature/ExampleOfTH.feature",
		glue = {"stepDefination"},
		monochrome = true,
		format = {"pretty", "html:test-output/cucumber-report",
							"json:json-output/cucumber.json",
							"junit:junit-xml/cucumber.xml"},
		strict = true,	
		//tags = {"@RegressionTest"}, 
		//tags = {"@RegressionTest" , "@SmokeTes"}, //and
		//tags = {"@RegressionTest , @SmokeTes"}, //or
		//tags = {"~@RegressionTest" , "@SmokeTes"}, //ignore
		dryRun = false 
		)

public class ExampleOfTHRunner {

}
