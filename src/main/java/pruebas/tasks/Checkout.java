package pruebas.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import pruebas.models.Customer;
import pruebas.userinterface.CartPage;
import pruebas.userinterface.CheckoutPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Checkout implements Task {

    private final Customer customer;

    public Checkout(Customer customer) {
        this.customer = customer;
    }

    public static Checkout with(Customer customer) {
        return new Checkout(customer);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(CartPage.CHECKOUT_BUTTON),
                WaitUntil.the(CheckoutPage.FIRST_NAME, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(customer.getFirstName()).into(CheckoutPage.FIRST_NAME),
                Enter.theValue(customer.getLastName()).into(CheckoutPage.LAST_NAME),
                Enter.theValue(customer.getZip()).into(CheckoutPage.ZIP_CODE),
                Click.on(CheckoutPage.CONTINUE_BUTTON),
                Click.on(CheckoutPage.FINISH_BUTTON)
        );
    }
}
