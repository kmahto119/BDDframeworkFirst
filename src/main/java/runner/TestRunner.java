package runner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./src/main/java/feature/login.feature",
		glue={"stepDefination"},
		format={"pretty","html:test-outout","json:json-output/cucumber.json","junit:junit-xml"},
		monochrome=true,
		strict=true,
		dryRun=false
		)
public class TestRunner {
	
	

}
