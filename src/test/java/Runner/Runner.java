package Runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(
features="src/test/java/formfeature/form1.feature",
glue="formDefinition",
tags = "@ValidationTest",
plugin = {"json:target/cucumber.json", "pretty" }
		)
public class Runner {

}
