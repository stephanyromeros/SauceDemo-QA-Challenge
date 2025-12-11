package pruebas.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class ProductsPage {
    public static final Target TITLE =
            Target.the("products title").locatedBy("/html/body/div/div/div/div[1]/div[2]/span");

    public static final Target PRODUCT_ADD_BUTTON =
            Target.the("add button for product")
                    .located(By.id("add-to-cart-sauce-labs-backpack"));

    public static final Target CART_ICON =
            Target.the("cart icon").located(By.className("shopping_cart_link"));
}
