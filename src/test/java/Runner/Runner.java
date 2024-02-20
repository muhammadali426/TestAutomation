package Runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/java/formfeature/form1.feature",
/*@CucumberOptions(features={"src\\test\\java\\FEATURE\\businessPhone.feature",
"src\\test\\java\\FEATURE\\videoconferencing.feature","src\\test\\java\\FEATURE\\teamchat.feature",
"src\\test\\java\\FEATURE\\integration.feature","src\\test\\java\\FEATURE\\contactcenter.feature",
"src\\test\\java\\FEATURE\\api.feature","src\\test\\java\\FEATURE\\download.feature"},*/
glue="formDefinition",
 tags = "@ValidationTest",
dryRun = false,
monochrome = true,
//plugin = {"pretty" , "html: test-output"},

//plugin = {"pretty", "json:target/cucumber-reports/cucumber.json",
//		"html:target/cucumber-reports/cucumber.html", }

		plugin = {"pretty", "json:report/cucumber.json",
				"html:report/cucumber.html", }

		)
public class Runner {

}
