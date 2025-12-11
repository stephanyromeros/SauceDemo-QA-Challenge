package pruebas.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class LoginPage {

    public static final Target USERNAME =
            Target.the("username field").located(By.id("user-name"));

    public static final Target PASSWORD =
            Target.the("password field").located(By.id("password"));

    public static final Target LOGIN_BUTTON =
            Target.the("login button").located(By.id("login-button"));

    public static final Target ERROR_MESSAGE = Target.the("Error Message").located(By.cssSelector("h3[data-test='error']"));
}
