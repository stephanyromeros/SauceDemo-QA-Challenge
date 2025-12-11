package pruebas.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pruebas.models.Customer;
import pruebas.questions.*;
import pruebas.tasks.*;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class PurchaseStepDefinitions {

    //Login

    @Given("the user opens the SauceDemo login page")
    public void openSauceDemoPage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User").attemptsTo(
                OpenSauceDemo.page()
        );
    }

    @When("the user logs in with username {string} and password {string}")
    public void login(String username, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.withCredentials(username, password));
    }

    @Then("the products page should be displayed")
    public void validateProductsPage() {
        OnStage.theActorInTheSpotlight().should(
                seeThat("The products page is visible", ProductsPageVisible.displayed(), is(true))
        );
    }

    //Cart Steps

    @Given("the user is logged in with username {string} and password {string}")
    public void userLoggedIn(String username, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.withCredentials(username, password)
        );
    }

    @When("the user adds the product {string} to the cart")
    public void addProductToCart(String product) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddProductToCart.named(product)
        );
    }

    @Then("the cart should contain the product {string}")
    public void validateProductInCart(String product) {
        OnStage.theActorInTheSpotlight().should(
                seeThat("Product in cart", ProductInCart.name(), containsString(product))
        );
    }

    //Checkout Steps

    @Given("the user has added the product {string} to the cart")
    public void userHasProductInCart(String product) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddProductToCart.named(product)
        );
    }

    @When("the user proceeds to checkout entering:")
    public void checkoutData(Map<String, String> userData) {

        OnStage.theActorInTheSpotlight().attemptsTo(
                Checkout.with(Customer.defaultCustomer())
        );
    }

    @Then("the user should see the confirmation message {string}")
    public void validateFinalMessage(String message) {
        OnStage.theActorInTheSpotlight().should(
                seeThat("Final confirmation", FinalMessage.text(), containsString(message))
        );
    }

}

