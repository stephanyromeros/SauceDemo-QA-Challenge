package pruebas.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pruebas.userinterface.LoginPage;

public class LoginErrorMessage implements Question<String> {

    public static LoginErrorMessage text() {
        return new LoginErrorMessage();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LoginPage.ERROR_MESSAGE).answeredBy(actor);
    }
}
