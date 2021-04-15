package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Users\\Asus\\eclipse-workspace\\CucumberProject\\src\\main\\java\\Features\\loginTest.feature",
		glue = {"StepDefinition"}
		//format = {"pretty","html.test-outout"}
		)

public class LoginPage {
	

} 
