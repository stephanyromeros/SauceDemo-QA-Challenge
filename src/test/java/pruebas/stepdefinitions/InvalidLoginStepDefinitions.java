package pruebas.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pruebas.questions.LoginErrorMessage;
import pruebas.tasks.Login;
import pruebas.tasks.OpenSauceDemo;
import static org.hamcrest.Matchers.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class InvalidLoginStepDefinitions {

    @Before
    public void setTheStageForActors() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("the user opens the application")
    public void openApplication() {
        OnStage.theActorCalled("User").attemptsTo(OpenSauceDemo.page()
        );
    }

    @When("the user tries to log in with username {string} and password {string}")
    public void loginWithInvalidCredentials(String user, String pass) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.withCredentials(user, pass)
        );
    }

    @Then("the error message {string} should be displayed")
    public void verifyErrorMessage(String expected) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(LoginErrorMessage.text(), equalTo(expected))
        );
    }
}
