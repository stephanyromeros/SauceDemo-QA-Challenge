package pruebas.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class CheckoutPage {

    public static final Target FIRST_NAME =
            Target.the("first name field").located(By.id("first-name"));

    public static final Target LAST_NAME =
            Target.the("last name field").located(By.id("last-name"));

    public static final Target ZIP_CODE =
            Target.the("zip code field").located(By.id("postal-code"));

    public static final Target CONTINUE_BUTTON =
            Target.the("continue button").located(By.id("continue"));

    public static final Target FINISH_BUTTON =
            Target.the("finish button").located(By.id("finish"));

    public static final Target CONFIRMATION_MESSAGE =
            Target.the("confirmation message")
                    .locatedBy("/html/body/div/div/div/div[2]/h2");
}
