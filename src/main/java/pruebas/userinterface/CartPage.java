package pruebas.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class CartPage {

    public static final Target PRODUCT_NAME =
            Target.the("product name in cart").located(By.className("inventory_item_name"));

    public static final Target CHECKOUT_BUTTON =
            Target.the("checkout button").located(By.id("checkout"));
}

