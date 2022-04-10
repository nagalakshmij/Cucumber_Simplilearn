package stepDefs;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(

		plugin = {"html:target/html-cucumber","json:target/cucumber.json"},
		features = "src/test/java/features",
		//tags = {"@Sanity"},  to run one single Tag

		//tags = {"@Sanity,@Regression"}, //to run multiple tags using OR
		//tags = {"@Sanity or @Regression"}, //to run multiple tags using OR

		//tags = {"@Regression","@Rapid"}, //to run multiple tags using And
		//tags = {"@Regression and @Rapid"}, //to run multiple tags using And
		//tags = {"@Sanity or @Regression and @Rapid"},

		tags = {"@F_Login"},
		glue = {"stepDefs"}

		)

public class TestRunner
{
}
