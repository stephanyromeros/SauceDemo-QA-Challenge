package pruebas.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import pruebas.userinterface.ProductsPage;

public class GoToCart implements Task {

    public static GoToCart now() {
        return new GoToCart();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductsPage.CART_ICON)
        );
    }
}
