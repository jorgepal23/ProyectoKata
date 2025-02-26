package net.PPE.StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.PPE.questions.ValidateWelcomePage;
import net.PPE.task.EnterThePageTask;
import net.PPE.task.EnterUserPassTask;
import net.PPE.task.OpenURLTask;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class LoginStepDefinitions {
    @Managed(driver = "MicrosoftEdge")
    WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.edgedriver().clearDriverCache().setup();
        setTheStage(new OnlineCast());
    }
    @Given("The user open the PPE URL")
    public void theUserOpenThePPEURL() {
        theActorCalled("User").wasAbleTo(
                OpenURLTask.openBrowser());
    }
    @Given("Enter the user and password and click to dominio button")
    public void enterTheUserAndPasswordAndClickToDominioButton() {
        theActorCalled("User").wasAbleTo(
                EnterUserPassTask.enterUserPass());
    }
    @When("The user click in the button Ingresar")
    public void TheUserClickInTheButtonIngresar(){
        theActorCalled("User").wasAbleTo(
                EnterThePageTask.enterThePage());
    }
    @Then("The user will be see the welcome page")
    public void theUserWillBeSeeTheWelcomePage() {
        theActorCalled("User").should(
                seeThat(ValidateWelcomePage.validate(), Matchers.equalTo(true)));
    }
    @After
    public void closeBrowser () {
        if (driver != null) {
            driver.quit();
        }
    }
}
