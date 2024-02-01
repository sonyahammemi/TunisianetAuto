package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features/DisqueSSD.feature",
		glue="TestSuites",
		plugin= {"pretty","html:target/cucumber-reprt.html"}
)
public class Runner {

}
