package pruebas.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import pruebas.userinterface.ProductsPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddProductToCart  implements Task {

    private final String productName;

    public AddProductToCart(String productName) {
        this.productName = productName;
    }

    public static AddProductToCart named(String name) {
        return new AddProductToCart(name);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ProductsPage.PRODUCT_ADD_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ProductsPage.PRODUCT_ADD_BUTTON),
                Click.on(ProductsPage.CART_ICON)
        );
    }
}
