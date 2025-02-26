package net.PPE.Runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/checkbookActivation.feature",
        glue = "net.PPE.StepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class ActivateRunner {
}
