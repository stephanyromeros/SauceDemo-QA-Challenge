package pruebas.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import pruebas.userinterface.CheckoutPage;

public class FinalMessage implements Question<String> {

    public static FinalMessage text() {
        return new FinalMessage();
    }

    @Override
    public String answeredBy(Actor actor) {
        return CheckoutPage.CONFIRMATION_MESSAGE.resolveFor(actor).getText();
    }
}
