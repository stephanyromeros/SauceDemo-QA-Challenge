package pruebas.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import pruebas.userinterface.ProductsPage;

public class ProductsPageVisible implements Question<Boolean> {

    public static ProductsPageVisible displayed() {
        return new ProductsPageVisible();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return ProductsPage.TITLE.resolveFor(actor).isVisible();
    }
}
