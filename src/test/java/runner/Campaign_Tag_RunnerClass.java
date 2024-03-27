package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		
		features= {"src\\test\\resources\\Application\\draftCompaign.feature"},
		glue= {"loginstep"},
		plugin= {"pretty"},
		tags="@Regression"
)




public class Campaign_Tag_RunnerClass extends AbstractTestNGCucumberTests
{

	
	
}
