package TestRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= ".//Features/Customers.feature",
		glue="StepDefinition",
		dryRun=false,
		monochrome=true,
		plugin={"pretty","json:target/cucumber-reports/reports1.json"}   //json format

		//	plugin={"pretty","html:target/cucumber-reports/reports1.html"}    html format

		// plugin={"pretty","junit:target/cucumber-reports/reports1.xml"}   

		)
public class Run {  

}
