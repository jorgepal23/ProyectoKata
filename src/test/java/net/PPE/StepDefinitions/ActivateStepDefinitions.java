package net.PPE.StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.PPE.task.SelAccountTask;
import net.PPE.task.SelActFrameTask;
import net.PPE.task.SelActivateTask;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ActivateStepDefinitions {
    @Managed(driver = "MicrosoftEdge")
    WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.edgedriver().clearDriverCache().setup();
        setTheStage(new OnlineCast());
    }
    @Given("The user click the Checkbook activate button")
    public void theUserClickTheCheckbookActivateButton() {
        theActorCalled("User").wasAbleTo(
                SelActivateTask.selectActivate());
    }
    @When("The user select the basic dates and click in the button Search")
    public void theUserSelectTheBasicDatesAndClickInTheButtonSearch() {
        theActorCalled("User").wasAbleTo(
                SelActFrameTask.selActFrame());
    }
    @When("The user select the account select the checkbook and click in the button Activate")
    public void theUserSelectTheAccountSelectTheCheckbookAndClickInTheButtonActivate() {
        theActorCalled("User").wasAbleTo(
                SelAccountTask.selAccount());
    }
    @Then("The user will be see the message succesfull")
    public void theUserWillBeSeeTheMessageSuccesfull() {
    }
    @After
    public void closeBrowser () {
        if (driver != null) {
            driver.quit();
        }
    }
}
