package Runner;


import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
import cucumber.runtime.StepDefinition;
import gherkin.formatter.model.Feature;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="C:\\Users\\heman\\IdeaProjects\\BDD\\src\\test\\resources\\Features\\Register.feature",
        glue = {"Stepdefinition"},
        format = {"pretty", "html:htmlReport","json:json/cucumber.json","junit:junit/cucumber.xml"}
)





public class TestRunner {
}
