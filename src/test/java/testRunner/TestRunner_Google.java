package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = ".//Feature//google.feature",
  glue = "stepDefination",
dryRun = false,
monochrome = true,
        plugin = {
                "pretty",
                "html:testOutput/cucumber-reports.html",
                "json:testOutput/cucumber.json"
        })

public class TestRunner_Google
{
}