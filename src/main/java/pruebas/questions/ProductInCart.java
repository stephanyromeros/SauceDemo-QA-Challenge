package pruebas.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import pruebas.userinterface.CartPage;

public class ProductInCart implements Question<String> {

    public static ProductInCart name() {
        return new ProductInCart();
    }

    @Override
    public String answeredBy(Actor actor) {
        return CartPage.PRODUCT_NAME.resolveFor(actor).getText();
    }
}
