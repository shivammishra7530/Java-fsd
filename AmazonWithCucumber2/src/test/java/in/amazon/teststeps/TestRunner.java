

//You are given a project to demonstrate the use of Logical AND/OR in a scenario.

package in.amazon.teststeps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Features//buys_physics_book.feature",
		glue = "in.amazon.teststeps"
		
		//You are given a project to use comments and tags in a Cucumber scenario.
		
		//tags = "@TC_101 or @TC_102"
		//dryRun = true
		//tags = "@TC_102"
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
