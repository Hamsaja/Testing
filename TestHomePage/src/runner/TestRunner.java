package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)//driver class
@CucumberOptions(features="features", glue="stepdef",dryRun=false,plugin= {"pretty","json:target/shoppersstop.json", "html:target/shoppersstop.html" })
public class TestRunner {

}
